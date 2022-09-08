package ExercicioTres.entities;

import ExercicioTres.entities.exceptions.AccountException;

public class BusinessAccount extends Account{

	private Double withdrawLimit;
	
	public BusinessAccount(Integer number, String name, Double balance, Double withdrawLimit) {
		super(number, name, balance);
		this.withdrawLimit = withdrawLimit;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	@Override
	public void withdraw(Double amount) throws AccountException {
		if(amount > getBalance()){
			throw new AccountException("Withdraw error: The amount exceeds widthdraw limit US$: " + (balance + getWithdrawLimit()));
		}
		this.balance -= amount + 5;
		
	}

}
