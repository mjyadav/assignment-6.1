
import java.util.Scanner;
//Using two arrays, one to store the names of months and the other one to store the days in each month, write a program to find the number of days in a given month.
public class MonthDay {
// main method
	public static void main(String[] args) {
		//input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the month ");
		 int monthno=input.nextInt();
		 

		// build array with number of days per month

		String[] monthName1 = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
       
		int[] calDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		//logic
		for(int i=0;i<12;i++){
			int k;
			k=(monthno-1);
			if(i==k)
			 {
				// output if conditions comes true
				System.out.println(monthName1[i]);
			  System.out.println(calDays[i]);
			 }
		}
		}
			
		}
		
		

