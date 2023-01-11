/**
 * 
 */
package io.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author LAP-9
 *
 */
class SplitMethodTest {

	/**
	 * Test method for
	 * {@link io.test.SplitMethod#splitMethod(java.lang.String, char)}.
	 */
	@Test
	@DisplayName("Take null for both of the arguments")
	void testSplitMethodNull() {
		SplitMethod check = new SplitMethod();
		assertEquals(null, check.splitMethod(null, null));

	}

	@Test
	@DisplayName("Take an empty string as the first argument")
	void testSplitMethodFirstEmpty() {
		SplitMethod check = new SplitMethod();
		assertEquals(null, check.splitMethod("", ' '));
	}

	@Test
	@DisplayName("Take an empty string as the second argument")
	void testSplitMethodSecondEmpty() {
		SplitMethod check = new SplitMethod();
		ArrayList<String> stringArr = new ArrayList<String>();
		stringArr.add("Reverse");
		stringArr.add("me");
		stringArr.add("if");
		stringArr.add("you");
		stringArr.add("can");

		assertEquals(stringArr, check.splitMethod("Reverse me if you can", ' '));
	}

	@Test
	@DisplayName("Return an empty array, in case of exception")
	void testSplitMethodSeEmptyArray() {
		SplitMethod check = new SplitMethod();
		ArrayList<String> stringArr = new ArrayList<String>();
		assertEquals(stringArr, check.splitMethod(null, ' '));
	}
}
