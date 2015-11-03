package city.inhabitant;


public class Inhabitant {
	
	protected String name;
	protected double bankAccount;
	
	public Inhabitant(String name, double bankAccount){
		this.name = name;
		this.bankAccount = bankAccount;
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
}
