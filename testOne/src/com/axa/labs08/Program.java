package com.axa.labs08;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.deposit(1000);
		account.withdraw(500);
		account.getDetails();
		
		Account myAccount = new Account();
		myAccount.deposit(100);
		myAccount.addInterest();
		myAccount.getDetails();
		
		Account partnerAccount = myAccount;
		partnerAccount.getDetails();
		partnerAccount.addInterest();
		myAccount.getDetails();
		
		processAccount(myAccount);
		myAccount.getDetails();
		
		int k =  100;
		incInt(k);
		System.out.println(k);

	}
	
	static void processAccount(Account acc){ 
		acc.addInterest();
	}
	
	private static void incInt(int x) {
		x++;
	}
}
