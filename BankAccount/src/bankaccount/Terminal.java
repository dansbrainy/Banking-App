/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.Scanner;

/**
 *
 * @author dansk
 */
public class Terminal {

    Scanner sc = new Scanner(System.in);
    
    String readWord(String transaction_) {
        System.out.println("Please Enter Transaction Command");
        transaction_ = sc.nextLine();
        return transaction_;
    }

    void println(String HELPSTRING) {
       System.out.println(HELPSTRING);
    }

    int readInt(String amount_) {
        System.out.println("Please Enter Transaction Amount");
        amount_ = String.valueOf(sc.nextInt());
        return Integer.parseInt(amount_);
    }
    
}
