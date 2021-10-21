package com.himanshu.splitpayments.users;

import java.util.ArrayList;
import java.util.List;

public class Sharers {
    private String groupId;
    List<User> userList;

    public Sharers(String groupId) {
        this.groupId = groupId;
        this.userList = new ArrayList<>();
    }


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void displayUsers() {
        for(User user: getUserList()){
            System.out.println("User ID: "+ user.getUserId()+"  UserName: "+user.getUserName()+ "  ContactNumber  "+ user.getContactNumber());
        }
    }

    public void addSharer(User user1) {

        userList.add(user1);
    }
}
