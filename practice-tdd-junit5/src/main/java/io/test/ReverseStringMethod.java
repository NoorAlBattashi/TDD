/**
 * 
 */
package io.test;

import java.awt.DisplayMode;
import java.awt.image.SinglePixelPackedSampleModel;
import java.util.ArrayList;

/**
 * @author LAP-9
 *
 */
public class ReverseStringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sentence = "";
		System.out.println("Reverse: " + sentence);
		// Display the reverse string

		if (reverse(sentence) != null) {
			for (Character i : reverse(sentence)) {
				System.out.print(i);
			}
		}

	}

	/**
	 * Method to reverse the sentence given by the user 
	 * INPUT: "this is a sentence"
	 * OUTPUT: "ecnetnes a si siht"
	 * 
	 * @param sentence
	 * @return null
	 * @return groupStringArrayList
	 */
	public static ArrayList<Character> reverse(String sentence) {
		ArrayList<Character> groupStringArrayList = new ArrayList<Character>();
		if (sentence == null) {
			System.out.println("The argument is null");
			return null;
		}
		if (sentence.isEmpty()) {
			System.out.println("The string is empty");
			return null;
		}
		if (sentence.length() == 1) {
			System.out.println("The string has one character");
			return null;
		}
		for (int lastIndex = sentence.length() - 1; lastIndex >= 0; lastIndex--) {

			char lastElement = sentence.charAt(lastIndex);

			groupStringArrayList.add(lastElement);
		}
		return groupStringArrayList;

	}
}
