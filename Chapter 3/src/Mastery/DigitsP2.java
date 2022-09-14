package Mastery;
import java.util.Scanner;
public class DigitsP2 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.print("Please enter a three digit number.");
		int digit = Scan.nextInt();
		
		int ones = digit%100%10;
		int tens = digit%100/10;
		int hundreds = digit/100;
		System.out.println("Ones: " + ones);
		System.out.println("Tens: " + tens);
		System.out.println("Hundreds: " + hundreds);
		
	}

}
