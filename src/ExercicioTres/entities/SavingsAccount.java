package ExercicioTres.entities;

import ExercicioTres.entities.exceptions.AccountException;

public class SavingsAccount extends Account {
  
	private Double loanLimit;

	public SavingsAccount(Integer number, String name, Double balance, Double loanLimit) {
		super(number, name, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	@Override
	public void withdraw(Double amount) throws AccountException {
		if(amount > getBalance()){
			throw new AccountException("Withdraw error: The amount exceeds widthdraw limit US$: " + balance);
		}
		this.balance -= amount;	
	}
    
	public void loan(Double amount) {
		if(amount > loanLimit){
			throw new AccountException("LoanLimit error: The amount exceeds Loan Limit US$: " + loanLimit);
		}
		this.balance += loanLimit;
	}
	
	
}
