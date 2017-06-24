package ATM;
import java.io.*;
import java.util.*;
/** bank with customer
 * 
 * @author N'Namdi
 *
 */
public class Bank {

	private ArrayList<Customer> customers;
	
	/**constructs bank with no customers
	 * 
	 */
	public Bank(){
		customers = new ArrayList<Customer>();
	}
	/** reads customer numbers and pin
	 * initiates account
	 */
	public void readCustomers(String fileName) throws IOException
{
		Scanner in = new Scanner(new File(fileName));
		while(in.hasNext()){
			int number = in.nextInt();
			int pin = in.nextInt();
			Customer c = new Customer(number,pin);
			addCustomer(c);
		}
		in.close();
		}
	/** adds customer to bank
	 * 
	 */
	public void addCustomer(Customer c){
		customers.add(c);
	}
	/** finds customers in the bank
	 * 
	 */
	public Customer findCustomer(int aNumber, int aPin){
		for (Customer c : customers){
			if(c.match(aNumber, aPin))
				return c;
		}
		return null;
	}
}
