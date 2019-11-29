package Database;

import java.sql.*;

public class DB_Connection {

    private static Connection conn;
    private static Statement mystmt;
    static final String USER = "mohaabdev";
    static final String PASS = "null";


    public DB_Connection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/mohaabdev_bilet";


        try {

            conn = DriverManager.getConnection(url, USER, PASS);
            System.out.println("Database connection established");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                close();
            }
        }


    }

    public static void send_query(String... s) {

        try {
            mystmt = conn.createStatement();
            ResultSet myRs = mystmt.executeQuery("SELECT * FROM users");

            while (myRs.next()) {
                System.out.println(myRs.getString(s[0]) + "." + myRs.getString(s[1]));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Database connection terminated");
            } catch (SQLException e) {
            }
        }
    }

}
