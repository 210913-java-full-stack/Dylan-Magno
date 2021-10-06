package Accounts;

import java.math.BigDecimal;

public class Bank_Account {

    private int bankAccount_ID;
    private int userAccount_ID;
    private double balance;

    //Default constructor with no parameters
    public Bank_Account(int user_id, int bankAccount_id, BigDecimal balance) {
        this.bankAccount_ID = 1;
        this.userAccount_ID = 1;
        this.balance = 0.0;
    }

    //Constructor with parameters. Intakes and saves user inputs for accountName and balance
    public Bank_Account(int ba, int ua, double b){
        this.bankAccount_ID = ba;
        this.userAccount_ID = ua;
        this.balance = b;
    }

    //Getters and setters for private member variables
    public int getBankAccount_ID() {
        return bankAccount_ID;
    }

    public void setBankAccount_ID(int bankAccount_ID) {
        this.bankAccount_ID = bankAccount_ID;
    }

    public int getUserAccount_ID() {return userAccount_ID;}

    public void setUserAccount_ID(int userAccount_ID) {this.userAccount_ID = userAccount_ID;}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //When user deposits to the account, this method adds amount to total balance
    public void depositToAccount(int d){
        balance = balance + d;
    }

    //When user takes money out of the account,this method subtracts from total balance of account
    public void withdrawFromAccount(int w){
        balance = balance - w;
    }

}
