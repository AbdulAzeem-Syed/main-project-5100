/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.User;
import Util.UserJDBConnector;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author amer
 */
public class LibrarianPanel extends javax.swing.JPanel {

    /**
     * Creates new form LibrarianPanel
     */   
//    private ArrayList<User> users;
//    private User selectedUser;
    private JPanel loginPanel;
    public LibrarianPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
        initComponents();
       // populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        searchBookButton = new javax.swing.JButton();
        searchUserButton = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();

        jSplitPane1.setDividerLocation(95);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPanel.setBackground(new java.awt.Color(204, 255, 204));

        searchBookButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchBookButton.setText("Search Book");
        searchBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookButtonActionPerformed(evt);
            }
        });

        searchUserButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchUserButton.setText("Search User");
        searchUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserButtonActionPerformed(evt);
            }
        });

        bookButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookButton.setText("Books Borrowed");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Librarian");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(searchBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(searchUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(bookButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBookButton)
                    .addComponent(searchUserButton)
                    .addComponent(bookButton)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        jSplitPane1.setTopComponent(topPanel);

        bottomPanel.setBackground(new java.awt.Color(204, 255, 204));
        bottomPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserButtonActionPerformed
        // TODO add your handling code here:
        SearchUserJPanel newViewPanel = new SearchUserJPanel(bottomPanel);
        bottomPanel.add(newViewPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_searchUserButtonActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
        BorrowBookInfo newViewPanel = new BorrowBookInfo(bottomPanel);
        bottomPanel.add(newViewPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_bookButtonActionPerformed

    private void searchBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookButtonActionPerformed
        // TODO add your handling code here:
        SearchBookPanel newViewPanel = new SearchBookPanel(bottomPanel);
        bottomPanel.add(newViewPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_searchBookButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setContentPane(loginPanel);
        topFrame.invalidate();
        topFrame.validate();
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookButton;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton searchBookButton;
    private javax.swing.JButton searchUserButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
