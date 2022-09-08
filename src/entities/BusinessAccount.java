package entities;

import entities.exceptions.LoanLimitException;

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
}
