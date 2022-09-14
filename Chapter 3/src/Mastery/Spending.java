package Mastery;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Spending 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Please enter the amount spent last month on the following items:");
		System.out.print("Food: ");
		int Food = Scan.nextInt();
		System.out.print("Clothing: ");
		int Clothing = Scan.nextInt();
		System.out.print("Entertainment: ");
		int Entertainment = Scan.nextInt();
		System.out.print("Rent: ");
		int Rent = Scan.nextInt();
		
		int total = Food + Clothing + Entertainment + Rent;
		double foodPercent = (((total - Food)/total)-1*-1)*100;
		double clothingPercent = (((total - Clothing)/total)-1*-1*)100;
		double entertainmentPercent = (((total - Entertainment)/total)-1*-1)*100;
		double rentPercent = (((total - Rent)/total)-1*-1*100;
		System.out.println("Budget spend on food: " + foodPercent);
		System.out.println("Budget spend on Clothing: " + clothingPercent);
		System.out.println("Budget spend on food: " + entertainmentPercent);
		System.out.println("Budget spend on food: " + rentPercent);
		
	}

}
