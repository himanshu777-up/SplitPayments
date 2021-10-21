package com.himanshu.splitpayments.bills;

import com.himanshu.splitpayments.users.Sharers;
import com.himanshu.splitpayments.users.User;

import java.util.HashMap;
import java.util.Map;

public class Bill {

    private String billId;
    private int billAmount;
    private String expenseDate;
    private Sharers sharers;
    private Map<User, Integer> billMap;
    private User paidBy;

    public Bill(String billId, int billAmount, String expenseDate, Sharers sharers, User paidBy) {
        this.billId = billId;
        this.billAmount = billAmount;
        this.expenseDate = expenseDate;
        this.sharers = sharers;
        this.paidBy = paidBy;
        this.billMap = new HashMap<>();
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }

    public Sharers getSharers() {
        return sharers;
    }

    public void setSharers(Sharers sharers) {
        this.sharers = sharers;
    }

    public Map<User, Integer> getBillMap() {
        return billMap;
    }

    public void setBillMap(Map<User, Integer> billMap) {
        this.billMap = billMap;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }
}
