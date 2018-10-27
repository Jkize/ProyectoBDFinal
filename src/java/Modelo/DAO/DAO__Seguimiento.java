package Modelo.DAO;

import Modelo.Seguimiento;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * 
 * @author 
 * @since 
 * 
 */

public class DAO__Seguimiento implements DAO<Seguimiento>{

    private final Connection conexion;

    public DAO__Seguimiento() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion = ConexionBD.getConexion();
    }
    
    @Override
    public List<Seguimiento> Obtener() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Crear(Seguimiento t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Seguimiento t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(Seguimiento t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
