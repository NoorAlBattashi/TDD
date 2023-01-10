/**
 * 
 */
package io.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Stack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author LAP-9
 *
 */
class ReverseStringMethodTest {

	/**
	 * Test method for {@link io.test.ReverseStringMethod#reverse(java.lang.String)}.
	 */
	@Test
	@DisplayName("Take null as an argument.")
	void testReverseNull() {
		ReverseStringMethod reverseString = new ReverseStringMethod();		
		assertEquals(null, reverseString.reverse(null));
	}
	@Test
	@DisplayName("Take an empty string as as argument.")
	void testReverseEmpty() {
		ReverseStringMethod reverseString = new ReverseStringMethod();	
		String sentenceString = "";
		assertEquals(null, reverseString.reverse(sentenceString));
	}
	@Test
	@DisplayName("Take a string with only a single character")
	void testReverseSingleChar() {
		ReverseStringMethod reverseString = new ReverseStringMethod();	
		String sentenceString = "A";
		assertEquals(null, reverseString.reverse(sentenceString));
	}


}
