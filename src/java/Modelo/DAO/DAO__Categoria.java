package Modelo.DAO;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author @since
 *
 */

public class DAO__Categoria implements DAO<Categoria> {

    private final Connection conexion;

    public DAO__Categoria() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion = ConexionBD.getConexion();
    }

    @Override
    public List<Categoria> Obtener() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Crear(Categoria t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Categoria t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(Categoria t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
