
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
    public static Connection connect() {
        Connection connection = null;
        try {
            // Thiết lập kết nối đến cơ sở dữ liệu
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "2782004");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void disconnect(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
