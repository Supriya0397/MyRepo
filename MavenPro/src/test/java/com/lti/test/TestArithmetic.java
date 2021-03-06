package com.lti.test;

import static org.junit.Assert.assertEquals;
	import org.junit.Before;
	import org.junit.Test;

	import com.lti.code.Arithmetic;

	public class TestArithmetic {
		    private Arithmetic arth;
			
			@Before
			public void init() {
				arth = new Arithmetic();
			}
			
			
			@Test
			public void testSum() {
				assertEquals(10,arth.sum(4, 6));
			}
			
			@Test
			public void testSumAgain() {
				assertEquals(9,arth.sum(4, 5));
			}
			
			@Test
			public void testMax() {
				assertEquals(5,arth.max(3, 5));
			}
			
			@Test
			public void testMin() {
				assertEquals(3,arth.min(3, 5));
			}
			
		
}
