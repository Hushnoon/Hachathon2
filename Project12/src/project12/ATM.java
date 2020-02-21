/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project12;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ali.banu
 */
public class ATM {
    
        Bank bank;

    public ATM() {
     bank=new Bank();  
    }
        
    public void displayOptions()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select your bank from the list:\n1.Bandhan Bank\n2.ICICI");
        int choice=sc.nextInt();
        System.out.println("Enter user id:");
        sc.nextLine();
        String id=sc.nextLine();
        System.out.println("Enter pin");
        int pin=sc.nextInt();
        bank.findAccount(id, pin, choice);
                
    }
}
