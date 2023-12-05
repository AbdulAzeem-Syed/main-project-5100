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
public class BookJDBConnector {
    
    private static final String URL = "jdbc:mysql://localhost:5000/project?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    public static void getData() {
        String querybook = "select count(*) from project.book";
        String queryuser = "select count(*) from project.user";
        String queryreport = "select count(*) from project.user_queries";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(querybook);
            ResultSet rs = stmt.executeQuery(querybook);
            rs.next();
            int countbooks = rs.getInt(1);
            
            PreparedStatement stmt1 = conn.prepareStatement(queryuser);
            ResultSet rs1 = stmt1.executeQuery(queryuser);
            rs1.next();
            int countusers = rs1.getInt(1);
            
            PreparedStatement stmt2 = conn.prepareStatement(queryreport);
            ResultSet rs2 = stmt2.executeQuery(queryreport);
            rs2.next();
            int countreports = rs2.getInt(1);
            
            System.out.println("Total Users : " + countusers);
            System.out.println("Total Books : " + countbooks);
            System.out.println("Total Reports : " + countreports);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    /**
     * Privatized constructor so as to not allow object creation
     */
    private BookJDBConnector() {}
        
                
        
        public static void addBook(Book book) {
        //add to database
        String query = "INSERT INTO book(name, author, isAvailable) VALUES(?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            stmt.setString(2, book.getAuthor());
            stmt.setBoolean(3, book.getIsAvailable());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    public static ArrayList<Book> getAllBooks() {
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
                u.setIsAvailable(rs.getBoolean("isAvailable"));
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
        String query = "UPDATE book SET name=?, author=?, isAvailable=? WHERE bookId=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newBook.getBookname());
            stmt.setString(2, newBook.getAuthor());
            stmt.setBoolean(3, newBook.getIsAvailable());
            stmt.setInt(4, oldBook.getBookId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
