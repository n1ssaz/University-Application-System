/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universityapplication.universityapplication.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexa
 */
public class CurrentUserIT {
    PreparedStatement pst;
    ResultSet rs;
    CurrentUser currentuser;
    
    public CurrentUserIT() throws SQLException {
        currentuser = new CurrentUser(1, "Name","Surname","Email", 1,"Password");
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetEmail() {
          System.out.println("getEmail");
        String expResult = "Email";
        String result = currentuser.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMajor() {
         System.out.println("getMajor");
        int expResult = 1;
        int result = currentuser.getMajor();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPassword() {
          System.out.println("getPassword");
        String expResult = "Password";
        String result = currentuser.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFullname() {
          System.out.println("getFullname");
        String expResult = "Name Surname";
        String result = currentuser.getFullname();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetInitials() {
        System.out.println("getInitials");
        String expResult = "N S";
        String result = currentuser.getInitials();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUserSubjects() throws SQLException {
       pst = currentuser.conn.prepareStatement("INSERT INTO `usersubject` (`userId`, `subjectId`) VALUES (?, ?);");
       pst.setInt(1, currentuser.getId());
       pst.setInt(2, 3);
       pst.execute();
       int result = currentuser.getUserSubjects().size();
       assertNotEquals(0,result);
       currentuser.conn.close();
     
    }

    @Test
    public void testGetFriends() {
        System.out.println("getFriends");
        int id = currentuser.getId();
        assertEquals(id, 1);
        ArrayList<BaseUser> result = currentuser.getFriends();
        for (BaseUser friend : result) {
            assertNotEquals(friend.getId(), id);
        }
    }
    
}
