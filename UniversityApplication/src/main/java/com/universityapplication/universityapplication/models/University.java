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
public class University {
    Connection conn = new MysqlConnection().mkDataBase();
    PreparedStatement pst;
    ResultSet rs;

    public University() throws SQLException {

    }

    public ArrayList<Major> getMajors() {
        ArrayList<Major> majors = new ArrayList<>();
        try {
            pst = conn.prepareStatement("select * from major");
            rs = pst.executeQuery();
            while (rs.next()) {
                majors.add(new Major(rs.getInt(1), rs.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return majors;
    }
    
    public ArrayList<BaseUser> getOtherStudents(int id) {
        ArrayList<BaseUser> users = new ArrayList<>();
        try {
            pst = conn.prepareStatement("select * from users where id <> ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                users.add(new BaseUser(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(6), rs.getString(5)));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return users;
    }
}
