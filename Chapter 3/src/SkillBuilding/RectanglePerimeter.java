package SkillBuilding;
import java.util.Scanner;

public class RectanglePerimeter 
{

	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.print("Please enter the length of your rectangle.");
		int length = Scan.nextInt();
		System.out.print("Please enter the width of your rectangle.");
		int width = Scan.nextInt();
		int perimeter = (2*width) + (2*length);
		System.out.print("The perimeter of your rectangle is: " + perimeter);
	}

}
