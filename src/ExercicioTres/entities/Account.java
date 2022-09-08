package ExercicioTres.entities;

import ExercicioTres.entities.exceptions.AccountException;

public abstract class Account {
   
	private Integer number;
	private String name;
    protected Double balance;
    
    public Account(Integer number, String name, Double balance) {
    	this.number = number;
    	this.name = name;
    	this.balance = balance;
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
	
	public abstract void withdraw (Double amount) throws AccountException;
	
	@Override
	public String toString() {
		return "Account number: " + number + ", name: " + name + ", balance: " + balance ;
	}
    
    
}
