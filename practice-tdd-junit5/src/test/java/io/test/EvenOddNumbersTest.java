/**
 * 
 */
package io.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author LAP-9
 *
 */
class EvenOddNumbersTest {

	/**
	 * Test method for {@link io.test.EvenOddNumbers#evenOdd(int[])}.
	 */
	@Test
	@DisplayName("Null as an argument, instead of an array.")
	void testEvenOdd() {
		EvenOddNumbers checkEvenOddNumbers = new EvenOddNumbers();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		HashMap<String, ArrayList<Integer>> compare = new HashMap<String, ArrayList<Integer>>();
		assertEquals(null, checkEvenOddNumbers.evenOdd(null));
	}

	@Test
	@DisplayName("Empty array as an argument.")
	void testEvenOddWithNullReturn() {
		EvenOddNumbers checkEvenOddNumbers = new EvenOddNumbers();
		Integer[] test1 = {};
		assertEquals(null, checkEvenOddNumbers.evenOdd(test1));
	}

	@Test
	@DisplayName("Array with all even numbers.")
	void testEvenOddWithEvenReturn() {
		EvenOddNumbers checkEvenOddNumbers = new EvenOddNumbers();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		HashMap<String, ArrayList<Integer>> compare = new HashMap<String, ArrayList<Integer>>();
		Integer[] test2 = { 1, 3, 5, 7, 9 };
		for (int index = 0; index < test2.length; index++) {

			if (test2[index] % 2 == 0) {
				evenNumbers.add(test2[index]);
			} else {
				oddNumbers.add(test2[index]);
			}
		}
		compare.put("'even': ", evenNumbers);
		compare.put("'odd': ", oddNumbers);
		assertEquals(true, compare.equals(checkEvenOddNumbers.evenOdd(test2)));
	}

	@Test
	@DisplayName("Array with all odd numbers.")
	void testEvenOddWithOddReturn() {
		EvenOddNumbers checkEvenOddNumbers = new EvenOddNumbers();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		HashMap<String, ArrayList<Integer>> compare = new HashMap<String, ArrayList<Integer>>();
		Integer[] test3 = { 2, 4, 6, 8 };
		for (int index = 0; index < test3.length; index++) {

			if (test3[index] % 2 == 0) {
				evenNumbers.add(test3[index]);
			} else {
				oddNumbers.add(test3[index]);
			}
		}
		compare.put("'even': ", evenNumbers);
		compare.put("'odd': ", oddNumbers);
		assertEquals(true, compare.equals(checkEvenOddNumbers.evenOdd(test3)));
	}
	@Test
	@DisplayName("Array with mixed even and odd numbers.")
	void testEvenOddWithMixReturn() {
		EvenOddNumbers checkEvenOddNumbers = new EvenOddNumbers();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		HashMap<String, ArrayList<Integer>> compare = new HashMap<String, ArrayList<Integer>>();
		Integer[] test4 = { 10, 2, 4, 6, 8, 7, 1, 9, 5 };
		for (int index = 0; index < test4.length; index++) {

			if (test4[index] % 2 == 0) {
				evenNumbers.add(test4[index]);
			} else {
				oddNumbers.add(test4[index]);
			}
		}
		compare.put("'even': ", evenNumbers);
		compare.put("'odd': ", oddNumbers);
		assertEquals(compare, checkEvenOddNumbers.evenOdd(test4));
	}

}
