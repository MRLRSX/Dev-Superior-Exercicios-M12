package entities;

import entities.exceptions.InterestRateException;
import entities.exceptions.WithdrawException;

public class SavingsAccount extends Account {

	private Double interestRate;
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(Integer number, String name, Double balance, Double withdrawLimit, Double interestRate) {
		super(number, name, balance, withdrawLimit);
		this.interestRate = interestRate;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void updateBalance() throws InterestRateException{
		if(interestRate < 0 || interestRate > 0.12 ) {
			throw new InterestRateException("InterestRate out tax selic: ");
		}
		
		balance += balance * (interestRate / 100);
	}
	
	@Override
	public void withdraw(Double amount) throws WithdrawException{
		if((this.balance + getWithdrawLimit()) < amount){
			throw new WithdrawException("Withdraw error: The amount exceeds widthdraw limit US$: " + (balance + getWithdrawLimit()));
		}
		this.balance -= amount;
	}
}
