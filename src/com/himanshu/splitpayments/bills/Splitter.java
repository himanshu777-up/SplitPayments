package com.himanshu.splitpayments.bills;

import com.himanshu.splitpayments.users.Sharers;
import com.himanshu.splitpayments.users.User;

import java.util.Map;

public class Splitter {

    private Bill bill;

    public Splitter(Bill bill) {
        this.bill = bill;
    }

    public void equalSplit() {

        Sharers sharerList = bill.getSharers();
        Map<User, Integer> billShare = bill.getBillMap();
        int shareAmount = bill.getBillAmount();

        int n = sharerList.getUserList().size();
        int eqAmount = shareAmount / n;

        for (User user : bill.getSharers().getUserList()) {

            if (bill.getPaidBy().containsKey(user)) {
                user.getOwesToGroups().put(bill.getSharers(), ((bill.getPaidBy().get(user))*shareAmount)/100 - eqAmount);
            } else {
                bill.getBillMap().put(user, eqAmount);
            }

        }


    }

    public void percentSplit() {
        //to do


    }

    public void exactSplit() {
        //to do

    }

}
