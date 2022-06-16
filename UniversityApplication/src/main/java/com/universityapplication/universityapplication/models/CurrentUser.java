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
public class CurrentUser extends BaseUser {

    Connection conn = new MysqlConnection().mkDataBase();
    PreparedStatement pst2, pst3;
    ResultSet rs2, rs3;

    public CurrentUser(int ID, String NAME, String SURNAME, String EMAIL, int MAJOR, String PASSWORD) throws SQLException {
        super(ID, NAME, SURNAME, EMAIL, MAJOR, PASSWORD);
    }

    public ArrayList<BaseUser> getFriends() {
        ArrayList<BaseUser> friends = new ArrayList<>();

        try {
            pst2 = conn.prepareStatement("select * from friends where userId = ?");
            pst2.setInt(1, getId());
            rs2 = pst2.executeQuery();
            while (rs2.next()) {
                pst3 = conn.prepareStatement("select * from users where id = ?");
                pst3.setInt(1, rs2.getInt(2));
                rs3 = pst3.executeQuery();
                while (rs3.next()) {
                    friends.add(new BaseUser(rs3.getInt(1), rs3.getString(2), rs3.getString(3), rs3.getString(4), rs3.getInt(6), rs3.getString(5)));
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return friends;
    }
}
