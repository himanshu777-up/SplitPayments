package com.himanshu.splitpayments.bills;

import com.himanshu.splitpayments.users.Sharers;
import com.himanshu.splitpayments.users.User;

import java.util.Map;

public class Splitter {

    private Bill bill;

    public Splitter(Bill bill) {
        this.bill = bill;
    }

    public void eqSplit(){

        Sharers sharerList = bill.getSharers();
        Map<User, Integer> billShare = bill.getBillMap();
        int shareAmount = bill.getBillAmount();

        int n = sharerList.getUserList().size();
        int eqAmount = shareAmount / n;

        for (User user : sharerList.getUserList()) {

            billShare.put(user, eqAmount);

        }

    }

    public void percentSplit(){

    }

    public void exactSplit(){

    }

}
