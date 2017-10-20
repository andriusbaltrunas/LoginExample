package com.our.system.service;

import com.our.system.exception.WrongUserCredentialsException;
import com.our.system.vo.User;

import java.sql.*;
import java.util.Stack;

/**
 * Created by andriusbaltrunas on 10/20/2017.
 */
public class LoginService {

    public User login(String userName, String password) throws WrongUserCredentialsException {

        if (isBlank(userName) || isBlank(password)) {
            throw new WrongUserCredentialsException("wrong user data");
        }
        User user = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/our_system", "root", "MySQL");
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM user WHERE user_name='" +
                    userName + "' and password='" + password + "'");

            if (resultSet.next()) {
                user = new User(resultSet.getInt("id"), resultSet.getString("user_name"), resultSet.getString("name"),
                        resultSet.getString("surname"), resultSet.getString("email"), resultSet.getString("phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }


    private boolean isBlank(String val) {
        return val == null || val.equals("");
    }
}
