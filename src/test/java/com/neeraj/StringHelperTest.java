package com.neeraj;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class executed");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class executed");
	}
	
	
	private StringHelper st=new StringHelper();
	@Before
	public void beforeMethod() {
		System.out.println("before executed");
	}
	@After
	public void afterMethod() {
		System.out.println("after executed");
		
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("BCDE",st.truncateAInFirst2Positions("AABCDE"));
		assertEquals("AA",st.truncateAInFirst2Positions("AAAA"));
		assertEquals("",st.truncateAInFirst2Positions("AA"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse(st.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertTrue(st.areFirstAndLastTwoCharactersTheSame("ABAB"));
		
	}
	
	@Test
	public void compareArrays() {
		int[] num1= {4,3,2,1};
		Arrays.sort(num1);
		int[] num2= {1,2,3,4};
		assertArrayEquals(num2, num1);
	}
	
	@Test(expected=NullPointerException.class)
	public void testException() {
		int[] num=null;
		Arrays.sort(num);
	}
	
	@Test(timeout=1)
	public void performanceTesting() {
		int[] num= {56,4,109};
		for(int i=0;i<1000000000;i++) {
			num[0]=i;
			Arrays.sort(num);
		}
	}

}
