/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universityapplication.universityapplication.models;

/**
 *
 * @author Alexa
 */
public class Comment {
    private int id;
    private String username;
    private String comment;
    
    public Comment ( int id, String username, String comment){
        this.username = username;
        this.comment = comment;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }

}
