/**
 * 
 */
package io.test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author LAP-9
 *
 */
public class EvenOddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exercise1
		System.out.println("exercise1");
		Integer[] numbers = { 2, 3, 7, 6, 9, 4, 5, 7 };
		System.out.println(evenOdd(numbers));
		System.out.println();

	}

	/**
	 * method to separate the even numbers from the odd numbers 
	 * Given an array of integers, return the even and odd numbers 
	 * INPUT: [2, 3, 7, 6, 9, 4, 5, 7]
	 * OUTPUT: {'even': [2, 6, 4], 'odd': [7, 3, 9, 5, 7]}
	 * @param numbers
	 * @return numbersSeprated
	 * @return null
	 */
	public static HashMap<String, ArrayList<Integer>> evenOdd(Integer[] numbers) {
		if (numbers == null) {
			System.out.println("Empty argument");
			return null;
		}
		if (numbers.length == 0) {
			System.out.println("Empty array");
			return null;
		} else {
			ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
			ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
			HashMap<String, ArrayList<Integer>> numbersSeprated = new HashMap<String, ArrayList<Integer>>();
			if (!numbers.equals(null)) {

				for (int index = 0; index < numbers.length; index++) {

					if (numbers[index] % 2 == 0) {
						evenNumbers.add(numbers[index]);
					} else {
						oddNumbers.add(numbers[index]);
					}
				}
				numbersSeprated.put("'even': ", evenNumbers);
				numbersSeprated.put("'odd': ", oddNumbers);

			}
			return numbersSeprated;
		}

	}
}
