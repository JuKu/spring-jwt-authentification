package com.jukusoft.authentification.jwt.account;

public class AccountDTO {

    private long userID;
    private String username;

    public AccountDTO(long userID, String username) {
        this.userID = userID;
        this.username = username;
    }

    public long getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

}
