package Mastery;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Order 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##"); //library that makes rounding to decimals a lot easier
		
		double burgers = 1.69;
		double fries = 1.09;
		double sodas = 0.99;
		
		System.out.println("Please enter how many burgers you want");
		int amountBurger = Scan.nextInt();
		System.out.println("Please enter how many fries you want");
		int amountFries = Scan.nextInt();
		System.out.println("Please enter how many sodas you want");
		int amountSodas = Scan.nextInt();
		
		double priceBurger = amountBurger*burgers;
		double priceFries = amountFries*fries;
		double priceSodas = amountSodas*sodas;
		
		double totalPrice = priceBurger + priceFries + priceSodas;
		System.out.println("Total before tax: " + df.format(totalPrice));
		double tax = totalPrice*0.065;
		System.out.println("Tax: " + df.format(tax));
		
		System.out.println("Final total: " + df.format((tax + totalPrice)));
	}

}
