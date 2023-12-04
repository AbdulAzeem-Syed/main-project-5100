package Util;

import Model.Book;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Database Connector class for interacting with database
 * 
 */
public class AdminDatabaseConnector {
    
    private static final String URL = "jdbc:mysql://localhost:5000/project?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private AdminDatabaseConnector() {}
        
        
        public static void addBook(Book book) {
        //add to database
        String query = "INSERT INTO book(name, author) VALUES(?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            stmt.setString(2, book.getAuthor());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    public static ArrayList<Book> getAllbooks() {
//        return list of users from db
        ArrayList<Book> books = new ArrayList<>();

        String query = "SELECT * FROM book";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Book u = new Book();
                u.setBookname(rs.getString("name"));
                u.setAuthor(rs.getString("author"));
                
                u.setBookId(rs.getInt("bookid"));
                books.add(u);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }
    
    
    public static void deleteBook(Book u) {
        String query = "delete from book where bookid = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, u.getBookId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void editBook(Book oldBook, Book newBook) {
        String query = "UPDATE book SET name=?, author=? WHERE id=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newBook.getBookname());
            stmt.setString(2, newBook.getAuthor());
            stmt.setInt(3, oldBook.getBookId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
