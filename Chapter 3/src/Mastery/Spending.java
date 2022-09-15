package Mastery;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Spending 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Please enter the amount spent last month on the following items:");
		System.out.print("Food: ");
		double Food = Scan.nextDouble();
		System.out.print("Clothing: ");
		double Clothing = Scan.nextDouble();
		System.out.print("Entertainment: ");
		double Entertainment = Scan.nextDouble();
		System.out.print("Rent: ");
		double Rent = Scan.nextDouble();
		
		double total = Food + Clothing + Entertainment + Rent;
		double foodPercent = Food/total*100; 
		double clothingPercent = Clothing/total*100;
		double entertainmentPercent = Entertainment/total*100;
		double rentPercent = Rent/total*100;
		System.out.println("Budget spend on food: " + df.format(foodPercent) + ("%"));
		System.out.println("Budget spend on Clothing: " + df.format(clothingPercent) + ("%"));
		System.out.println("Budget spend on Entertainment: " + df.format(entertainmentPercent) + ("%"));
		System.out.println("Budget spend on Rent: " + df.format(rentPercent) + ("%"));
		
	}

}
