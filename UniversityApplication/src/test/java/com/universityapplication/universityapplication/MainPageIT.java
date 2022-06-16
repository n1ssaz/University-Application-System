/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universityapplication.universityapplication;

import com.universityapplication.universityapplication.models.BaseUser;
import com.universityapplication.universityapplication.models.CurrentUser;
import com.universityapplication.universityapplication.models.Major;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
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
public class MainPageIT {
    
    public MainPageIT() {
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
    public void testMainPage() throws SQLException {
        CurrentUser currentuser = new CurrentUser(1, "Name","Surname","Email", 1,"Password");
        MainPage main = new MainPage(currentuser);
        assertNotNull(main.current);
        assertEquals(main.major.getId() ,1);
        for (BaseUser user : main.users){
            assertNotEquals(user.getId(), 1);
        }
        assertEquals(main.subject.size(), 7);
        DefaultListModel<String> users = main.showUsers(".........");
        assertEquals(users.size(), 0);
        DefaultListModel<String> subjects = main.showSubjects("");
        assertEquals(subjects.size(), 7);
    }
    
}
