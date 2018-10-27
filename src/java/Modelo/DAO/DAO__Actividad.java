package Modelo.DAO;

import Modelo.Actividad;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * 
 * @author 
 * @since 
 * 
 */

public class DAO__Actividad implements DAO<Actividad>{

    private final Connection conexion;
    
    public DAO__Actividad() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion = ConexionBD.getConexion();
    }
   
    @Override
    public List<Actividad> Obtener() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Crear(Actividad t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Actividad t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(Actividad t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
