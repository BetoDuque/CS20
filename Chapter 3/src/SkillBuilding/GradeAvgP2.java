package SkillBuilding;
import java.util.Scanner;

public class GradeAvgP2
{

	public static void main(String[] args)  
	{
		Scanner Scan = new Scanner(System.in);
		System.out.print("Please enter your first average.\n");
		int avg1 = Scan.nextInt();
		System.out.print("Please enter your second average.\n");
		int avg2 = Scan.nextInt();
		System.out.print("Please enter your third average.\n");
		int avg3 = Scan.nextInt();
		System.out.print("Please enter your foruth average.\n");
		int avg4 = Scan.nextInt();
		System.out.print("Please enter your fifth average.\n");
		int avg5 = Scan.nextInt();
		
		int average = (avg1 += avg2 += avg3 += avg4 += avg5) / 5;
		System.out.print("Your total average is " + average);
	}

}
