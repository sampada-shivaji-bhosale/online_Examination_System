package online_examination;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection con;
    public static Connection create() {
        final String DB_url = "jdbc:mysql://localhost/online_examination?serverTimezone=UTC";
        final String username = "root";
        final String password_db = "";
        try {
            con = DriverManager.getConnection(DB_url, username, password_db);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
