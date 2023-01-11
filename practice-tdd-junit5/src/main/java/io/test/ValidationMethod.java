/**
 * 
 */
package io.test;

import java.util.Stack;

/**
 * @author LAP-9
 *
 */
public class ValidationMethod {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String input = "}";
		String input1 = "{ int x= (int)(0+1); int[] arr=new arr[10];;;}}";
		String input2 = "[{()}]";
		String input3 = "]{()}[";
		String input4 = "([](";
		String input5 = "(arr[10})";
		String input6 = "[arr(10)[";
		String input7 = "([arr{(10)}])";
		String input8 = "([arr{(10)}])";
		System.out.println(calculateParenthesesWithStack(null));

	}

	/**
	 * This method will take the strings given and calculate the parentheses using
	 * slack if the close parentheses match open parentheses it will display valid
	 * else not valid for example: input: "{}" then the output will be: valid for
	 * example: input: "}{" then the output will be: not valid
	 * 
	 * @param origString
	 */
	public static boolean calculateParenthesesWithStack(String origString) throws Exception {
		Stack<Character> addParentheses = new Stack<Character>();
		Stack<Character> addSquareBrackets = new Stack<Character>();
		Stack<Character> addBraces = new Stack<Character>();
		int countOpenParentheses = 0;
		int countCloseParentheses = 0;
		int countOpenSquareBrackets = 0;
		int countCloseSquareBrackets = 0;
		int countOpenBraces = 0;
		int countCloseBraces = 0;
		if (origString.isEmpty()) {
			System.out.println("The string is empty");
			return false;
		}
		for (int index = 0; index < origString.length(); index++) {
			char element = origString.charAt(index);
			// calculate the number of open and close parentheses
			if (element == '{') {
				countOpenParentheses++;
			} else if (element == '}') {
				countCloseParentheses++;
			}
			// calculate the number of open and close SquareBrackets
			if (element == '[') {
				countOpenSquareBrackets++;
			} else if (element == ']') {
				countCloseSquareBrackets++;
			}
			// calculate the number of open and close Braces
			if (element == '(') {
				countOpenBraces++;
			} else if (element == ')') {
				countCloseBraces++;
			}

			// add the open parentheses inside stack
			if (element == '{') {
				addParentheses.push(element);
			}
			// add the open SquareBrackets inside stack
			if (element == '[') {
				addSquareBrackets.push(element);
			}
			// add the open Braces inside stack
			if (element == '(') {
				addBraces.push(element);
			}
			// delete open parentheses with close parentheses
			if (element == '}') {
				if (!addParentheses.empty() && countOpenParentheses != 0) {
					addParentheses.pop();
				}
			}
			// delete open SquareBrackets with close parentheses
			if (element == ']') {
				if (!addSquareBrackets.empty() && countOpenSquareBrackets != 0) {
					addSquareBrackets.pop();
				}
			}
			// delete open SquareBrackets with close parentheses
			if (element == ')') {
				if (!addBraces.empty() && countOpenBraces != 0) {
					addBraces.pop();
				}
			}
		}
		// display the results
		if (addParentheses.empty() && addSquareBrackets.empty() && addBraces.empty() && countOpenParentheses != 0
				&& countOpenParentheses == countCloseParentheses && countOpenSquareBrackets != 0
				&& countOpenSquareBrackets == countCloseSquareBrackets && countOpenBraces != 0
				&& countOpenBraces == countCloseBraces) {
			System.out.println("true (Meaning valid)");
			return true;

		} else {
			System.out.println("false (Meaning Invalid)");
			return false;
		}
	}
}
