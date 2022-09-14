package Mastery;
import java.util.Scanner;

public class Change 
{

	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.print("Please enter the change in cents.");
		int change = Scan.nextInt();
		
		int quarters = change/25;
		int dimes = change/10;
		int nickels = change/5;
		int pennies = change/1;
		
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
	}

}
