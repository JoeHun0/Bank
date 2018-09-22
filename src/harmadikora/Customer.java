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
public class Customer {
    private int balance;
    private boolean needLoan;
    private int amountOfLoan;

    public Customer(int balance, boolean needLoan, int amountOfLoan) {
        this.balance = balance;
        this.needLoan = needLoan;
        if(!needLoan){
            amountOfLoan=0;
        }else{
        this.amountOfLoan = amountOfLoan;
        }
    }

    public boolean isNeedLoan() {
        return needLoan;
    }

    public void setNeedLoan(boolean needLoan) {
        this.needLoan = needLoan;
    }

    public void pay(double money){
        balance-=money;
    }
    public void getLoan(double money){
        balance+=money;
    }
}
