package model;

import java.sql.*;

/**
 * Created by Pulkit.singh on 1/8/2015.
 */
public class UserRegister {

    public void register(String username,String password) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "Jdbc:mysql://localhost:3306/test";
        String query = "INSERT into USERS VALUES ('" + username + "','" + password + "')";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement st = con.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
