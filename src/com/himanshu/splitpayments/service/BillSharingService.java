package com.himanshu.splitpayments.service;

import com.himanshu.splitpayments.bills.Bill;
import com.himanshu.splitpayments.bills.Splitter;
import com.himanshu.splitpayments.users.Sharers;
import com.himanshu.splitpayments.users.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BillSharingService {

    //    Test case 1
    public static void main(String[] args) {

        User user1 = new User("user1", "Himanshu", 123);
        User user2 = new User("user2", "Golu", 456);
        User user3 = new User("user3", "himgol", 789);
        User user4 = new User("user4", "abc", 454);
        User user5 = new User("user5", "bcd", 786);

        Sharers sharer1 = new Sharers("group1");
        Sharers sharer2 = new Sharers("group2");
        Sharers sharer3 = new Sharers("group3");

        sharer1.addSharer(new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5)));
        sharer2.addSharer(new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5)));
        sharer3.addSharer(new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5)));

        sharer1.displayUsers();
        sharer2.displayUsers();
        sharer3.displayUsers();
        System.out.println("---------------------------------------------------");

        Bill bill1 = new Bill("bill1", 1000, "21-Oct", sharer1);
        Bill bill2 = new Bill("bill1", 2000, "21-Oct", sharer2);
        Bill bill3 = new Bill("bill1", 3000, "21-Oct", sharer3);

        bill1.setPaidBy(new HashMap<User, Integer>()
                        {{
                           put(user1, 10);
                           put(user2, 20);
                           put(user3, 30);
                           put(user4, 15);
                           put(user5, 25);
                        }}
        );

        bill2.setPaidBy(new HashMap<User, Integer>()
                        {{
                            put(user1, 20);
                            put(user2, 30);
                            put(user3, 10);
                            put(user4, 25);
                            put(user5, 15);
                        }}
        );

        bill3.setPaidBy(new HashMap<User, Integer>()
                        {{
                            put(user1, 70);
                            put(user2, 5);
                            put(user3, 5);
                            put(user4, 5);
                            put(user5, 15);
                        }}
        );

        Splitter split1 = new Splitter(bill1);
        Splitter split2 = new Splitter(bill2);
        Splitter split3 = new Splitter(bill3);

        System.out.println("Calculating the bills.............");

        split1.equalSplit();
        split2.equalSplit();
        split3.equalSplit();

        System.out.println("------------Display how much each user owes--------------");
        user1.showGroupWiseDebt();
        user2.showGroupWiseDebt();
        user3.showGroupWiseDebt();
        user4.showGroupWiseDebt();
        user5.showGroupWiseDebt();
    }
}
