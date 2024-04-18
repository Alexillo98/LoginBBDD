package login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login{
    java.sql.Connection con;

    public Login() throws SQLException {
        Conection c = new Conection();
        con = c.getConexion();

        UserRepository.getUser();
    }
}
