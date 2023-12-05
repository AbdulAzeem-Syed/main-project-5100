/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Wajid
 */
public class adminPanel extends javax.swing.JPanel {

    /**
     * Creates new form adminPanel
     */
    private JPanel loginPanel;
    public adminPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminSplitPane = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        adminLabel = new javax.swing.JLabel();
        reportsButton = new javax.swing.JButton();
        booksButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        adminHomeButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(142, 199, 61));

        adminSplitPane.setBackground(new java.awt.Color(153, 255, 153));
        adminSplitPane.setDividerSize(1);
        adminSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPanel.setBackground(new java.awt.Color(204, 255, 204));

        adminLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        adminLabel.setText("ADMIN PANEL");

        reportsButton.setText("Reports");
        reportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });

        booksButton.setText("Books");
        booksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        adminHomeButton.setText("Admin Home");
        adminHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(booksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(adminLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(adminLabel)
                .addGap(18, 18, 18)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminHomeButton)
                    .addComponent(reportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        adminSplitPane.setTopComponent(topPanel);

        bottomPanel.setBackground(new java.awt.Color(204, 255, 204));
        bottomPanel.setMinimumSize(new java.awt.Dimension(700, 400));
        bottomPanel.setLayout(new java.awt.CardLayout());
        adminSplitPane.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void booksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksButtonActionPerformed
        // TODO add your handling code here:
        adminBooksPanel newadminBooksPanel = new adminBooksPanel(bottomPanel);
        bottomPanel.add(newadminBooksPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_booksButtonActionPerformed

    private void reportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButtonActionPerformed
        // TODO add your handling code here:
        adminReportsPanel newadReportsPanel = new adminReportsPanel(bottomPanel);
        bottomPanel.add(newadReportsPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_reportsButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setContentPane(loginPanel);
        topFrame.invalidate();
        topFrame.validate();
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void adminHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminHomeButtonActionPerformed
        // TODO add your handling code here:
        adminHomePanel newadminHomePanel = new adminHomePanel(bottomPanel);
        bottomPanel.add(newadminHomePanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_adminHomeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminHomeButton;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JSplitPane adminSplitPane;
    private javax.swing.JButton booksButton;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton reportsButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
