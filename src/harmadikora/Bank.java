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
public class Bank {
    private double balance;
    private List<Employee> employees;
    private List<Loan> loans;
    private List<Customer> customers;

    public Bank(double balance) {
        this.balance = balance;
        employees = new ArrayList<>();
        loans = new ArrayList<>();
        customers = new ArrayList<>();
    }
    public void giveSalary(){
        for(Employee e : employees){
            double payment = 1000+e.calculatePremium();
            balance-=payment;
            e.setBalance(payment);
        }
    }
    public void gibLoan(){
        if(!isTheraAnyFreeEmployee()){
            for(Employee e : employees){
                e.setAlreadyGaveLoan(false);
            }
        }
        for(Customer c :customers){
            if(c.isNeedLoan()){
                
            }
        } 
        
    }
    private boolean isTheraAnyFreeEmployee(){
        boolean ok=false;
        for(Employee e : employees){
            if(!e.isAlreadyGaveLoan())
                ok=true;
        }
        return ok;
    }
    public void addEmployee(Employee emp){
        employees.add(emp);
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
