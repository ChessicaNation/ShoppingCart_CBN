/**
 * This class contains a main method, a displayCart method, and a testAdd method
 * to test the ShoppingCart class.
 * CS215ON
 * Assignment 1.1
 * @author Chessica Nation
 *
 */
public class Application 
{

	public static void main(String[] args) 
	{
		// ======================= Setting Up Items to Be Used in the Shopping Cart ============================
		
		Item item1 = new Item("Shirt", 10, 0);
		Item item2 = new Item("Pants", 20, .10);
		Item item3 = new Item("Dress", 30, .15);
		Item item4 = new Item("Shoes", 25, 0);
		Item item5 = new Item("Socks", 10, .05);
		Item item6 = new Item("Skirt", 15, .20);
		
		System.out.println();
		
		// ============================= Testing the ShoppingCart Class Methods ================================
		
		//testing empty-argument constructor
		ShoppingCart shoppingCart1 = new ShoppingCart();
		System.out.println("Testing empty-argument constructor to instantiate ShoppingCart1.");
		//testing displayEntries (used in displayCart method below)
		displayCart(shoppingCart1);
		
		//testing preferred constructor
		ShoppingCart shoppingCart2 = new ShoppingCart(3);
		System.out.println("Testing preferred constructor to instantiate ShoppingCart2.");
		displayCart(shoppingCart2);
		
		//testing add (used in testAdd method below)
		System.out.println("Testing the add method to add a few items to ShoppingCart1.");
		Item[] testItems = {item1, item3, item5, item2, item1, item6, item2};
		testAdd(shoppingCart1, testItems);

		//testing getCurrentNumber
		System.out.println("Testing the getCurrentNumber method.\nCurrent number "
							+ "of items in ShoppingCart1: " + shoppingCart1.getCurrentNumber()
							+ "\nCurrent number of items in ShoppingCart2: " 
							+ shoppingCart2.getCurrentNumber());
		System.out.println();
		
		//testing isEmpty
		System.out.println("Testing the isEmpty method.\nIs ShoppingCart1 empty? " + shoppingCart1.isEmpty() 
							+ "\nIs ShoppingCart2 empty? " + shoppingCart2.isEmpty());
		System.out.println();
				
		//testing getFrequencyOf
		System.out.println("Testing the getFrequencyOf method in ShoppingCart1.\nFrequency of item6 (Skirt): " 
							+ shoppingCart1.getFrequencyOf(item6) + "\nFrequency of item1 (Shirt): "
							+ shoppingCart1.getFrequencyOf(item1) + "\nFrequency of item4 (Shoes): "
							+ shoppingCart1.getFrequencyOf(item4));
		System.out.println();
		
		//testing contains
		System.out.println("Testing the contains method.\nShoppingCart1 contains item1 (Shirt)? " 
							+shoppingCart1.contains(item1) + "\nShoppingCart2 contains item3 (Dress)? "
							+shoppingCart2.contains(item3));
		System.out.println();
		
		//testing getPriceOf
		System.out.println("Testing the getPriceOf method.\nPrice of item1 (Shirt): " 
							+ shoppingCart1.getPriceOf(item1) + "\nPrice of item6 (Skirt): "
							+ shoppingCart1.getPriceOf(item6));
		System.out.println();
		
		//testing getSubtotal
		System.out.println("Testing the getSubtotal method.\nSubtotal for ShoppingCart1: " 
							+ shoppingCart1.getSubtotal());
		System.out.println();
		
		//testing getTotal
		System.out.println("Testing the getTotal method.\nTotal for ShoppingCart1 with 6% sales tax: " 
							+ shoppingCart1.getTotal(.06));
		System.out.println();
		
		//testing addMessage
		System.out.println("Testing the addMessage method.\nGift message for ShoppingCart1, "
							+ "\"Happy Birthday!\", was added? " + shoppingCart1.addMessage("Happy Birthday!")
							+ "\nGift message for ShoppingCart2, \"I hope you have the best birthday ever "
							+ "and I can't wait to celebrate with you next week!\", was added? "
							+ shoppingCart2.addMessage("I hope you have the best birthday ever and I can't wait "
							+ " to celebrate with you next week!"));
		System.out.println();
		
		//testing remove()
		System.out.println("Testing the remove method with no parameters.\n" + shoppingCart1.remove() 
						+ " was removed from ShoppingCart1.\nThen, " + shoppingCart1.remove() 
						+ " was removed from ShoppingCart1.");
		displayCart(shoppingCart1);
		
		//testing remove(T anEntry)
		System.out.println("Testing the remove method with a specific parameter.\nWas item1 (Shirt) removed from "
							+ "ShoppingCart1? " + shoppingCart1.remove(item1) + "\nWas item5 (Socks) removed from "
							+ "ShoppingCart1? " + shoppingCart1.remove(item5) + "\nWas item4 (Shoes) removed from "
							+ "ShoppingCart1? " + shoppingCart1.remove(item4));
		displayCart(shoppingCart1);
		
		//testing clear
		System.out.println("Testing the clear method on ShoppingCart1. ");
		System.out.println("Is ShoppingCart1 empty? " + shoppingCart1.isEmpty());
		shoppingCart1.clear();
		System.out.println("Is ShoppingCart1 empty after calling the clear method? " +shoppingCart1.isEmpty());
		displayCart(shoppingCart1);
			
	}//end main
		
		private static void testAdd(ShoppingCart shoppingCart, Item[] content)
		{
			System.out.println("Adding to the cart: ");
			for(int index = 0; index < content.length; index++)
			{
				shoppingCart.add(content[index]);
					System.out.println(content[index]);
			}//end for
				System.out.println();
				
			displayCart(shoppingCart);
		}//end testAdd
	
		private static void displayCart(ShoppingCart shoppingCart)
		{
			System.out.println("The shopping cart contains " + shoppingCart.getCurrentNumber() 
								+ " item(s), including:");
			Object[] cartArray = shoppingCart.displayEntries();
			for(int index = 0; index < cartArray.length; index++)
			{
				System.out.println(cartArray[index]);
			}//end for
			System.out.println("The subtotal of the shopping cart is " + shoppingCart.getSubtotal());
			System.out.println();
			
		}//end displayCart
		
}//end class
