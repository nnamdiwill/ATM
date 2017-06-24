package ATM;
/** Abank customer with a checking and savings account.
 * 
 * @author N'Namdi
 *
 */
public class Customer {

	private int customerNumber;
	private int pin;
	private BankAccount checkingAccount;
	private BankAccount savingsAccount;
	
	/**Constructs a customer with a given number and PIN
	 * @param aNumber the customer number
	 * @param aPin the PIN
	 */
	
	public Customer(int aNumber, int aPin){
		customerNumber = aNumber;
		pin = aPin;
		checkingAccount = new BankAccount();
		savingsAccount = new BankAccount();
	}
	
	/**Tests if this customermatches a customer number and pin
	 * 
	 */
	public boolean match(int aNumber, int aPin){
		return customerNumber == aNumber && pin == aPin;
	}
	/**Gets the checking account of customer
	 * 
	 */
	public BankAccount getCheckingAccount(){
		return checkingAccount;
	}
	public BankAccount getSavingsAccount(){
		return savingsAccount;
	}
}
