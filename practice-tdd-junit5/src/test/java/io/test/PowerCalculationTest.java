/**
 * 
 */
package io.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author LAP-9
 *
 */
class PowerCalculationTest {

	/**
	 * Test method for {@link io.test.PowerCalculation#power(int, int)}.
	 */
	@Test
	@DisplayName("base: 0, exponent: 0")
	void testPowereExponent0() {
		PowerCalculation calculate = new PowerCalculation();
		HashMap<String, Integer> powerhaHashMap = new HashMap<String, Integer>();
		Integer base = 0;
		Integer exponent = 0;
		Integer result = (int) Math.pow(base, exponent);

		// add key and value in hashmap
		powerhaHashMap.put("'base'", base);
		powerhaHashMap.put("'exponent'", exponent);
		powerhaHashMap.put("'result'", result);

		assertEquals(powerhaHashMap, calculate.power(base, exponent));
	}

	@Test
	@DisplayName("base: null, exponent: null")
	void testPowereExponentNull() {
		PowerCalculation calculate = new PowerCalculation();
		assertEquals(null, calculate.power(null, null));
	}

	@Test
	@DisplayName("base: <any positive number>, exponent  <any positive number>")
	void testPowereExponentPositiv() {
		PowerCalculation calculate = new PowerCalculation();
		HashMap<String, Integer> powerhaHashMap = new HashMap<String, Integer>();
		Integer base = 3;
		Integer exponent = 6;
		Integer result = (int) Math.pow(base, exponent);

		// add key and value in hashmap
		powerhaHashMap.put("'base'", base);
		powerhaHashMap.put("'exponent'", exponent);
		powerhaHashMap.put("'result'", result);

		assertEquals(powerhaHashMap, calculate.power(base, exponent));
	}
}
