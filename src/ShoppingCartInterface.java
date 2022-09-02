/**
* This interface describes the operations of a shopping cart that can be filled with entries.
* @author Chessica Nation
*/
public interface ShoppingCartInterface<T> 
{

	/**
	 * This method gets the current number of entries in the shopping cart.
	 * @return 
	 */
	public int getCurrentNumber();

	/**
	 * This method returns true if the shopping cart is empty or false if not.
	 * @return 
	 */
	public boolean isEmpty();

	/**
	 * This method adds a new entry to the shopping cart and returns true if successful
	 * or false if not.
	 * @param newEntry
	 * @return
	 */
	public boolean add(T newEntry);

	/**
	 * This method removes one unspecified entry from the shopping cart, if possible, 
	 * and returns the removed entry if successful or null if not.
	 * @return 
	 */
	public T remove();

	/**
	 * This method removes one instance of a specified entry from the shopping cart, 
	 * if possible, and returns true if successful or false if not.
	 * @param anEntry
	 * @return 
	 */
	public boolean remove(T anEntry);

	/**
	 * This method removes all entries from the shopping cart.
	 */
	public void clear();
	
	/**
	 * This method returns the number of times a specified entry appears in the shopping cart.
	 * @param anEntry
	 * @return 
	 */
	public int getFrequencyOf(T anEntry);

	/**
	 * This method returns true if a specified entry appears in the shopping cart
	 * and false if not.
	 * @param anEntry
	 * @return 
	 */
	public boolean contains(T anEntry);

	/**
	 * This method returns an array of all entries in the shopping cart. 
	 * If the shopping cart is empty, the array will also be empty.
	 * @return
	 */
	public T[] displayEntries();

	/**
	 * This method returns the price of a specified entry.
	 * @param anEntry
	 * @return
	 */
	public double getPriceOf(T anEntry);

	/**
	 * This method returns the subtotal of all entries in the shopping cart.
	 * @return 
	 */
	public double getSubtotal();
	
	/**
	 * This method accepts the sales tax rate as a decimal and adds the sales tax amount 
	 * to the subtotal, returning the total price of the shopping cart.
	 * @param salesTaxRate
	 * @return 
	 */
	public double getTotal(double salesTaxRate);

	/**
	 * This method adds a gift message to the receipt and returns true if successful
	 * or false if not.
	 * @param message
	 * @return 
	 */
	public boolean addMessage(String message);
	
}//end interface
