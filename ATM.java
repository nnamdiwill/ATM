package ATM;

public class ATM {
	
	public static final int CHECKING = 1;
	public static final int Savings = 2;
	
	private int state;
	private int customerNumber;
	private Customer currentCustomer;
	private BankAccount currentAccount;
	private Bank theBank;
	
	public static final int START = 1;
	public static final int PIN = 2;
	public static final int ACCOUNT;
	public static final int TRANSACT;
	
	/**Constructs an ATM for a given bank
	 * @param aBank is the bank at this atm connects
	 */

	public ATM(Bank aBank){
		
		theBank = aBank;
		reset();
		
	}
	
	/**Resets atm to initial state
	 * 
	 */
	public void reset(){
		customerNumber = -1;
		currentAccount =null;
		state = START;
	}
	
	/**Sets the current customer number
	 * and sets the pin.
	 * Precondition state is start.
	 * @param numbeer which is customer number
	 */
	
	public void setCustomerNumber(int Number) {
		assert state == START;
		customerNumber = number;
		state = PIN;
	}
	/** Find Customers in bank
	 * 
	 */
	
	public void selectCustomer(int pin){
		assert state == PIN;
		currentCustomer = theBank.findCustomer(customerNumer,pin);
		if(currentCustomer == null)
			state = START;
			
			else 
				state = ACCOUNT;
		
	}
	/**Sets current account to checking or savings.
	 * 
	 */
	public void selectAccount(int account) {
		assert state == ACCOUNT || state == TRANSACT;
		
		if(account == CHECKING)
			currentAccount = currentCustomer.getCheckingAccount();
		else
			currentAccount = currentCustomer.getSavingsAccount();
		state = TRANSACT;
	}
	/**withdraws amount from current account
	 * 
	 */
	public void withdraw(double value){
		
		assert state == TRANSACT;
		currentAccount.withdraw(value);
	}
	/** deposita amount to current account
	 * 
	 */
	public void deposit(double value){
		
		assert state == TRANSACT;
		currentAccount.deposit(value);
	}
	/**gets balance of current account
	 * 
	 */
	public double getBalance(){
		assert state == TRANSACT;
		return currentAccount.getBalance();
	}
	/**Moves back to previous state
	 * 
	 */
	public void back(){
		
		if(state == TRANSACT)
			state = ACCOUNT;
		else if (state == ACCOUNT)
			state = PIN;
		else if (state == PIN)
			state = START;
	}
	/** gets the current state of the ATM
	 * 
	 */
	public int getState(){
		return state;
	}
}
