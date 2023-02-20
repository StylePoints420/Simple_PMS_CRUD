
package Database_Connection;
import  java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    
    static Connection connect;
    static String url = "jdbc:mysql://localhost/wp_db";
    static String Username_db = "root";
    static String password_db = "";
    static String driver = "com.mysql.cj.jdbc.Driver";
    public static Connection Connect_to_DB() throws Exception {
        if(connect == null) {
            Class.forName(driver);
            connect = DriverManager.getConnection(url, Username_db, password_db);
        }
        return connect;
    }
}
