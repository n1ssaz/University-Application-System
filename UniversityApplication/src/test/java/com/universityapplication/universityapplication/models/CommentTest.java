/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universityapplication.universityapplication.models;

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
public class CommentTest {

    Comment comment;

    public CommentTest() {
         comment = new Comment(1, "User", "Comment");
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
     * Test of getId method, of class Comment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = comment.getId();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "User";
        String result = comment.getUsername();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        String expResult = "Comment";
        String result = comment.getComment();
        assertEquals(expResult, result);
    }
}
