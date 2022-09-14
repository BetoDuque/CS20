package SkillBuilding;

import java.util.Scanner;

public class CircleCircumferenceP1 
{

	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.print("Please enter the radius of your circle.\n");
		double radius = Scan.nextInt();
		double pi = 3.1415;
		double circumference = 2*radius*pi;
		
		System.out.print("The circumference of your circle is: " + circumference);
	}

}
