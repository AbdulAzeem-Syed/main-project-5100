/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Book;
import Model.User;
import Util.BookBorrowedDBConnector;
import Util.BookJDBConnector;
import Util.UserJDBConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Abdul
 */
public class Homepage extends javax.swing.JPanel {

    /**
     * Creates new form Homepage
     */
    private ArrayList<Book> books = new ArrayList();
    private Book selectedBook;
    private User userDetails = null;
    private JPanel loginPanel;
    public Homepage(JPanel loginPanel) {
        this.loginPanel = loginPanel;
        initComponents();
        updateTable();
        try{
        File file = new File("Logo.png");
        BufferedImage img = ImageIO.read(file);
        Image edited_image = img.getScaledInstance(245, 104, Image.SCALE_SMOOTH);
        logo.setText("");
        logo.setIcon(new ImageIcon(edited_image));
        requestBorrowButton.setVisible(false);
        contactUsButton.setVisible(false);
        viewBooksButton.setVisible(false);
        logoutButton.setText("Back");
        booksTable.removeColumn(booksTable.getColumnModel().getColumn(3));
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
    
    public Homepage(User user, JPanel loginPanel) {
        this.loginPanel = loginPanel;
        initComponents();
        updateTable();
        userDetails = user;
        try{
        File file = new File("Logo.png");
        BufferedImage img = ImageIO.read(file);
        Image edited_image = img.getScaledInstance(245, 104, Image.SCALE_SMOOTH);
        logo.setText("");
        logo.setIcon(new ImageIcon(edited_image));
        booksTable.removeColumn(booksTable.getColumnModel().getColumn(3));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        searchBook = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        viewBook = new javax.swing.JButton();
        requestBorrowButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        contactUsButton = new javax.swing.JButton();
        viewBooksButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(800, 550));

        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Author", "Physical Copy", "BookId"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booksTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(booksTable);
        if (booksTable.getColumnModel().getColumnCount() > 0) {
            booksTable.getColumnModel().getColumn(3).setResizable(false);
            booksTable.getColumnModel().getColumn(3).setPreferredWidth(0);
        }

        searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        viewBook.setText("View");
        viewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookActionPerformed(evt);
            }
        });

        requestBorrowButton.setText("Borrow");
        requestBorrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBorrowButtonActionPerformed(evt);
            }
        });

        logo.setText("logo");

        contactUsButton.setText("Contact us");
        contactUsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactUsButtonActionPerformed(evt);
            }
        });

        viewBooksButton.setText("Borrowed Books");
        viewBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBooksButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(requestBorrowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contactUsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewBooksButton)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(viewBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestBorrowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contactUsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBookActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        TableRowSorter sorter = new TableRowSorter(booksTable.getModel());
        booksTable.setRowSorter(sorter);
        String searchString = searchBook.getText();
        if (searchString.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(searchString));
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void contactUsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUsButtonActionPerformed
        // TODO add your handling code here:
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setContentPane(new QueryPanel(userDetails, loginPanel));
        topFrame.invalidate();
        topFrame.validate();
    }//GEN-LAST:event_contactUsButtonActionPerformed

    private void viewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookActionPerformed
        int selectedIndex = booksTable.getSelectedRow();
        if(selectedIndex == -1)
        {
            JOptionPane.showMessageDialog(this, "No book selected", "Error", HEIGHT);
            return;
        }
        try
        {
            selectedBook = books.get(selectedIndex);
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.setContentPane(new BookView(userDetails, selectedBook.getBookname(), loginPanel));
            topFrame.invalidate();
            topFrame.validate();
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", HEIGHT);
        }
    }//GEN-LAST:event_viewBookActionPerformed

    private void requestBorrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBorrowButtonActionPerformed
        int selectedIndex = booksTable.getSelectedRow();
        if(userDetails.getRole().equals("Freezed Member"))
        {
            JOptionPane.showMessageDialog(this, "Your account has been frozen, please return any book if you are due", "Error", HEIGHT);
            return;
        }
        if(selectedIndex == -1)
        {
            JOptionPane.showMessageDialog(this, "No book selected", "Error", HEIGHT);
            return;
        }
        try
        {
            selectedBook = books.get(selectedIndex);
            System.out.println("BookId for add borrow Info");
            System.out.println(selectedBook.getBookId());
            var borrowedBooks = BookBorrowedDBConnector.getAllBookBorrowed();
            var checkBorrowedBook = borrowedBooks.stream().filter(x -> x.getBookId() == selectedBook.getBookId() && x.getUserId() == userDetails.getUserId()).findFirst().orElse(null);
            if(checkBorrowedBook != null)
            {
                String outputMessage = "ERROR \nYou have already requested this book. If not yet picked, please visit the library reciption and pick your book";
                JOptionPane.showMessageDialog(this, outputMessage, "LMS", HEIGHT);
            }
            else
            {
                BookBorrowedDBConnector.addBorrowInfo(selectedBook.getBookId(), userDetails.getUserId());
            
                String outputMessage = "SUCCESS \nSent a borrow request to librarian, please visit the library reciption and pick your book";
                JOptionPane.showMessageDialog(this, outputMessage, "LMS", HEIGHT);
            }
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", HEIGHT);
        }
    }//GEN-LAST:event_requestBorrowButtonActionPerformed

    private void viewBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBooksButtonActionPerformed
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setContentPane(new UserBooks(userDetails, loginPanel));
        topFrame.invalidate();
        topFrame.validate();
    }//GEN-LAST:event_viewBooksButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setContentPane(loginPanel);
        topFrame.invalidate();
        topFrame.validate();
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booksTable;
    private javax.swing.JButton contactUsButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton requestBorrowButton;
    private javax.swing.JTextField searchBook;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton viewBook;
    private javax.swing.JButton viewBooksButton;
    // End of variables declaration//GEN-END:variables
    public void updateTable()
    {
        this.books = BookJDBConnector.getAllBooks();
        DefaultTableModel model = (DefaultTableModel) booksTable.getModel();
        model.setRowCount(0);
        for(Book b : books)
        {
            Object [] row = new Object[4];
            row[0] = b.getBookname();
            row[1] = b.getAuthor();
            row[2] = b.getIsAvailable() ? "Available": "Not Available";
            row[3] = b.getBookId();
            model.addRow(row);
        }
    }
}
