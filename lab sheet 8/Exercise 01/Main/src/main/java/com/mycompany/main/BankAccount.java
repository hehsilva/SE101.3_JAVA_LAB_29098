package com.mycompany.main;
public abstract class BankAccount {
   
    private int accountNumber;
    private double balance;

    // Getter and setter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();
}


