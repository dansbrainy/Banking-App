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
public class Bank {
    
    private static final int INITIAL_BALANCE = 200;
    private static final String HELPSTRING = "Transaction: exit, help, deposit, withdraw, balance";
    
    String bankName;
    boolean moreTransaction;
    Terminal atm;
    BankAccount account1, account2;
    
     public Bank (String name)
    {
        bankName = name;
        atm = new Terminal();
        account1 = new BankAccount(INITIAL_BALANCE);
        account2 = new BankAccount(INITIAL_BALANCE);
        
        String command = atm.readWord("transaction: ");
        if (command.equals("exit")) {
           moreTransaction = false;
        }
        else if (command.equals("help")) {
            atm.println(HELPSTRING);
        }
        else if (command.equals("deposit")) {
            int amount = atm.readInt("amount: ");
            account1.deposit(amount);
        }
        else if (command.equals("withdraw")) {
            int amount = atm.readInt("amount: ");
            account1.withdraw(amount);
        }
        else if (command.equals("balance")) {
            atm.println(String.valueOf(account1.getBalance()));
        }
        else {
            atm.println("sory, unknown transaction");
        }
    }

    void open() {
       
    }
}
