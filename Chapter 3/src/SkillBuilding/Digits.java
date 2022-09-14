package SkillBuilding;
import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.print("Please enter a two digit number.");
		int digit = Scan.nextInt();
		
		int ones = digit%10;
		int tens = digit/10;
		System.out.println("Ones digit: " + ones);
		System.out.println("Tens digit: " + tens);
	}

}
