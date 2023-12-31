/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Util.BookJDBConnector;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Model.Book;
import Model.BookBorrowed;
import Model.User;
import Util.BookBorrowedDBConnector;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JPanel;
/**
 *
 * @author Amer
 */
public class SearchBookPanel extends javax.swing.JPanel {

    private ArrayList<Book> book;
    private Book selectedBook;
    
    
    /**
     * Creates new form ReportPanel
     */
    public SearchBookPanel(JPanel bottomPanel) {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchButtonButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        editBookButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(800, 520));

        searchButtonButton.setText("Search");
        searchButtonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonButtonActionPerformed(evt);
            }
        });

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Name", "Author", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookTable);

        editBookButton.setText("Change Availability");
        editBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addComponent(searchTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButtonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBookButton))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchTextField)
                    .addComponent(searchButtonButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(editBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonButtonActionPerformed
        // TODO add your handling code here:
        var sorter = new TableRowSorter(bookTable.getModel());
        bookTable.setRowSorter(sorter);
        var searchString = searchTextField.getText();
        if (searchString.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(searchString));
        }

    }//GEN-LAST:event_searchButtonButtonActionPerformed

    private void editBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBookButtonActionPerformed
        int selectedIndex = bookTable.getSelectedRow();
        if(selectedIndex == -1)
        {
            JOptionPane.showMessageDialog(this, "No book selected", "Error", HEIGHT);
            return;
        }
        try
        {
            selectedBook = book.get(selectedIndex);
            Book newBook = selectedBook;
            newBook.setIsAvailable(!newBook.getIsAvailable());

            BookJDBConnector.editBook(selectedBook, newBook);

            String outputMessage = "Changed the availability of the book";
            JOptionPane.showMessageDialog(this, outputMessage, "LMS", HEIGHT);
            populateTable();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", HEIGHT);
        }
    }//GEN-LAST:event_editBookButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton editBookButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButtonButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables

  public void populateTable() {
        try {
            this.book = BookJDBConnector.getAllBooks();
            DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
            model.setRowCount(0);
            for (Book u: book) {
                Object[] row = new Object[4];
                row[0] = u.getBookId();
                row[1] = u.getBookname();
                System.out.println(u.getBookname());
                row[2] = u.getAuthor();
                row[3] = u.getIsAvailable();
               
                model.addRow(row);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    

}
