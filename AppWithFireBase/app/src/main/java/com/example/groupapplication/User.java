package com.example.groupapplication;

public class User {
    private String usrName;
    private String pw;

    public User() { }
    public User(String usrName, String pw) {
        this.usrName = usrName;
        this.pw =pw;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }
    public String getUsrName() {
        return this.usrName;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getPw() {
        return this.pw;
    }

}
