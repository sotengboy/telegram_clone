package com.example.biruk.androidclientchat.model;

/**
 * Created by Biruk on 3/10/2018.
 */

public class UserNew {

    private String email;
    private String password;

    public UserNew(String email, String password)
    {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
