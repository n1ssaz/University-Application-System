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
public class BaseUser {

    private int id;
    private String name;
    private String surname;
    private String email;
    private int major;
    private String password;

    Connection conn = new MysqlConnection().mkDataBase();
    PreparedStatement pst, pst1;
    ResultSet rs, rs1;

    public BaseUser(int id, String name, String surname, String email, int major, String password) throws SQLException {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.major = major;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getMajor() {
        return major;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return getName() + " " + getSurname();
    }

    public String getInitials() {
        return getName().charAt(0) + " " + getSurname().charAt(0);
    }

    public ArrayList<Subject> getUserSubjects() {
        ArrayList<Subject> subjects = new ArrayList<>();
        try {
            pst = conn.prepareStatement("select * from usersubject where userId = ?");
            pst.setInt(1, getId());
            rs = pst.executeQuery();
            while (rs.next()) {
                pst1 = conn.prepareStatement("select * from subjects where id = ?");
                pst1.setInt(1, rs.getInt(2));
                rs1 = pst1.executeQuery();
                while (rs1.next()) {
                    subjects.add(new Subject(rs1.getInt(1), rs1.getString(2), rs1.getString(3), rs1.getInt(4), rs1.getString(5), rs1.getString(6)));
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return subjects;
    }
}
