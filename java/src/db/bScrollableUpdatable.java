package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class bScrollableUpdatable {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CCT", "root", "");

            // Create a scrollable, updatable statement
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            // Execute a query to get the result set
            ResultSet rs = st.executeQuery("SELECT * FROM detail");

            // Move to the third row
            rs.absolute(3);

            // Print the current values in the third row
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));

            // Get the current value of the third column
            int op = rs.getInt(3);

            // Define the new value to add to the third column
            int np = 15000;

            // Update the value of the third column
            rs.updateInt(3, op + np);

            // Update the row in the database
            rs.updateRow();

            // Print the updated value of the third column
            System.out.println("Updated money is " + rs.getInt(3));

            // Close the statement and connection
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
