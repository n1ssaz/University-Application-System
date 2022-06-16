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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexa
 */
public class SubjectIT {
    Subject subject;
    
    public SubjectIT() throws SQLException {
        subject = new Subject(1, "THU 10:00","Lab 1", 1, "Professor 1", "Finance 1");
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
     * Test of getId method, of class Subject.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = subject.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTime method, of class Subject.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        String expResult = "THU 10:00";
        String result = subject.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlace method, of class Subject.
     */
    @Test
    public void testGetPlace() {
        System.out.println("getPlace");
        String expResult = "Lab 1";
        String result = subject.getPlace();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMajorId method, of class Subject.
     */
    @Test
    public void testGetMajorId() {
        System.out.println("getMajorId");
        int expResult = 1;
        int result = subject.getMajorId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProfessor method, of class Subject.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        String expResult = "Professor 1";
        String result = subject.getProfessor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Subject.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Finance 1";
        String result = subject.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSubjectUsers method, of class Subject.
     */
    @Test
    public void testGetSubjectUsers() throws SQLException {
        System.out.println("getSubjectUsers");
        int expResult = 0;
        Subject sub = new Subject (100, "THU 10:00","Lab 1", 1, "Professor 1", "Finance 1" );
        int result = sub.getSubjectUsers().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSubjectComments method, of class Subject.
     */
    @Test
    public void testGetSubjectComments() throws SQLException {
        System.out.println("getSubjectComments");
        int expResult = 1;
        Subject sub = new Subject (100, "THU 10:00","Lab 1", 1, "Professor 1", "Finance 1" );
        int result = subject.getSubjectComments().size();
        assertNotEquals(expResult, result);
    }
    
}
