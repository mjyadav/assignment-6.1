
import java.util.Scanner;
// Using the same above arrays, write a program to find the number of days from January 1 up to the given date (which is given as Month Day Year combination).
public class Array

 {
// Declaration of main method.
	public static void main(String[] args) {
		// Taking input by scanner.
		Scanner input=new Scanner(System.in);
		// Counting no. of days from Jan 1st, 2000.
	    System.out.println("Program to count no. of days from 1st January 2000:");
	    System.out.println("Enter the year");
			 int year=input.nextInt();
		System.out.println("Enter the month ");
		 int monthno=input.nextInt();
	    System.out.println("Enter the date");
		 int date=input.nextInt();
		 

		// build array with number of days per month

		String[] monthName1 = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] calDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int n=0, y=2000;
		y=year-y;
		n=365*y;
		// logic
		for(int i=0;i<12;i++)
		{
			int k,d;
			k=(monthno-1);
			n=n+calDays[i];
			d=calDays[k]-date;
			if(i==k)
			 {
			  n=n-d;
			  // output if condition is true
			  System.out.println(monthName1[i]);  
			  System.out.println(calDays[i]);
			  System.out.println("no of day ="+n);
			  break;
			 }
			
		}
		}
			
		}
		
		



