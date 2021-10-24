package com.himanshu.splitpayments.bills;

import com.himanshu.splitpayments.users.Sharers;
import com.himanshu.splitpayments.users.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bill {

    private String billId;
    private int billAmount;
    private String expenseDate;
    private Sharers sharers;
    private Map<User, Integer> billMap;
    private Map<User, Integer> paidBy;

    public Bill(String billId, int billAmount, String expenseDate, Sharers sharers, User paidBy) {
    }

    public Bill(String billId, int billAmount, String expenseDate, Sharers sharers) {
        this.billId = billId;
        this.billAmount = billAmount;
        this.expenseDate = expenseDate;
        this.sharers = sharers;
//        this.paidBy = new HashMap<>();
        this.billMap = new HashMap<>();
    }

    public void addExpense(Map<User, Integer> map){
        this.paidBy = map;
    }

    public void setPaidBy(Map<User, Integer> paidBy) {
        this.paidBy = paidBy;
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

    public Map<User, Integer> getPaidBy() {
        return paidBy;
    }
}
