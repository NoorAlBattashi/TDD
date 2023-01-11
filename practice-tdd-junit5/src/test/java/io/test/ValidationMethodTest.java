/**
 * 
 */
package io.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author LAP-9
 *
 */
class ValidationMethodTest {

	/**
	 * Test method for {@link io.test.ValidationMethod#calculateParenthesesWithStack(java.lang.String)}.
	 * @exception
	 */
	@Test
	@DisplayName("Take null as an arguments")
	void testCalculateParenthesesWithStackNull(){
		ValidationMethod checkMethod = new ValidationMethod();
		
		assertThrows(NullPointerException.class, ()->{ checkMethod.calculateParenthesesWithStack(null);});
	}
	@Test
	@DisplayName("Take an empty string as an argument.")
	void testCalculateParenthesesWithStackEmpty() throws Exception  {
		ValidationMethod checkMethod = new ValidationMethod();
		String test = "";
		assertEquals(false, checkMethod.calculateParenthesesWithStack(test));
	}
	@Test
	@DisplayName("Can throw an exception")
	void testCalculateParenthesesWithStackExeption() {
		ValidationMethod checkMethod = new ValidationMethod();
		assertThrows(Exception.class, ()->{ checkMethod.calculateParenthesesWithStack(null);} );
		
	}
}
