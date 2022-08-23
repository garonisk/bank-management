package src.main.model;

import java.util.ArrayList;

import src.main.model.account.Account;

public class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;

    public Bank(){
        this.accounts = new ArrayList<Account>();
        this.transactions = new ArrayList<Transaction>();
    }

    public void addAccoount(Account account){
        this.accounts.add((account.clone()));
    }
  
}
