package Modelo.DAO;

import Modelo.Coordinador;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * 
 * @author 
 * @since 
 * 
 */

public class DAO__Coordinador implements DAO<Coordinador> {

    private final Connection conexion;

    public DAO__Coordinador() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion = ConexionBD.getConexion();
    }
    
    
    @Override
    public List<Coordinador> Obtener() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Crear(Coordinador t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Coordinador t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(Coordinador t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
