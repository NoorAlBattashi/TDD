/**
 * 
 */
package io.test;

import java.util.HashMap;

/**
 * @author LAP-9
 *
 */
public class PowerCalculation {

	public static void main(String[] args) {
		// exercise2
		System.out.println("Calculate the power: ");
		Integer base = 0;
		Integer exponent = 0;

		// display the results
		System.out.println(power(base, exponent));
	}

	/**
	 * Method to calculate the power of the numbers Calculate power, given the base
	 * and exponent. 
	 * INPUT: {'base': 2, 'exponent':3} 
	 * OUTPUT: {'result': 8}
	 * @param base
	 * @param exponent
	 * @return power
	 */
	public static HashMap<String, Integer> power(Integer base, Integer exponent) {
		HashMap<String, Integer> power = new HashMap<String, Integer>();
		Integer result = base;

		if (base == null && exponent == null) {
			return null;
		}
		if (exponent == 0) {
			result = 1;
		} else {
			for (int repetetion = 1; repetetion < exponent; repetetion++) {
				result = base * result;
			}
		}

		// add key and value in hashmap
		power.put("'base'", base);
		power.put("'exponent'", exponent);
		power.put("'result'", result);

		return power;
	}

}
