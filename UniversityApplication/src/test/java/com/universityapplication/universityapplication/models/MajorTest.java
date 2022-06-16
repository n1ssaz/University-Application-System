/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universityapplication.universityapplication.models;

import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexa
 */
public class MajorTest {
    Major major;
    
    public MajorTest() throws SQLException {
        major = new Major(1, "Finance");
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

    /**
     * Test of getId method, of class Major.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = major.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Major.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Finance";
        String result = major.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMajorSubjects method, of class Major.
     */
    @Test
    public void testGetMajorSubjects() {
        System.out.println("getMajorSubjects");
        int expResult = 7; //a major has initially 7 subjects
        int result = major.getMajorSubjects().size();
        assertEquals(expResult, result);
    }
    
        @Test
    public void testMajorById() throws SQLException {
        System.out.println("MajorById");
        Major m = new Major(2);
        int expId = 2;
        int resId = m.getId();
        assertEquals(expId, resId);
        Assertions.assertNull(m.getName());
    }
}
