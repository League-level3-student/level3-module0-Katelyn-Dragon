package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] five = new String[5];
		five[0] = "a";
		five[1] = "b";
		five[2] = "c";
		five[3] = "d";
		five[4] = "e";
		//2. print the third element in the array
		System.out.println(five[2]);
		//3. set the third element to a different value
		five[2] = "x";
		//4. print the third element again
		System.out.println(five[2]);
		//5. use a 'for loop' to set all the elements in the array to a string of your choice
		for (int i = 0; i < five.length; i++) {
			five[i]="alphabet";
		}
		//6. use a 'for loop' to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < five.length; i++) {
			System.out.println(five[i]);
		}
		
		//7. make an array of 50 integers
		int[] fifty = new int[50];
		//8. use a 'for loop' to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < fifty.length; i++) {
			fifty[i] = rand.nextInt(51);
			for (int j = 0; j < fifty.length; j++) {
				if (j) {
			
				}
				System.out.println();
			}
			System.out.println(fifty[i]);	
		}
		//9. without printing the entire array, print only the smallest number on the array
	
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
