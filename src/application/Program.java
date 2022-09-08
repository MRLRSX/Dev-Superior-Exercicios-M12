package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       System.out.println("");
       
       Account acc = new Account(1001, "Alex", 0.0, 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 50000.0, 10000.00);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0, 50.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01, 100.0);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		System.out.println(acc);
		System.out.println(bacc);
		System.out.println(acc1);
	}
}
