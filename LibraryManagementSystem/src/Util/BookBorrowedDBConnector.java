/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.*;
import java.util.ArrayList;
import Model.BookBorrowed;
/**
 *
 * @author amer2
 */
public class BookBorrowedDBConnector  {
    
    private static final String URL = "jdbc:mysql://localhost:5000/project?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    

    /**
     * Privatized constructor so as to not allow object creation
     */
    private BookBorrowedDBConnector() {
    }

    /**
     * Insert given BookBorrowed to database
     * @see BookBorrowed
     * @param user BookBorrowed object to be added
     */
    public static void addBorrowInfo(BookBorrowed bookBorrowed) {
        //add to database
        String query = "INSERT INTO book_borrowed(borrowId, bookId, userId, dueDate, status) VALUES(?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, bookBorrowed.getBorrowId());
            stmt.setInt(2, bookBorrowed.getBookId());
            stmt.setInt(3, bookBorrowed.getUserId());
            stmt.setDate(4, new java.sql.Date(bookBorrowed.getDueDate().getTime()));
            stmt.setString(5, bookBorrowed.getStatus());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return lost of all BookBorrowed in database
     * @see BookBorrowed
     * @return list of BookBorrowed
     */
    public static ArrayList<BookBorrowed> getAllBookBorrowed() {
//        return list of BookBorrowed from db
        ArrayList<BookBorrowed> BookBorrowed = new ArrayList<>();

        String query = "SELECT bb.*, u.name as userName, b.name as bookName FROM project.book_borrowed bb \n" +
                        "INNER JOIN project.user u on u.userId = bb.userId\n" +
                        "INNER JOIN project.book b on b.bookId = bb.bookId;";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                BookBorrowed u = new BookBorrowed();
                u.setBorrowId(rs.getInt("borrowId"));
                u.setBookId(rs.getInt("bookId"));
                u.setUserId(rs.getInt("userId"));
                u.setDueDate(rs.getDate("dueDate"));
                u.setStatus(rs.getString("status"));
                u.setBookName(rs.getString("bookName"));
                u.setUserName(rs.getString("userName"));
                BookBorrowed.add(u);
            } 
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return BookBorrowed;
    }

    /**
     * Delete given BookBorrowed from database
     * @see BookBorrowed
     * @param u BookBorrowed to be deleted
     * 
     */
    public static void deleteBookBorrowed(BookBorrowed u) {
        String query = "delete from book_borrowed where id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, u.getBorrowId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edit given BookBorrowed details in the database
     * @param oldBookBorrowed existing BookBorrowed in database
     * @param newBookBorrowed modified BookBorrowed details to be added
     */
    public static void editBookBorrowed(BookBorrowed oldBookBorrowed, BookBorrowed newBookBorrowed) {
        String query = "UPDATE book_borrowed SET status=? WHERE borrowId=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newBookBorrowed.getStatus());
            stmt.setInt(2, oldBookBorrowed.getBorrowId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
