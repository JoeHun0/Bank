/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadikora;

import java.util.Random;

/**
 *
 * @author Diak
 */
public class BankRobber {
    private int balance;
    private String name;

    public BankRobber(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    
    public boolean tryToRobTheBank(){
        Random r = new Random();
        int success = r.nextInt(100+1);
        if(success<=51){
            return true;
        }else{
            return false;
        }
    }
}
