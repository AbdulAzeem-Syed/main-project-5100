/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.User;
/**
 *
 * @author amer2
 */
public class UserJDBConnector {
     private static final String URL = "jdbc:mysql://localhost:5000/project?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    
    /**
     * Privatized constructor so as to not allow object creation
     */
    private UserJDBConnector() {
    }

    /**
     * Insert given user to database
     * @see User
     * @param user User object to be added
     */
    public static void addUser(User user) {
        //add to database
        String query = "INSERT INTO user(name, email, role, password) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
         
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getRole());
            stmt.setString(4, user.getPassword());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return lost of all users in database
     * @see User
     * @return list of users
     */
    public static ArrayList<User> getAllUsers() {
//        return list of users from db
        ArrayList<User> users = new ArrayList<>();

        String query = "SELECT * FROM user";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User u = new User();
                u.setUserId(rs.getInt("userId"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setRole(rs.getString("role"));
                u.setPassword(rs.getString("password"));
                users.add(u);
            } 
            System.out.println("Connection Test");
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    /**
     * Delete given user from database
     * @see User
     * @param u User to be deleted
     * 
     */
    public static void deleteUser(User u) {
        String query = "delete from user where id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, u.getUserId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edit given user details in the database
     * @param oldUser existing user in database
     * @param newUser modified user details to be added
     */
    public static void editUser(User oldUser, User newUser) {
        String query = "UPDATE User SET name=?, email=? WHERE userid=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newUser.getName());
            stmt.setString(2, newUser.getEmail());
            stmt.setInt(3, oldUser.getUserId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
