package com.nestjavatraining.springaccount;

public class CheckDeposit implements Transaction {

	Account account;
	@Override
	public double process(Account account,double amount) {
		// TODO Auto-generated method stub
		account.setBalance( account.getBalance()+amount);
		System.out.println("This withdrawal is using check");
		return account.getBalance();
	}

}
