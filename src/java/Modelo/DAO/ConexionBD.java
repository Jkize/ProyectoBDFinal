package Modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * @since 
 * 
 */

public class ConexionBD {
    
    private static Connection cn = null;
    private static String URLBD = "jdbc:mysql://localhost:3306/ProyectoBD";
    private static String usuario = "root";
    private static String contrasena = "";

    public static Connection getConexion() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        if (cn == null) {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection(URLBD, usuario, contrasena);
        }

        return cn;
    }

    public static void Desconectar() throws SQLException {
        cn.close();
        cn = null;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        cn = ConexionBD.getConexion();
        if (cn != null) {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
    }
    
}


class TestConexionBD {

    private static Connection con;

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        con = ConexionBD.getConexion();
        if (con != null) {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
    }
}
    

