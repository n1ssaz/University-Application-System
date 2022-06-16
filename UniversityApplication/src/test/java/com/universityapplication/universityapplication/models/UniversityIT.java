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
public class UniversityIT {

    University uni;

    public UniversityIT() throws SQLException {
        uni = new University();
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
     * Test of getMajors method, of class University.
     */
    @Test
    public void testGetMajors() {
        System.out.println("getMajors");
        int expResult = 3; //initially 3 majors
        int result = uni.getMajors().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOtherStudents method, of class University.
     */
    @Test
    public void testGetOtherStudents() {
        System.out.println("getOtherStudents");
        System.out.println("This test should have at least 1 registered user");
        int id = 1;
        ArrayList<BaseUser> result = uni.getOtherStudents(id);
        for (BaseUser user : result) {
            assertNotEquals(user.getId(), result);
        }
    }

}
