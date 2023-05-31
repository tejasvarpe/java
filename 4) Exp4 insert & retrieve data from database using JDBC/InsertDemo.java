// Java Code to insert data

import java.sql.*;

public class InsertDemo {
    static final String DB_URL = "jdbc:mysql://localhost/sakila";
    static final String USER = "root";
    static final String PASS = "root";
    static final String insertquery = "insert into actor(actor_id,first_name,last_name) values(1003,'prathamesh','galande')";

    public static void main(String[] args) {
        // Open a connection
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(insertquery);
            // Extract data from result set
            System.out.println("Data inserted");

        } 
        catch (SQLException e) {
            System.out.println("error occured");
        }
    }
}