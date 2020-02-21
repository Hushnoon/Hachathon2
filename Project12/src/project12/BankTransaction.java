/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project12;

import java.util.Date;

/**
 *
 * @author ali.banu
 */
public class BankTransaction {
    
    private int id;
    private String type;
    private double amt;

    public BankTransaction(int id, String type, double amt) {
        this.id = id;
        this.type = type;
        this.amt = amt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
    
}
