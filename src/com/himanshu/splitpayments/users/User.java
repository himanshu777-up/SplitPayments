package com.himanshu.splitpayments.users;

public class User {

    private String userId;
    private String userName;
    private int contactNumber;

    public User(String userId, String userName, int contactNumber) {
        this.userId = userId;
        this.userName = userName;
        this.contactNumber = contactNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
}
