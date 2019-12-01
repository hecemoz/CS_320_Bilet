package Database;

import java.sql.*;

public class DB_Connection {

    private static Connection conn;
    private static Statement stmt;
    static final String USER = "sql7313897";
    static final String PASS = "vAC2v1qeAK";


    public DB_Connection() throws SQLException {

        String url = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7313897";


        conn = DriverManager.getConnection(url, USER, PASS);
        System.out.println("Database connection established");


    }

    public ResultSet send_query(String... s) {

        ResultSet rs = null;
        stmt = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println(rs.getString(s[0]) + " - " + rs.getString(s[1]) + " " + rs.getString(s[2]));
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {


            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                }

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                }

                stmt = null;
            }
        }
        return rs;
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
