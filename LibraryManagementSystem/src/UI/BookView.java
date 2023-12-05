/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.User;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Abdul
 */
public class BookView extends javax.swing.JPanel {

    private User userDetails = null;
    /**
     * Creates new form BookView
     */
    public BookView(User user, String bookName) {
        initComponents();
        userDetails = user;
        try{
            File file = new File(bookName + ".jpg");
            BufferedImage img = ImageIO.read(file);
            Image edited_image = img.getScaledInstance(600, 900, Image.SCALE_SMOOTH);
            imageLabel.setText("");
            imageLabel.setIcon(new ImageIcon(edited_image));
        }
        catch(IIOException e)
        {
            try{
                File file = new File("Default Image.jpg");
                BufferedImage img = ImageIO.read(file);
                Image edited_image = img.getScaledInstance(600, 900, Image.SCALE_SMOOTH);
                imageLabel.setText("");
                imageLabel.setIcon(new ImageIcon(edited_image));
            }
            catch(Exception exp)
            {
                System.out.print(e);
            }
            
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(142, 199, 61));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        imageLabel.setText("imageLabel");
        jScrollPane1.setViewportView(imageLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap(471, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if(userDetails == null)
        {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.setContentPane(new Homepage());
            topFrame.invalidate();
            topFrame.validate();
        }
        else
        {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.setContentPane(new Homepage(userDetails));
            topFrame.invalidate();
            topFrame.validate();
        }
        
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}