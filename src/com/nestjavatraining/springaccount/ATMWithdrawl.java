package com.nestjavatraining.springaccount;

public class ATMWithdrawl implements Transaction {

	@Override
	public double process(Account account,double amount) {
		
		// TODO Auto-generated method stub
		if(account.getBalance()<=0) {
			System.out.println("Insuffifient fund");
			return account.getBalance();}
		else{
		account.setBalance( account.getBalance()-amount);
		System.out.println("This withdrawal is  inside ATM");
		return account.getBalance();}
	}

}