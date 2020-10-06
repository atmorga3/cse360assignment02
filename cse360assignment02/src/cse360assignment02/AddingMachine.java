package cse360assignment02;

/**
 * An Adding Machine class that uses functions
 * to add values and can clear
 */
public class AddingMachine {
	/*
	 * The integer total value for the adding Machine
	 * Stores the calculations for the toString method in calculations
	 */
	
	private int total;
	private String calculations;
	
	/*
	 * Adding Machine Constructor
	 * Initializes total to 0
	 * Initializes calculations to "0 "
	 */
	public AddingMachine() {
		total = 0; //not needed - included for clarity
		calculations = "0 ";
	}
	
	/*
	 * Method that returns total
	 */
	public int getTotal() {
		return total;
	}
	
	/*
	 * Adds an the value to the total
	 * and update calculations
	 */
	public void add(int value) {
		total = total + value;
		calculations = calculations + "+ " + value + " ";
	}
	
	/*
	 * Subtracts value from the total
	 * and updates calculations
	 */
	public void subtract(int value) {
		total = total - value;
		calculations = calculations + "- " + value + " ";
	}
	
	/*
	 * Returns the memory formatted as a string
	 */
	public String toString() {
		return calculations; //to be implemented
	}
	
	/*
	 * clears the memory by resetting both calculations and total
	 */
	public void clear() {
		calculations = "0 ";
		total = 0;
	}
}
