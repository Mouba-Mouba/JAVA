package practice;

public class practice02 {

	public static void main(String[] args) {
		Account account = new Account(11222, 20000);
		Account.setAnnualInterrestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Our balance is " + account.getBlance());
		System.out.println("Monthly Interrest is " + account.getMonthlyInterrestRate());
		System.out.println("Account created on " + account.getDateCreated());
		

	}

}
class Account {
	private int id;
	private double balance;
	private static double annualInterrestRate;
	private java.util.Date dateCreated;
	
	public Account() {
		
		dateCreated = new java.util.Date();
	}
	
	public Account (int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	
	public int getId() {
		return id;
	}
	
	public double getBlance() {
		return balance;
	}
	
	public static double getAnnualInterrestRate() {
		return annualInterrestRate;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public static void setAnnualInterrestRate(double newAnnualInterrestRate) {
		annualInterrestRate = newAnnualInterrestRate;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterrestRate() {
		return balance * (annualInterrestRate/1200);
	}
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
}

