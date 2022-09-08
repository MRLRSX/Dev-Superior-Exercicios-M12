package entities;

import entities.exceptions.LoanLimitException;
import entities.exceptions.WithdrawException;

public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount(Integer number, String name, Double balance, Double withdrawLimit, Double loanLimit) {
		super(number, name, balance, withdrawLimit);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) throws LoanLimitException{
		if(amount > loanLimit){
			throw new LoanLimitException("LoanLimit error: The amount exceeds widthdraw limit US$: " + (balance + loanLimit));
		}
		this.balance += amount - 10;
	}
	
	@Override
	public void withdraw(Double amount) throws WithdrawException{
		if((this.balance + getWithdrawLimit()) < amount){
			throw new WithdrawException("Withdraw error: The amount exceeds widthdraw limit US$: " + (balance + getWithdrawLimit()));
		}
		this.balance -= amount + 5;
	}
}
