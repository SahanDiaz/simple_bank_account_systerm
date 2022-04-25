package com.newProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Bank bank = new Bank("BOC");
        bank.addBranch("mtu-branch");
        bank.addBranch("Ktu-branch");

        bank.addCustomer("mtu-branch","dz",34 );
        bank.addCustomer("mtu-branch","persi",633 );
        bank.addCustomer("mtu-branch","sahan",4 );

        bank.addCustomer("Ktu-branch","han",5 );
        bank.addCustomer("Ktu-branch","z2",35 );
        bank.addCustomer("Ktu-branch","ersi",34 );
        bank.addCustomer("Ktu-branch","han2",52 );
        bank.addCustomer("Ktu-branch","z22",325 );
        bank.addCustomer("Ktu-branch","ersi2",342 );

        bank.addCustomertransaction("mtu-branch","dz",24);
        bank.addCustomertransaction("mtu-branch","dz",24);
        bank.addCustomertransaction("mtu-branch","dz",24);
        bank.addCustomertransaction("Ktu-branch","han",62);
        bank.addCustomertransaction("mtu-branch","sahan",24);

        bank.listCustomer("Ktu-branch",true);
        bank.listCustomer("mtu-branch",true);


    }


}
