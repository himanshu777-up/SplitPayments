package com.himanshu.splitpayments.users;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    private String userId;
    private String userName;
    private int contactNumber;
    private Map<User, Integer> owesTo;
    private Map<Sharers, Integer> owesToGroups;


    public Map<Sharers, Integer> getOwesToGroups() {
        return owesToGroups;
    }



    public Map<User, Integer> getOwesTo() {
        return owesTo;
    }

    public User(String userId, String userName, int contactNumber) {
        this.userId = userId;
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.owesTo = new HashMap<>();
        this.owesToGroups = new HashMap<>();
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

    public void showAllDebt() {
        System.out.println("The user " + getUserName() + "  owes the following amounts to different people");
        for (User user : owesTo.keySet()) {
            System.out.println(user.getUserName() + "   ---   " + owesTo.get(user));
        }

    }

    public void showGroupWiseDebt(){
        System.out.println("The user " + getUserName() + "  owes the following amounts to different groups");
        int sum=0;
        for (Sharers sharer : owesToGroups.keySet()) {
            sum+=owesToGroups.get(sharer);
            System.out.println(sharer.getGroupId()+" --- amount is   "+ owesToGroups.get(sharer));
        }

        System.out.println("And the total amount is   "+sum);
        System.out.println("*********************************");
        System.out.println("  ");
    }
}
