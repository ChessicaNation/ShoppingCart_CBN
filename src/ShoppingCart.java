/**
 * This class represents a shopping cart using the ResizableArrayBag
 * class from Carrano and Henry.
 * CS215ON
 * Assignment 1.1
 * @author Chessica Nation
 *
 */
public class ShoppingCart {

	private ResizableArrayBag<Item> cart; 

	/**
	 * Creates an empty cart whose capacity is 25. 
	 */
	public ShoppingCart()
	{
		cart = new ResizableArrayBag<Item>();
	}//end default constructor
	
	public ShoppingCart(int initialCapacity)
	{
		cart = new ResizableArrayBag<Item>(initialCapacity);
	}//end preferred constructor
	
	/**
	 * This method adds a new entry to the shopping cart and returns true if successful
	 * or false if not.
	 * @param newEntry
	 * @return
	 */
	public boolean add(Item newEntry) 
	{
		return cart.add(newEntry);
	}//end add
	
	/**
	 * This method returns an array of all entries in the shopping cart. 
	 * If the shopping cart is empty, the array will also be empty.
	 * @return
	 */
	public Object[] displayEntries() 
	{
		return cart.toArray();
	}//end displayEntries
	
	/**
	 * This method gets the current number of entries in the shopping cart.
	 * @return 
	 */
	public int getCurrentNumber() 
	{
		return cart.getCurrentSize();
	}//end getCurrentNumber

	/**
	 * This method returns true if the shopping cart is empty or false if not.
	 * @return 
	 */
	public boolean isEmpty() 
	{
		return cart.isEmpty();
	}//end isEmpty

	/**
	 * This method returns the number of times a specified entry appears in the shopping cart.
	 * @param anEntry
	 * @return 
	 */
	public int getFrequencyOf(Item anEntry) 
	{
		return cart.getFrequencyOf(anEntry);
	}//end getFrequencyOf

	/**
	 * This method returns true if a specified entry appears in the shopping cart
	 * and false if not.
	 * @param anEntry
	 * @return 
	 */
	public boolean contains(Item anEntry) 
	{
		return cart.contains(anEntry);
	}//end contains

	/**
	 * This method returns the price of a specified entry.
	 * @param anEntry
	 * @return
	 */
	public double getPriceOf(Item anEntry) 
	{
		return anEntry.getPrice();
	}//end getPriceOf

	/**
	 * This method returns the subtotal of all entries in the shopping cart.
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	public double getSubtotal() 
	{
		Object[] list = this.displayEntries();
		
		double subtotal = 0;
		
		for(int index = 0; index < list.length; index++)
			{
			Item myItem = (Item)list[index];
			subtotal = subtotal + myItem.getPrice();
			}//end for
		
		return subtotal;
	}//end getSubtotal

	/**
	 * This method accepts the sales tax rate as a decimal and adds the sales tax amount 
	 * to the subtotal, returning the total price of the shopping cart.
	 * @param salesTaxRate
	 * @return 
	 */
	public double getTotal(double salesTaxRate) 
	{
		double total = this.getSubtotal() * (1 + salesTaxRate);
		return total;
	}//end getTotal

	/**
	 * This method adds a gift message to the receipt and returns true if successful
	 * or false if not.
	 * @param message
	 * @return 
	 */
	public boolean addMessage(String message) 
	{
		if(message.length()<50)
			{
			String giftMessage = message;
			return true;
			}//end if
		else return false;	
	}//end addMessage

	/**
	 * This method removes one unspecified entry from the shopping cart, if possible, 
	 * and returns the removed entry if successful or null if not.
	 * @return 
	 */
	public Item remove() 
	{		
		return cart.remove();
	}//end remove

	/**
	 * This method removes one instance of a specified entry from the shopping cart, 
	 * if possible, and returns true if successful or false if not.
	 * @param anEntry
	 * @return 
	 */
	public boolean remove(Item anEntry) 
	{
		return cart.remove(anEntry);
	}//end remove(Item anEntry)

	/**
	 * This method removes all entries from the shopping cart.
	 */
	public void clear() 
	{
		cart.clear();	
	}//end clear
	
}//end class
