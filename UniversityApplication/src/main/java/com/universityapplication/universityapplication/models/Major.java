/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universityapplication.universityapplication.models;

import com.universityapplication.universityapplication.MysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alexa
 */
public class Major {
    private int id;
    private String name;
    
    Connection conn = new MysqlConnection().mkDataBase();
    PreparedStatement pst;
    ResultSet rs;
    
    public Major (int id)throws SQLException {
        this.id= id;
    }

    public Major(int id, String name)throws SQLException {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Subject> getMajorSubjects() {
        ArrayList<Subject> subjects = new ArrayList<>();
        try {
            pst = conn.prepareStatement("select * from subjects where majorId = ?");
            pst.setInt(1, getId());
            rs = pst.executeQuery();
            while (rs.next()) {
                subjects.add(new Subject(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return subjects;
    }
}
