package com.newProject;

import java.util.ArrayList;

import static com.newProject.Main.scanner;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerArrayList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public boolean addCustomer(String cusName, double amount){
        if(findCustomer(cusName) == null){
            this.customerArrayList.add(new Customer(cusName,amount));
            return true;
        }
        return false;
    }
    public boolean addAdditionalAmount(String cusName,double additionalAmount){
        Customer customer = findCustomer(cusName);
        if(customer !=null){
            customer.addAdditionalTransaction(additionalAmount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String name){
        for (int x=0;x<customerArrayList.size();x++){
            Customer checkedCus = customerArrayList.get(x);
            if (checkedCus.getName().equals(name));
                return checkedCus;
        }
        return null;
    }
}
