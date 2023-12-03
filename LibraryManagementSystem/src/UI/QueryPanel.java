/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Lohitha Atluri
 */
public class QueryPanel extends javax.swing.JPanel {

    /**
     * Creates new form QueryPanel
     */
    public QueryPanel() {
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

        commentonbuttonGroup = new javax.swing.ButtonGroup();
        queryPanel = new javax.swing.JPanel();
        headingLabel = new javax.swing.JLabel();
        commentLabel = new javax.swing.JLabel();
        complaintRadioButton = new javax.swing.JRadioButton();
        queryRadioButton = new javax.swing.JRadioButton();
        queryaboutLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        queryTextArea = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        feedbackRadioButton = new javax.swing.JRadioButton();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(700, 500));

        headingLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("Query Form");
        headingLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        commentLabel.setText("Comment Type:");

        commentonbuttonGroup.add(complaintRadioButton);
        complaintRadioButton.setText("Complaint");

        commentonbuttonGroup.add(queryRadioButton);
        queryRadioButton.setText("Query");

        queryaboutLabel.setText("Comment:");

        queryTextArea.setColumns(20);
        queryTextArea.setRows(5);
        jScrollPane1.setViewportView(queryTextArea);

        submitButton.setText("Submit");

        clearButton.setText("Clear");

        commentonbuttonGroup.add(feedbackRadioButton);
        feedbackRadioButton.setText("Feedback");

        emailLabel.setText("Email:");

        javax.swing.GroupLayout queryPanelLayout = new javax.swing.GroupLayout(queryPanel);
        queryPanel.setLayout(queryPanelLayout);
        queryPanelLayout.setHorizontalGroup(
            queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queryPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(queryPanelLayout.createSequentialGroup()
                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queryPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commentLabel)
                            .addComponent(queryaboutLabel)
                            .addComponent(emailLabel))
                        .addGap(51, 51, 51)
                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(queryPanelLayout.createSequentialGroup()
                                .addComponent(complaintRadioButton)
                                .addGap(66, 66, 66)
                                .addComponent(queryRadioButton)
                                .addGap(38, 38, 38)
                                .addComponent(feedbackRadioButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(queryPanelLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(submitButton)
                        .addGap(75, 75, 75)
                        .addComponent(clearButton)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        queryPanelLayout.setVerticalGroup(
            queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queryPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commentLabel)
                    .addComponent(complaintRadioButton)
                    .addComponent(queryRadioButton)
                    .addComponent(feedbackRadioButton))
                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queryPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(queryaboutLabel)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queryPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(clearButton))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(queryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(queryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel commentLabel;
    private javax.swing.ButtonGroup commentonbuttonGroup;
    private javax.swing.JRadioButton complaintRadioButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton feedbackRadioButton;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel queryPanel;
    private javax.swing.JRadioButton queryRadioButton;
    private javax.swing.JTextArea queryTextArea;
    private javax.swing.JLabel queryaboutLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
