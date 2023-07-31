
package com.mycompany.main;
    public class CheckingAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; // 2% interest rate for checking

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

    

