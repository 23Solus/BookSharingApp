package com.poznan.put.student.wesoly.michal.BookSharingApp.model;

public class User {
    private String login;
    private String password;
    private UserType type;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.type = new Standard();
    }
    public User(String login, String password, UserType type) {
        this.login = login;
        this.password = password;
        this.type = type;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
