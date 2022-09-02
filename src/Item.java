/**
* This class represents items that can be placed in a shopping cart.
* @author Chessica Nation
*/
public class Item
{
	private String name;
	private double price;
	private double discount;

	/**
	* Empty-argument constructor
	*/
	public Item()
	{
		name = "";
		price = 0.00;
		discount = 0.00;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor
	 * @param name
	 * @param price
	 */
	public Item(String name, double price, double discount)
	{
		this.name = name;
		this.price = price;
		this.discount = discount;
	}//end preferred constructor
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() 
	{
		return name;
	}//end getName

	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}//end setName

	/**
	 * Getter for price
	 * @return
	 */
	public double getPrice() 
	{
		return price;
	}//end getPrice

	/**
	 * Setter for price
	 * @param price
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}//end setPrice

	/**
	 * Getter for discount
	 * @return
	 */
	public double getDiscount() 
	{
		return discount;
	}//end getDiscount
	
	/**
	 * Setter for discount. Enter percentage as a decimal.
	 * Updates price to reflect discount taken off.
	 * @param discount
	 */
	public void setDiscount(double discount) 
	{
		this.discount = discount;
		
		this.price = price * (1 - discount);
	}//end setDiscount

	@Override
	public String toString() 
	{
		return "Item [name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}//end toString

}//end class
