package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserPassChecker {
    private Connection connection;

    public UserPassChecker(Connection connection) {
        this.connection = connection;
    }

    public boolean checkUserPass(String username, char[] password) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // SQL truy vấn để kiểm tra người dùng và mật khẩu
            String query = "SELECT * FROM databasejava.account WHERE user = ? AND password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, new String(password)); // Chuyển mật khẩu từ char[] thành String

            resultSet = preparedStatement.executeQuery();

            // Kiểm tra kết quả
            return resultSet.next(); // Trả về true nếu có kết quả, tức là người dùng và mật khẩu hợp lệ
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Xảy ra lỗi
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
