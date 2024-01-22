/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) 
	{
		//here, our program gets the quantity of cents
		int Total_cents = Integer.parseInt(args[0]);
		//here, the program calculates the quarters and remaining cents
		int quarters = Total_cents / 25;
		int remaining = Total_cents % 25;
		//here, our program prints the number of quarters and remaining cents
		System.out.println("Use " + quarters + " quarters and " + remaining + " cents");
	}
}