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
public class Subject {

    private int id;
    private String time;
    private String place;
    private int majorId;
    private String professor;
    private String name;

    Connection conn = new MysqlConnection().mkDataBase();
    PreparedStatement pst, pst1, pst2;
    ResultSet rs, rs1, rs2;

    public Subject(int id, String time, String place, int majorId, String professor, String name) throws SQLException {
        this.id = id;
        this.time = time;
        this.place = place;
        this.majorId = majorId;
        this.professor = professor;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    public int getMajorId() {
        return majorId;
    }

    public String getProfessor() {
        return professor;
    }

    public String getName() {
        return name;
    }

    public ArrayList<BaseUser> getSubjectUsers() {
        ArrayList<BaseUser> users = new ArrayList<>();
        try {
            pst = conn.prepareStatement("select * from usersubject where subjectId = ?");
            pst.setInt(1, getId());
            rs = pst.executeQuery();
            while (rs.next()) {
                pst1 = conn.prepareStatement("select * from users where id = ?");
                pst1.setInt(1, rs.getInt(1));
                rs1 = pst1.executeQuery();
                while (rs1.next()) {
                    users.add(new BaseUser(rs1.getInt(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getInt(6), rs1.getString(5)));
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return users;
    }

    public ArrayList<Comment> getSubjectComments() {
        ArrayList<Comment> comments = new ArrayList<>();
        try {
            pst2 = conn.prepareStatement("select * from comment where subjectId = ?");
            pst2.setInt(1, getId());
            rs2 = pst2.executeQuery();
            while (rs2.next()) {
                comments.add(new Comment(rs2.getInt(1), rs2.getString(3), rs2.getString(2)));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return comments;
    }
}
