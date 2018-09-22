/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadikora;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Diak
 */
public class Employee {
    private boolean alreadyGaveLoan;

    public boolean isAlreadyGaveLoan() {
        return alreadyGaveLoan;
    }
    public double calculatePremium(){
        double premium = 0;
        for (Loan l : loans){
            premium+=l.getAmount()*0.1;
        }
        return premium;
    }

    public void setAlreadyGaveLoan(boolean alreadyGaveLoan) {
        this.alreadyGaveLoan = alreadyGaveLoan;
    }
    private int balance;
    private List<Loan> loans;

        public Employee(int balance) {
        this.balance = balance;
        alreadyGaveLoan = false;
        loans = new ArrayList<>();
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance+=amount;
    }
public void addLoan(Loan loan){
    loans.add(loan);
}

    
}
