package login;

import java.sql.SQLException;

public class Conection  {
    private static java.sql.Connection conexion;

    public Conection() throws SQLException {
        String host = "jdbc:sqlite:src/main/resources/usuarios.sqlite";
        conexion = java.sql.DriverManager.getConnection(host);
    }

    public java.sql.Connection getConexion() {
        return conexion;
    }
}
