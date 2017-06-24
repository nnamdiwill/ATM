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
	/** FINDS CUSTOMER IN BANK
	 * If found, set state to ACCOUNT, ELSE TO START
	 * 
	 */
}
