package Util;

/**
 * Database Connector class for interacting with database
 * 
 */
public class DatabaseConnector {
    
    private static final String URL = "jdbc:mysql://localhost:5000/project?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private DatabaseConnector() {
    }
}
