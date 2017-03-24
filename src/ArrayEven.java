
import java.util.Scanner;
// Declare an integer array of size 10. Initialize using for loop with 1 to 10, and print all even numbers from an array.  
public class ArrayEven {
	
	//main  method
	public static void main(String[] args) {
	//taking input from scanner
		Scanner s = new Scanner(System.in);
		// declaration of array
		int a[] = new int[10];
		//logic and output as per conditions
		System.out.println("Enter all the elements:");
		for (int i = 0; i < 10; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Even numbers:");
		for (int i = 0; i < 10; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}