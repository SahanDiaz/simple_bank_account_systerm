package com.newProject;

import java.util.ArrayList;

public class Bank {
        private ArrayList<Branch> branchArrayList;
        private String bankName ;

        public Bank(String bankName ){
            this.bankName=bankName;
            this.branchArrayList = new ArrayList<Branch>();
        }
        public boolean addBranch(String Name){
            if(findBranch(Name)==null){
                branchArrayList.add(new Branch(Name));
                return true;
            }
            return false;
        }
        public boolean addCustomer(String branchName,String name,double amount  ){
            Branch branch = findBranch(branchName);
            if(branch != null){
                return branch.addCustomer(name,amount);
            }
            return false;
        }
        public boolean addCustomertransaction(String  branchName,String customerName,double amount  ){
            Branch branch = findBranch(branchName);
            if(branch != null){
                branch.addAdditionalAmount(customerName,amount);
                return true;
            }
            return false;
        }
        private Branch findBranch(String name){
            for(int x=0;x<branchArrayList.size();x++){
                Branch branch = branchArrayList.get(x);
                if (branch.getBranchName().equals(name)){
                    return branch;
                }
            }
            return null;
        }
        public boolean listCustomer(String branchName, boolean showTransactions){
            Branch branch = findBranch(branchName);
            if (branch !=null){
                System.out.println("Customer details for branch "+branch.getBranchName());
                ArrayList<Customer> branchCustomers = branch.getCustomerArrayList();
                for(int i=0; i<branchCustomers.size();i++){
                    Customer branchCustomer = branchCustomers.get(i);
                    System.out.println("customer : "+branchCustomer.getName()+" ["+ i+"]");
                    if(showTransactions){
                        System.out.println("Transaction ");
                        ArrayList<Double> transactions = branchCustomer.getTransaction();
                        for (int j=0;j<transactions.size();j++){
                            System.out.println("["+(j+1)+"] Amount   "+transactions.get(j));
                        }
                    }
                }
                return true;
            }else
            return false;
        }




}
