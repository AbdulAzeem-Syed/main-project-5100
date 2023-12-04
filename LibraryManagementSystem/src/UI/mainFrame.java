/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.regex.Pattern;

/**
 *
 * @author Abdul
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
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

        loginPanel = new javax.swing.JPanel();
        LoginTextLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        newNameLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        newNameTextField = new javax.swing.JTextField();
        passwordPasswordField = new javax.swing.JPasswordField();
        newPasswordPasswordField = new javax.swing.JPasswordField();
        confirmNewPasswordLabel = new javax.swing.JLabel();
        confirmNewPasswordPasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        guestLoginButton = new javax.swing.JButton();
        signUpTextLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(0, 153, 255));
        loginPanel.setMinimumSize(new java.awt.Dimension(700, 500));
        loginPanel.setPreferredSize(new java.awt.Dimension(700, 500));

        LoginTextLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTextLabel.setText("Login ");

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("User Name");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        newNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        newNameLabel.setText("Name");

        newPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        newPasswordLabel.setText("Set Password");

        newNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newNameTextFieldKeyPressed(evt);
            }
        });

        passwordPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordPasswordFieldActionPerformed(evt);
            }
        });

        newPasswordPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordPasswordFieldActionPerformed(evt);
            }
        });

        confirmNewPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmNewPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmNewPasswordLabel.setText("Confirm Password");

        confirmNewPasswordPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmNewPasswordPasswordFieldActionPerformed(evt);
            }
        });
        confirmNewPasswordPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmNewPasswordPasswordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmNewPasswordPasswordFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirmNewPasswordPasswordFieldKeyTyped(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(0, 153, 0));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        guestLoginButton.setBackground(new java.awt.Color(0, 153, 0));
        guestLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        guestLoginButton.setText("Guest Login");
        guestLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestLoginButtonActionPerformed(evt);
            }
        });

        signUpTextLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signUpTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpTextLabel.setText("Sign up");

        registerButton.setBackground(new java.awt.Color(0, 153, 0));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(LoginTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(signUpTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmNewPasswordLabel)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(newPasswordPasswordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmNewPasswordPasswordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guestLoginButton))
                    .addComponent(emailTextField))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(guestLoginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(newNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(newNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPasswordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmNewPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmNewPasswordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(registerButton)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordPasswordFieldActionPerformed

    private void newPasswordPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordPasswordFieldActionPerformed

    private void confirmNewPasswordPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmNewPasswordPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmNewPasswordPasswordFieldActionPerformed

    private void newNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newNameTextFieldKeyPressed
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            newNameTextField.setEditable(true);
        } else{
            newNameTextField.setEditable(false);
        }
    }//GEN-LAST:event_newNameTextFieldKeyPressed

    private void confirmNewPasswordPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmNewPasswordPasswordFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmNewPasswordPasswordFieldKeyPressed

    private void confirmNewPasswordPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmNewPasswordPasswordFieldKeyTyped
        // TODO add your handling code here:

   
    }//GEN-LAST:event_confirmNewPasswordPasswordFieldKeyTyped

    private void confirmNewPasswordPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmNewPasswordPasswordFieldKeyReleased
        // TODO add your handling code here:
          try{
            if(newPasswordPasswordField.getText().equals(confirmNewPasswordPasswordField.getText())){
                
               
                throw new Exception();
            }
         confirmNewPasswordPasswordField.setForeground(Color.red);
        }catch(Exception e){
            confirmNewPasswordPasswordField.setForeground(Color.black);
          }
    }//GEN-LAST:event_confirmNewPasswordPasswordFieldKeyReleased

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        // TODO add your handling code here:
       
         try{
            if(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailTextField.getText())){
                
               
                throw new Exception();
             }
            emailTextField.setForeground(Color.red);
           }catch(Exception e){
            emailTextField.setForeground(Color.black);
           }
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void guestLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestLoginButtonActionPerformed
        // TODO add your handling code here:
        setContentPane(new LibrarianPanel());
        invalidate();
        validate();
    }//GEN-LAST:event_guestLoginButtonActionPerformed
//}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginTextLabel;
    private javax.swing.JLabel confirmNewPasswordLabel;
    private javax.swing.JPasswordField confirmNewPasswordPasswordField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton guestLoginButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel newNameLabel;
    private javax.swing.JTextField newNameTextField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField newPasswordPasswordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel signUpTextLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
