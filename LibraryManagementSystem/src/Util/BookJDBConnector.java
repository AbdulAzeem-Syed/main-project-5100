package Util;

import Model.Book;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Database Connector class for interacting with database
 * 
 */
public class BookJDBConnector {
    
    private static final String URL = "jdbc:mysql://localhost:5000/project?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    

    public static Dictionary<String, Integer> getData() {
        Dictionary<String, Integer> dict= new Hashtable<>();
        String querybook = "SELECT COUNT(*) as book_count from book";
        String queryuser = "SELECT COUNT(*) as user_count from user";
        String queryreport = "SELECT COUNT(*) as report_count from user_queries";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(querybook);
            ResultSet rs = stmt.executeQuery(querybook);
            rs.next();
            dict.put("books", rs.getInt("book_count"));
            
            PreparedStatement stmt1 = conn.prepareStatement(queryuser);
            ResultSet rs1 = stmt1.executeQuery(queryuser);
            rs1.next();
            dict.put("users", rs1.getInt("user_count"));
            
            PreparedStatement stmt2 = conn.prepareStatement(queryreport);
            ResultSet rs2 = stmt2.executeQuery(queryreport);
            rs2.next();
            dict.put("reports", rs2.getInt("report_count"));
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dict;
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
