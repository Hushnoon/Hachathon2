/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project12;

/**
 *
 * @author ali.banu
 */
public class Account {
    private String type;
    private String acc_no;
    private double available;

    public String getType() {
        return type;
    }

    public Account(String type, String acc_no, double available) {
        this.type = type;
        this.acc_no = acc_no;
        this.available = available;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public double getAvailable() {
        return available;
    }

    public void setAvailable(double available) {
        this.available = available;
    }
    
}
