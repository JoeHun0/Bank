/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadikora;

/**
 *
 * @author Diak
 */
public class Loan {
    private int amount;
    private double interest;

    public int getAmount() {
        return amount;
    }

    public double getInterest() {
        return interest;
    }

    public Loan(int amount, double interest) {
        this.amount = amount;
        this.interest = interest;
    }
}
