/**********************************************

Workshop # 1

Course:<JAC444> - Semester Summer

Last Name:<Zleik>

First Name:<Raeda>

ID:<113091151>

Section:<SCD>

This assignment represents my own work in accordance with Seneca Academic Policy.

Signature R.Z

Date:<07-06-2018>

**********************************************/

import java.util.Date;
public class Account {

	//define variables
	protected int id;
	protected double balance; // balance for account
	protected double annualInterestRate; //stores the current interest rate
	protected Date dateCreated; //stores the date account created

	//no arg construtor
	Account () {
	    id = 0;
	    balance = 0.0;
	    annualInterestRate = 0.0;
	    dateCreated = new java.util.Date();
	}
	
	//constructor with specific id and initial balance
	Account(int nId, double nBalance) {
		this();
	    id = nId;
	    balance = nBalance;
	    //dateCreated = new java.util.Date();
	}
	
	//accessor/mutator methods for id, balance, and annualInterestRate
	public int getId() {
	    return id;
	}
	public double getBalance() {
	    return balance;
	}
	public double getAnnualInterestRate() {
	    return annualInterestRate;
	}
	public void setId(int i) {
	    id = i;
	}
	public void setBalance(double bal) {
	    balance = bal;
	}
	public void setAnnualInterestRate(double air) {
	    annualInterestRate = air;
	}
	//accessor method for dateCreated
	public void setDateCreated(Date newDate) {
	    dateCreated = newDate;
	}
	
	//returns the monthly interest rate
	double getMonthlyInterestRate() {
	    return annualInterestRate/12;
	}
	//Monthly interest is balance * monthlyInterestRate.
	double getMonthlyInterest() {
	    return balance * getMonthlyInterestRate();
	}
	// withdraws a specified amount from the account.

	void withdraw(double amount) {
	    balance -= amount;
	} 
	
	// deposits a specified amount to the account.
	void deposit(double amount) {
	    balance += amount;   
	}

	//override toString method
    public String toString() {
        return "Account ID: " + id + "\n" + "Balance: " + balance + "\n" ;
    }




  




}
