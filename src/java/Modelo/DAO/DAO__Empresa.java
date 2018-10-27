package Modelo.DAO;

import Modelo.Empresa;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * 
 * @author 
 * @since 
 * 
 */
public class DAO__Empresa implements DAO<Empresa>{

    private final Connection conexion;

    public DAO__Empresa() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion = ConexionBD.getConexion();
    }
    
    @Override
    public List<Empresa> Obtener() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Crear(Empresa t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Empresa t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(Empresa t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
