/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universityapplication.universityapplication;

import com.universityapplication.universityapplication.models.CurrentUser;
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
public class ProfileViewIT {
    ProfileView view;
    public ProfileViewIT() throws SQLException {
        CurrentUser current = new CurrentUser(1, "Name","Surname","Email", 1,"Password");
        view = new ProfileView(current, "Finance");
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
    public void testProperties(){
        assertEquals(view.majorName, "Finance");
        assertNotNull(view.currentuser);
    }

    /**
     * Test of populateFriends method, of class ProfileView.
     */
    @Test
    public void testPopulateFriends() {
        System.out.println("populateFriends");
        DefaultListModel<String> friends = view.populateFriends();
        assertNotNull(friends);
    }

    /**
     * Test of populateSubjects method, of class ProfileView.
     */
    @Test
    public void testPopulateSubjects() {
        System.out.println("populateSubjects");
         DefaultListModel<String> subjects = view.populateSubjects();
         assertNotNull(subjects);
    }

    /**
     * Test of EnableTextFields method, of class ProfileView.
     */
    @Test
    public void testEnableTextFields() {
        System.out.println("EnableTextFields");
        boolean enabled = false;
        boolean result = view.EnableTextFields(enabled);
        
        assertFalse(result);
    }
    
}
