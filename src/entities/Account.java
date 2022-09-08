package entities;

import entities.exceptions.WithdrawException;

public class Account {
	
	private Integer number;
	private String name;
    protected Double balance;
	private Double withdrawLimit;
    public Account() {}
	public Account(Integer number, String name, Double balance, Double withdrawLimit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}
    
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void withdraw(Double amount) throws WithdrawException{
		if(this.balance < amount){
			throw new WithdrawException("Withdraw error: The amount exceeds widthdraw limit US$: " + (balance + withdrawLimit));
		}
		this.balance -= amount;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}

	@Override
	public String toString() {
		return "Account number: " + number + ", name: " + name + ", balance US$: " + balance ;
	}
	
	
}
