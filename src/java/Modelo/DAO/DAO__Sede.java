package Modelo.DAO;

import Modelo.Sede;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author 
 * @since 
 * 
 */

public class DAO__Sede implements DAO<Sede>{

    private final Connection conexion;

    public DAO__Sede() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion = ConexionBD.getConexion();
    }
  
    @Override
    public List<Sede> Obtener() throws SQLException {
	 List<Sede> sedes = new ArrayList<>();
        String query = "SELECT * FROM Sede";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Sede em=new Sede(); 
                em.setCodigo(rs.getString("codigo"));
                sedes.add(em);
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Empleados");
            e.printStackTrace();
        }

        return sedes;
    }

    @Override
    public boolean Crear(Sede t) throws SQLException {
        boolean result=false;
        try {
            
            Connection connection = ConexionBD.getConexion();
            String query = " insert into Sede"  + " values (?)";
            PreparedStatement preparedStmt=null;
            try {
                preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, t.getCodigo());
                if (preparedStmt.executeUpdate() > 0){
                    result=true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO__Sede.class.getName()).log(Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
            Logger.getLogger(DAO__Sede.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DAO__Sede.class.getName()).log(Level.SEVERE, null, ex);
        }
         return result;
}

    @Override
    public boolean Actualizar(Sede t) throws SQLException {
	 boolean result=false;
        try {
           
            Connection connection = ConexionBD.getConexion();
            String query =
                    "update Sede set codigo = ? where codigo = ?";
            PreparedStatement preparedStmt=null;
            try {
                preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, t.getCodigo());
                preparedStmt.setString(2, t.getCodigo());
                
                if (preparedStmt.executeUpdate() > 0){
                    result=true;
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        } catch (ClassNotFoundException ex) {
		Logger.getLogger(DAO__Sede.class.getName()).log(Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
            Logger.getLogger(DAO__Sede.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DAO__Sede.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public boolean Eliminar(Sede t) throws SQLException {
	 boolean result=false;
        try {
            
             Connection connection = ConexionBD.getConexion();
             String query = "delete from Persona where cedula = ?";
             PreparedStatement preparedStmt=null;
             try {
                 preparedStmt = connection.prepareStatement(query);
                 preparedStmt.setString(1, t.getCodigo());
                 result= preparedStmt.execute();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
             } catch (ClassNotFoundException ex) {
	    Logger.getLogger(DAO__Sede.class.getName()).log(Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
            Logger.getLogger(DAO__Sede.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DAO__Sede.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result; 
}
    
}
