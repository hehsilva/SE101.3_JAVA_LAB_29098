package com.mycompany.main;

 public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.12; // 12% interest rate for savings

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

    

