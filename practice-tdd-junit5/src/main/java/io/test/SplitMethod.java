/**
 * 
 */
package io.test;

import java.util.ArrayList;

/**
 * @author LAP-9
 *
 */
public class SplitMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String splitString = "Reverse me if you can";
		ArrayList<String> stringArr = new ArrayList<String>();
		Character limit = ' ';
		stringArr = splitMethod(splitString, limit);
		System.out.println(stringArr);
	}

	/**
	 * Implement .split method. split should take a character as input and returns
	 * an array of strings.
	 * 
	 * INPUT: ("Reverse me if you can", " ") OUTPUT: ["Reverse", "me", "if", "you",
	 * "can"]
	 * 
	 * @param origString
	 * @return stringArr
	 */
	public static ArrayList<String> splitMethod(String origString, Character limit) {
		// create arraList to collect the characters of the origString
		ArrayList<Character> charArr = new ArrayList<Character>();

		try {
			if (origString == null && limit == null) {
				System.out.println("Check the arguments if they are null");
				return null;
			}

			if (origString.isEmpty()) {
				System.out.println("The first argument is empty");
				return null;
			}
			for (int index = 0; index < origString.length(); index++) {
				charArr.add(origString.charAt(index));
			}

			// create arraList to add the characters in a string and add it inside the
			// arraList
			ArrayList<String> stringArr = new ArrayList<String>();
			String collectChar = "";
			for (int index = 0; index < charArr.size(); index++) {
				if (charArr.get(index) != ' ') {
					collectChar = collectChar + Character.toString(charArr.get(index));
				}
				if (charArr.get(index) == limit) {
					stringArr.add(collectChar);
					collectChar = "";
				} else if (index == charArr.size() - 1) {
					stringArr.add(collectChar);
				}
			}
			return stringArr;
		} catch (Exception e) {
			ArrayList<String> stringArr = new ArrayList<String>();
			return stringArr;
		}

	}

}
