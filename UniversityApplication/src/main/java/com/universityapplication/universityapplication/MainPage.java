/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universityapplication.universityapplication;

import com.universityapplication.universityapplication.models.BaseUser;
import com.universityapplication.universityapplication.models.CurrentUser;
import com.universityapplication.universityapplication.models.Major;
import com.universityapplication.universityapplication.models.Subject;
import com.universityapplication.universityapplication.models.University;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Alexa
 */
public class MainPage extends javax.swing.JFrame {
    Connection conn = new MysqlConnection().mkDataBase();
    PreparedStatement pst, pst1;
    ResultSet rs, rs1;
    University uni = new University();

    ArrayList<BaseUser> users;
    ArrayList<BaseUser> friends;
    ArrayList<Subject> subject;
    StudentView studentView;
    SubjectView subjectView;
    CurrentUser current;
    Major major;

    public MainPage(CurrentUser currentuser) throws SQLException {
        this.current = currentuser;
        this.major = new Major(currentuser.getMajor());
        initComponents();
        this.users = uni.getOtherStudents(currentuser.getId());
        this.friends = currentuser.getFriends();
        showUsers("");
        this.subject = major.getMajorSubjects();
        showSubjects("");
        username.setText(currentuser.getInitials());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchStudents = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchSubjects = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        usersList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        subjectsList = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        viewProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search students");

        searchStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentsActionPerformed(evt);
            }
        });
        searchStudents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchStudentsKeyTyped(evt);
            }
        });

        jLabel2.setText("Search subjets");

        searchSubjects.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchSubjectsKeyTyped(evt);
            }
        });

        username.setText("jLabel4");

        logout.setText("Sign out");
        logout.setActionCommand("");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        usersList.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jList2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jList2KeyTyped(evt);
            }
        });
        subjectsList.setViewportView(jList2);

        viewProfile.setText("Profile");
        viewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usersList, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(subjectsList, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(viewProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(searchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(username)
                    .addComponent(logout))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usersList, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(subjectsList)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(viewProfile)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentsActionPerformed
    }//GEN-LAST:event_searchStudentsActionPerformed

    private void searchStudentsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchStudentsKeyTyped
        showUsers(searchStudents.getText());
    }//GEN-LAST:event_searchStudentsKeyTyped

    private void jList2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList2KeyTyped

    }//GEN-LAST:event_jList2KeyTyped

    private void searchSubjectsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchSubjectsKeyTyped
        showSubjects(searchSubjects.getText());
    }//GEN-LAST:event_searchSubjectsKeyTyped

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int index = jList1.locationToIndex(evt.getPoint());
        for (BaseUser user : users) {
            if (jList1.getModel().getElementAt(index).contains(user.getFullname())) {
                try {
                    boolean friend = jList1.getModel().getElementAt(index).contains("friend");
                    studentView = new StudentView(current, user, friend);
                    studentView.setVisible(true);
                    this.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        int index = jList2.locationToIndex(evt.getPoint());
        for (Subject sub : subject) {
            if (jList2.getModel().getElementAt(index).equals(sub.getName())) {
                try {
                    boolean exist = false;
                    for (Subject el : current.getUserSubjects()) {
                        if (el.getId() == sub.getId()) {
                            exist = true;
                            break;
                        }
                    }
                    subjectView = new SubjectView(current, sub, exist);
                    subjectView.setVisible(true);
                    this.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jList2MouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login login;
        try {
            login = new Login();
            login.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(StudentView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileActionPerformed
        ProfileView profile;
        try {
            profile = new ProfileView(current, major.getName());
            this.dispose();
            profile.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_viewProfileActionPerformed

    public DefaultListModel<String> showUsers(String value) {
        DefaultListModel<String> modelUsers = new DefaultListModel<>();
        DefaultListModel<String> model = new DefaultListModel<>();
        for (BaseUser user : users) {
            String friend = "";
            for (BaseUser el : friends) {
                if (el.getId() == user.getId()) {
                    friend = "(friend)";
                    break;
                }
            }

            model.addElement(user.getFullname() + " " + friend);
        }
        for (int i = 0; i < model.size(); i++) {
            if (model.get(i).toLowerCase().contains(value.toLowerCase())) {
                modelUsers.addElement(model.get(i));
            }
        }
        jList1.setModel(modelUsers);
        return modelUsers;
    }

    public DefaultListModel<String>  showSubjects(String value) {
        DefaultListModel<String> modelSubjects = new DefaultListModel<>();
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Subject sub : subject) {
            model.addElement(sub.getName());
        }

        for (int i = 0; i < model.size(); i++) {
            if (model.get(i).toLowerCase().contains(value.toLowerCase())) {
                modelSubjects.addElement(model.get(i));
            }
        }
        jList2.setModel(modelSubjects);
        return modelSubjects;
    }
    ;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField searchStudents;
    private javax.swing.JTextField searchSubjects;
    private javax.swing.JScrollPane subjectsList;
    private javax.swing.JLabel username;
    private javax.swing.JScrollPane usersList;
    private javax.swing.JButton viewProfile;
    // End of variables declaration//GEN-END:variables
}
