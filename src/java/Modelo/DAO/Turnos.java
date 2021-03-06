/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Empleado;
import com.sun.faces.util.CollectionsUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kathe
 */
public class Turnos {

    private final Connection conexion;
    
    public Turnos() throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
        conexion = ConexionBD.getConexion();
    }
    
    
    
    public List<Empleado> TenerTurnos(String sede) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        HashMap<String,String> turnos1= new HashMap<>();
        turnos1.put("A", "Mañana");turnos1.put("B", "Tarde1");turnos1.put("C", "Tarde2");turnos1.put("D", "Noche");
        List<Empleado> turnos = null;
        String query = "SELECT correo,nombre,Turno FROM Empleado WHERE Sede1='" + sede + "' ORDER BY Turno";
        Connection connection = ConexionBD.getConexion();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            String nombre = null, turno = null, correo = null;
            while (rs.next()) {
                if (turnos == null) {
                    turnos = new ArrayList<Empleado>();
                }
                
                Empleado registro = new Empleado();
                correo = rs.getString("correo");
                registro.setCorreo(correo);                
                nombre = rs.getString("nombre");
                registro.setNombre(nombre);                
                turno = rs.getString("Turno");
                registro.setTurno(turnos1.get(turno));
                turnos.add(registro);
            }
            st.close();
            
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        
        return turnos;
    }
    
    public boolean InsertarTurnos(List<Empleado> turnos) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        boolean result = false;        
        Connection connection = ConexionBD.getConexion();
        for (int i = 0; i < turnos.size(); i++) {
            String query
                    = "UPDATE Empleado SET Turno=? where correo = ?";
            PreparedStatement preparedStmt = null;
            try {
                preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, turnos.get(i).getTurno());
                preparedStmt.setString(2, turnos.get(i).getCorreo());
                
                if (preparedStmt.executeUpdate() > 0) {
                    result = true;
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        }
        
        return result;
    }
    
    public String getFechas() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        String dia=null;
        String query = "SELECT  DAYNAME(NOW()) AS Dia";
        Connection connection = ConexionBD.getConexion();
        Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
        
            dia = null;
            dia = rs.getString("Dia");
        }
            return dia;
    }
    
}
