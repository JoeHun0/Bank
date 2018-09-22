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
public class HarmadikOra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank(1000000000);
        Employee emp = new Employee(1000);
        bank.addEmployee(emp);
        emp.addLoan(new Loan(1000,2.6));
        bank.giveSalary();
        System.out.println(emp.getBalance());
        // TODO code application logic here
    }
    
}
