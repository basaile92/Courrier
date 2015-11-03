package city.inhabitant;

import city.City;

public class Inhabitant {
	
	protected String name;
	protected double bankAccount;
	protected City city;
	
	public Inhabitant(String name, double bankAccount, City city){
		this.name = name;
		this.bankAccount = bankAccount;
		this.city = city;
	}
	
	public void credit(double amount){
		bankAccount+=amount;
	}

	public void debit(double amount){
		bankAccount-=amount;
	}
	
	public String getName(){
		return name;
	}
	
	public double getBankAccount(){
		return bankAccount;
	}
	
	public City getCity(){
		return city;
	}
}
