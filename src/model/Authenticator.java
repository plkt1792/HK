package model;

/**
 * Created by Pulkit.singh on 1/7/2015.
 */

import java.sql.*;

public class Authenticator {


    public boolean authenticate(String username, String password)  {
        String query = "Select * from USERS where uname='"+username+"' AND pwd='"+password+"'";
        try {
            Connection con = getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
                return true;
            else
                return false;
        }catch (Exception e){
            return false;
        }
    }

    public boolean checkUsername(String username) {
        String query="Select * from USERS where uname='"+username+"'";
        try {
            Connection con = getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
                return true;
            else
                return false;
        }catch (Exception e){
            return false;
        }
    }
    private static Connection getConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url="Jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root";
        Class.forName(driver);
        return DriverManager.getConnection(url, username, password);
    }
}
