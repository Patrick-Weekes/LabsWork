package com.axa.labs08;

public class Account {
	private int id; 
	private String owner; 
	private double balance;
	
	public void deposit(double  amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && balance - amount >= 0) {
			balance -= amount;
		}
	}
	
	public void getDetails() {
		System.out.println("ID: " + id);
		System.out.println("Owner: " + owner);
		System.out.println("Balance: " + balance);
	}
	
	public void addInterest() {
		balance *= 1.025;
	}


}
