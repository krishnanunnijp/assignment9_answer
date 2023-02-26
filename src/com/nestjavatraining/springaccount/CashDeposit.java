package com.nestjavatraining.springaccount;

public class CashDeposit implements Transaction {

	@Override
	public double process(Account account,double amount) {
		// TODO Auto-generated method stub
		account.setBalance( account.getBalance()+amount);
		System.out.println("This deposit is using cash");
	
		return account.getBalance();
	}

}
