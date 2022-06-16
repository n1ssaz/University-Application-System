package com.universityapplication.universityapplication;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlConnection {
    public Connection con;
    String url ="jdbc:mysql://localhost:3306/universityapplication";
    String user = "root";
    String pass = "";
    
    public Connection mkDataBase() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConnection.class.getName()).log(Level.SEVERE, null, ex);
     
        }
        return con;
    }
 
}