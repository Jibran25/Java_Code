import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; // Add this import statement
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionExample {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String jdbcUrl = "jdbc:mysql://localhost:3306/javadb";
        String username = "root";
        String password = "";

        // JDBC variables for opening, closing, and managing connection
        Connection connection = null;

        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Step 3: Do something with the connection (e.g., execute queries, updates, etc.)
            // For example, you can create a statement and execute a simple query
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
		 while (resultSet.next()) {
                // Retrieve values from each column
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String passwordFromDB = resultSet.getString("password");

                // Print the values
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Password: " + passwordFromDB);
                System.out.println("------------------------");
            }

	    // Step 4: (Optional) Close the connection when done
             connection.close();

            System.out.println("Connected to the database!");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the connection in the finally block to ensure it's always closed
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
