package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/ab_training_school?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public Connection dbConn() {
        Connection con = null;

        try {

//            Loads the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

//            Creating connection
            con = DriverManager.getConnection(URL, USER, PASSWORD);

            JOptionPane.showMessageDialog(null, "Database Connected!");

        } catch (Exception e) {

        }

        return con;
    }
}

