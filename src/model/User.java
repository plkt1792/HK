package model;

/**
 * Created by Pulkit.singh on 1/7/2015.
 */

import java.sql.*;

public class User {
    private String username;
    private String password;

    public User(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

}
