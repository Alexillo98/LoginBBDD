package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserRepository {
    public static java.sql.Connection con;

    public UserRepository() throws SQLException {
        Conection c = new Conection();
        con = c.getConexion();

    }

    public static void getUser() throws SQLException {
        String sql = "SELECT * FROM usuario";
        PreparedStatement pst;
        ResultSet rs;
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        System.out.println("ID:" + rs.getString("name") +" CONTRASEÑA: "+ rs.getString("password"));
    }

    public static void insertUser() throws SQLException {
        Scanner escaner = new Scanner(System.in);

        System.out.println("USER: ");
        String user = escaner.nextLine();
        System.out.println("PASSWORD: ");
        String pass = escaner.nextLine();


        PreparedStatement pst;

        String sql = "INSERT INTO usuario (name,password) VALUES(?,?)";
        pst = con.prepareStatement(sql);
        pst.setString(1, user);
        pst.setString(2, pass);
        pst.executeUpdate();
    }
}
