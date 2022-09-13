package SkillBuilding;
import java.util.Scanner;

public class TempConverter 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.print("Please enter your temperature in Fahrenheit (Do not use decimals)\n");
		int TempF = Scan.nextInt();
		int TempC = (TempF - 32) * 5/9;
		System.out.print("Fahrenheit: " + TempF + "\nCelsius: " + TempC);
		
	}

}
