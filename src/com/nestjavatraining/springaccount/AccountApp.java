package com.nestjavatraining.springaccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountApp {

public static void main(String[] args) throws NumberFormatException, IOException {

Account account;
Transaction transaction;

//load the spring configuration file
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//// retrieve bean from spring container
System.out.print("1.atm withdraw, 2.Cash withdraw, 3. Cash deposit 4. Check Deposit");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Scanner scanner=new Scanner(System.in);
int choice = Integer.parseInt(br.readLine());
double amount;
switch(choice) {
case 1:
	account = context.getBean("account",Account.class);
	transaction=context.getBean("atmw",Transaction.class);
//call methods on the bean
System.out.println(account.getAccountNo());
	amount=scanner.nextDouble();
System.out.println(transaction.process(account, amount));

//close the context
context.close();
break;
case 2:
	account = context.getBean("account",Account.class);
	transaction=context.getBean("cashw",Transaction.class);
//call methods on the bean
	System.out.println(account.getAccountNo());
	amount=scanner.nextDouble();
	System.out.println(transaction.process(account, amount));

//close the context
context.close();
break;
case 3:
	account = context.getBean("account",Account.class);
	transaction=context.getBean("cashd",Transaction.class);
//call methods on the bean
	System.out.println(account.getAccountNo());
	amount=scanner.nextDouble();
	System.out.println(transaction.process(account, amount));

//close the context
context.close();
break;
case 4:
	account = context.getBean("account",Account.class);
	transaction=context.getBean("checkd",Transaction.class);
//call methods on the bean
	System.out.println(account.getAccountNo());
	amount=scanner.nextDouble();
	System.out.println(transaction.process(account, amount));

//close the context
context.close();
break;
}

}

}
