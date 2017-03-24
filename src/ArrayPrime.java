public class ArrayPrime {
	//Declare and initialize an integer array of size 10.  Fill it with only prime numbers. (step-1) Create another integer array of size 10 and copy the values of first array into second array in the reverse order and print them.
	
	//main method
	public static void main(String[] args) {
		{   //array declaration
			int[] array_1 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
			int[] array_2;

			array_2 = new int[array_1.length];

			System.out.println(" The Prime no of the Array-1 original order are :");
            //logic and finding prime no.
			for (int i = 0; i < array_1.length; i++)
				System.out.println(" " + array_1[i]);

			for (int j = 0, k = 9; j < array_1.length; j++, k--)
				array_2[j] = array_1[k];

			System.out.println("\n The contents of the Array-2 reverse order are :");

			//logic and printing of reverse order
			for (int l = 0; l < array_2.length; l++)
				System.out.println(" " + array_2[l]);
		}
	}

}
