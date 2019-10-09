/**
 * @author Dustin Dekker-Parrent
 * ID: 1212567796
 * Assignment #2
 * This file tests the contents of the AddingMachine class
 */

package cse360assign2;


/** 
* AddingMachine represents a class that will add or subtract from a total
* and update the total as it gets new instructions. It will keep a history
* of operations so it can print out the full equation 
* @author Dustin Dekker-Parrent
* */
public class AddingMachine 
{
	private int total;
	String history = "0";
	
	/**
	 * Represents the adding machine
	 */
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Checks whether the string is a palindrome
	 * @return the integer variable total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * adds given value to total
	 * @param an integer to add to the total
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * subtracts given value from total
	 * @param an integer to subtract from the total
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history += " - " + value;
	}
	
	/**
	 * returns a string of all recorded operations
	 * @return string of the history of operations
	 */
	public String toString () 
	{
		return history;
	}
	
	/**
	 * clears the total and history of operations
	 */
	public void clear() 
	{
		total = 0;
		history = "0";
	}

}
