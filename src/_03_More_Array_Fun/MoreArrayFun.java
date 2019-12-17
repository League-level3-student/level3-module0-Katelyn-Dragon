package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
	String[] arr = {"hi"};
	printArray(arr);
	String[] two = {"one","two", "three"};
	Reverse(two);
	String[] rinds = {"pork rinds", "candy", "chips", "popcorn"};
	Other(rinds);
	String[] order = {"addition", "subtraction", "multiplication", "division"};
	Random(order);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printArray (String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void Reverse (String[] two) {
		for (int i = two.length-1; i >= 0; i--) {
			System.out.println(two[i]);
		}
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void Other (String[] rinds) {
		for (int i = 0; i < rinds.length; i++) {
			if (i % 2 == 0) {
				System.out.println(rinds[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void Random (String[] order) {
		
	}
	
}
