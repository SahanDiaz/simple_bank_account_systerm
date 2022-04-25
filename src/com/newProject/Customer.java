package com.newProject;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name,double amount) {
        this.name = name;
        this.transaction = new ArrayList<>();
        setInitialAmount(amount);
    }
    public void setInitialAmount(double amount){
        this.transaction.add(amount);
    }
    public void addAdditionalTransaction(double amount){
        this.transaction.add(amount);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransaction() {
        return transaction;
    }
    public void printTransaction(){
        for (int x=0;x<transaction.size();x++){
            System.out.println(transaction.get(x));
        }
    }
}
