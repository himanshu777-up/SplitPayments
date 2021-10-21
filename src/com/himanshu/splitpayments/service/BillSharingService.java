package com.himanshu.splitpayments.service;

import com.himanshu.splitpayments.bills.Bill;
import com.himanshu.splitpayments.bills.Splitter;
import com.himanshu.splitpayments.users.Sharers;
import com.himanshu.splitpayments.users.User;

public class BillSharingService {

    //    Test case 1
    public static void main(String[] args) {

        User user1 = new User("user1", "Himanshu", 123);
        User user2 = new User("user2", "Golu", 456);
        User user3 = new User("user3", "himgol", 789);

        Sharers sharer1 = new Sharers("group1");
        sharer1.addSharer(user1);
        sharer1.addSharer(user2);
        sharer1.addSharer(user3);

        sharer1.displayUsers();

        Bill bill1 = new Bill("bill1", 1000, "21-Oct", sharer1, user1);
        Splitter split1 = new Splitter(bill1);

        split1.eqSplit();

        for (Object user : bill1.getBillMap().keySet()) {

            System.out.println("For the user  " + user + "   The contribution should be   " + bill1.getBillMap().get(user));


        }
    }
}
