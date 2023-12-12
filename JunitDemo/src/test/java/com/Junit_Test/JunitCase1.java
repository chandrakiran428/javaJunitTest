package com.Junit_Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JunitCase1 {

	@Test
	@DisplayName("TestCase1")
	void testCheckStrings() {
		
		
	
	//	fail("Not yet implemented");
		testCase1 obj = new testCase1();
		testCase1 cat = new testCase1();
		testCase1 dog = cat;
		testCase1 x = null;
		assertEquals(true , obj.checkStrings("aabhaa"));
		assertSame(cat,dog);
		assertNull(x);
	 
		
		char[] expected = { 'J', 'u', 'p', 'i', 't', 'e', 'r' };
	    char[] actual = "Jupiter".toCharArray();

	    assertArrayEquals(expected, actual, "Arrays should be equal");
	
	}
	
	@Test
	  void setUp(){
	      System.out.println("Setup called");
	   }
	@Test
	 void tearDown(){
		System.out.println("tearDown called");
	   }

	@Test
	
	@DisplayName("TestCase2")
	void testCheckString() {
		//	fail("Not yet implemented");
			testCase1 obj = new testCase1();
			assertEquals(false , obj.checkStrings("kiran"));
			
			
		}
	@Test
	@BeforeEach
	void test() {
		System.out.println("Ready to execute");
		
	}
	@Test
	@AfterEach
	void tests() {
		System.out.println("done");
		
	}
	@Test
	public void testGeneratePassword() {
		String name= "Joseph";
		int yearOFBirth = 1998;
	
		String expected = "Jose1998";
	
		testCase1 passwordGenerator = new testCase1();
		String actual = passwordGenerator.generatePassword(name, yearOFBirth);
		
		assertEquals(expected, actual);
	}
	@Test
	public void testGeneratePassword1() {
       
		testCase1 passwordGenerator = new testCase1();

		assertEquals("Kira2003",passwordGenerator.generatePassword("KiranChandra", 2003));
	}
	

}
