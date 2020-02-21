/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project12;

import java.util.HashSet;
import java.util.TreeMap;

/**
 *
 * @author ali.banu
 */
public class AccountHolder {
    private String name;
    private String userId;
    private int pin;
    private HashSet<Account> accounts;

    public HashSet<BankTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(HashSet<BankTransaction> transactions) {
        this.transactions = transactions;
    }
    private HashSet<BankTransaction> transactions;
    public AccountHolder(String name, String userId, int pin,HashSet<Account> accounts) {
        this.name = name;
        this.userId = userId;
        this.pin = pin;
        this.accounts=accounts;
        transactions=new HashSet<BankTransaction>();
    }

    public HashSet<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashSet<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
     
    
}
