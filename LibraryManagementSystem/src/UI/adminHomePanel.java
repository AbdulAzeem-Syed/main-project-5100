/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Util.BookJDBConnector;
import javax.swing.JPanel;

/**
 *
 * @author Wajid
 */
public class adminHomePanel extends javax.swing.JPanel {

    /**
     * Creates new form adminHomePanel
     */
    public adminHomePanel(JPanel bottomPanel) {
        initComponents();
        var data = BookJDBConnector.getData();
        bookLabel.setText(data.get("books").toString());
        userLabel.setText(data.get("users").toString());
        reportLabel.setText(data.get("reports").toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalUsersLabel = new javax.swing.JLabel();
        totalBooksLabel = new javax.swing.JLabel();
        totalReportsLabel = new javax.swing.JLabel();
        refreshSummaryButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        bookLabel = new javax.swing.JLabel();
        reportLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        totalUsersLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalUsersLabel.setText("Total Users:");

        totalBooksLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalBooksLabel.setText("Total Books:");

        totalReportsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalReportsLabel.setText("Total Reports:");

        refreshSummaryButton.setText("Refresh");
        refreshSummaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshSummaryButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Summary");

        userLabel.setText("userLabel");

        bookLabel.setText("bookLabel");

        reportLabel.setText("reportLabel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(totalBooksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalReportsLabel))
                            .addComponent(totalUsersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(bookLabel)
                            .addComponent(reportLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(refreshSummaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalUsersLabel)
                    .addComponent(userLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalBooksLabel)
                    .addComponent(bookLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalReportsLabel)
                    .addComponent(reportLabel))
                .addGap(43, 43, 43)
                .addComponent(refreshSummaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshSummaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshSummaryButtonActionPerformed
        // TODO add your handling code here:
        var data = BookJDBConnector.getData();
        bookLabel.setText(data.get("books").toString());
        userLabel.setText(data.get("users").toString());
        reportLabel.setText(data.get("reports").toString());
        
    }//GEN-LAST:event_refreshSummaryButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton refreshSummaryButton;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JLabel totalBooksLabel;
    private javax.swing.JLabel totalReportsLabel;
    private javax.swing.JLabel totalUsersLabel;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
