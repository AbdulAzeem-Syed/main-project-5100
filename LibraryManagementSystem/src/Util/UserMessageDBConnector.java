package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.UserMessage;
/**
 * Database Connector class for interacting with database
 * @author Lohitha Atluri
 */

public class UserMessageDBConnector {
    
    private static final String URL = "jdbc:mysql://localhost:5000/project?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private UserMessageDBConnector() {
    }
         public static void addUserMessage(UserMessage userMessage) {
        String query = "INSERT INTO user_queries(email, message, type) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, userMessage.getEmail());
            stmt.setString(2, userMessage.getMessage());
            stmt.setString(3, userMessage.getType());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
         public static ArrayList<UserMessage > getAllusers() {
//        return list of users from db
        ArrayList<UserMessage> users = new ArrayList<>();

        String query = "SELECT * FROM user_queries";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                UserMessage u = new UserMessage();
                u.setEmail(rs.getString("email"));
                u.setMessage(rs.getString("message"));
                u.setType(rs.getString("type"));
                u.setQueryId(rs.getInt("queryid"));
                users.add(u);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
    

public static void deleteUser(UserMessage userMessage) {
        String query = "DELETE FROM user_queries WHERE queryId = ?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, userMessage.getQueryId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  public static void editUser(UserMessage newUser, UserMessage oldUser) {
        String query = "UPDATE user_queries SET message=?, type=? WHERE queryId=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newUser.getMessage());
            stmt.setString(2, newUser.getType());
            stmt.setInt(3, oldUser.getQueryId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
