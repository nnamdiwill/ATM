package ATM;

public class BankAccount {

	private double balance;
	
	public BankAccount() {
		
		balance = 0;
	}
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	/**Deposits money into account
	 * 
	 */
	public void deposit(double amount) {
		balance  = balance + amount;
	}
	
	/**withdraws from account
	 * 
	 */
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
