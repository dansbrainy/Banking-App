/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author dansk
 */
public class BankAccount {

    private int balance;
    
    public BankAccount (int initialBalance)
    {
        this.deposit(initialBalance);
    }
    
    public void withdraw(int amount)
    {
        balance = balance - amount;
    }
    
    public void deposit (int amount)
    {
        balance = balance + amount;
    }
    
    public int getBalance()
    {
        return balance;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank javaBank = new Bank("Engulf and Devour");
        javaBank.open();
    }
   
}
