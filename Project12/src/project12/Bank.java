/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ali.banu
 */
public class Bank {

    Map<String, List<AccountHolder>> banks;
    Scanner sc;

    public Bank() {
        sc = new Scanner(System.in);
        banks = new HashMap<String, List<AccountHolder>>();
        HashSet<Account> accounts = new HashSet<Account>();
        accounts.add(new Account("Savings", "123450001", 0));
        accounts.add(new Account("PPF", "123450002", 0));
        List<AccountHolder> l1 = new ArrayList<AccountHolder>();
        l1.add(new AccountHolder("Asif Iqbal", "09377", 2341, accounts));
        accounts = new HashSet<Account>();
        accounts.add(new Account("Savings", "123450003", 0));
        accounts.add(new Account("PPF", "123450004", 0));
        l1.add(new AccountHolder("Romie", "89780", 3456, accounts));
        banks.put("Bandhan", l1);
        accounts = new HashSet<Account>();
        accounts.add(new Account("Savings", "123450006", 0));
        accounts.add(new Account("PPF", "123450007", 0));
        l1 = new ArrayList<AccountHolder>();
        l1.add(new AccountHolder("Tanaz Iqbal", "09377", 2351, accounts));
        accounts = new HashSet<Account>();
        accounts.add(new Account("Savings", "123450019", 0));
        accounts.add(new Account("PPF", "123450020", 0));
        l1.add(new AccountHolder("Sohail", "89780", 3466, accounts));
        banks.put("ICICI", l1);

    }

    public Map<String, List<AccountHolder>> getBanks() {
        return banks;
    }

    public void findAccount(String id, int pin, int choice) {
        String bankName;
        if (choice == 1) {
            bankName = "Bandhan";
        } else {
            bankName = "ICICI";
        }
        List<AccountHolder> holder = banks.get(bankName);
        int flag = 0;
        for (AccountHolder h : holder) {

            if (h.getUserId().equalsIgnoreCase(id) && h.getPin() == pin) {
                flag = 1;
                System.out.println(h.getName() + " Account Summary");

                for (Account a : h.getAccounts()) {
                    System.out.println(a.getAcc_no() + ":" + a.getAvailable() + ":" + a.getType());
                }

                System.out.println("Welcome " + h.getName() + ", what would you like to do?");
                System.out.println("1.Deposit\n2.Withdraw\n3.Transaction History\n4.Quit");
                while (true) {
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println(deposit(h));
                            break;
                        case 2:
                            System.out.println(withdraw(h));
                            break;
                        case 3:
                            showTransactions();
                            break;
                        case 4:
                            return;
                    }
                }

            }
        }
        if (flag == 0) {
            System.out.println("Invalid credentials");
        }
    }

    public String deposit(AccountHolder owner) {
        System.out.println("Enter 1(Savings) or 2(PPF)");
        int choice = sc.nextInt();
        String type;
        switch (choice) {
            case 1:
                type = "Savings";
                break;
            case 2:
                type = "PPF";
                break;
            default:

                return "Invalid account";
        }
        for (Account a : owner.getAccounts()) {
            if (a.getType().equalsIgnoreCase(type)) {
                System.out.println("Enter the amount to be deposited");
                double amt = sc.nextDouble();
                a.setAvailable(a.getAvailable() + amt);
                               
                System.out.println(" Account Summary");
                System.out.println(a.getAcc_no() + ":" + a.getAvailable() + ":" + a.getType());
            }
        }
        return "Successfully deposited";
    }

    public String withdraw(AccountHolder owner) {
        System.out.println("Enter 1(Savings) or 2(PPF)");
        int choice = sc.nextInt();
        String type;
        switch (choice) {
            case 1:
                type = "Savings";
                break;
            case 2:
                type = "PPF";
                break;
            default:

                return "Invalid account";
        }
        for (Account a : owner.getAccounts()) {
            if (a.getType().equalsIgnoreCase(type)) {
                System.out.println("Enter the amount to withdraw");
                double amt = sc.nextDouble();
                a.setAvailable(a.getAvailable() - amt);
                System.out.println(" Account Summary");
                System.out.println(a.getAcc_no() + ":" + a.getAvailable() + ":" + a.getType());
            }
        }
        return "Successfully Withdrawn";
    }

    public void showTransactions() {
        System.out.println("Not Implemented yet need more time");
    }
}
