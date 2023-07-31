
package com.mycompany.main;
public class Main {

    public static void main(String[] args) {
       
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setBalance(20000000); // $20 million in savings account

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(1000000); // $1 million in checking account

        double savingsInterest = savingsAccount.calculateInterest();
        double checkingInterest = checkingAccount.calculateInterest();

        System.out.println("Interest for Savings Account: $" + savingsInterest);
        System.out.println("Interest for Checking Account: $" + checkingInterest);
    }
}

        
    

