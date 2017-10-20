package com.our.system.vo;

/**
 * Created by andriusbaltrunas on 10/20/2017.
 */
public class User {
    private int id;
    private String userName;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String phone;


    public User(int id, String userName, String name, String surname, String email, String phone) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
