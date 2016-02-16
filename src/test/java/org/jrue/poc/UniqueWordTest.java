package org.jrue.poc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for Unique Word
 */
public class UniqueWordTest {

	@Test
	public void whenWordIsRepeatedThenResultShouldBeUnique() {		
		assertEquals(UniqueWord.get("dessert"),"dessert");
		assertEquals(UniqueWord.get("onetwoonetwothree"),"onetwoonetwothree");
		assertEquals(UniqueWord.get("inforinfor"),"infor");
		assertEquals(UniqueWord.get("oneoneone"),"one");
		assertEquals(UniqueWord.get("samplesamplesamplE"),"sample");
		assertEquals(UniqueWord.get("onethingonething"),"onething");
		assertEquals(UniqueWord.get("testsetstest"),"testsetstest");
		assertEquals(UniqueWord.get("racecarracecar"),"racecar");			
	}
}
