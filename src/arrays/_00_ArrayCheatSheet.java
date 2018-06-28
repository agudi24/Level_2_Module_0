package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] element = new String[5];
		//2. print the third element in the array
		System.out.println(element[3]);
		//3. set the third element to a different value
		element[3] = "3";
		//4. print the third element again
		System.out.println(element[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < element.length; i++) {
			System.out.println(element[i]);
		}
		//6. make an array of 50 integers
		Random r = new Random();
	
		int[] number = new int[50];
		//System.out.println(number[rand]);
		//7. use a for loop to make every value of the integer array a random number
		int smallest = 1;
		int largest = 48;
		for (int i = 0; i < number.length; i++) {
			int rand = r.nextInt(50);
			number[i] = rand;
			if (number[i] < smallest) {
				smallest = number[i];
			}
			if (number[i] > largest) {
				largest = number[i];
			}
			
			//System.out.println(number[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(smallest);
		
		//9 print the entire array to see if step 8 was correct
	
		//10. print the largest number in the array.
		System.out.println(largest);
	}
}
