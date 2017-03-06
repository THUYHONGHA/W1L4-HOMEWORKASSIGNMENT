package problem5;

import static org.junit.Assert.*;

import org.junit.Test;

import problem2.FindMinChar;
import problem4.Palindrome;

public class MyTestCase {

	@Test
	public void test() {
		char case1 = FindMinChar.findMinCharRec("Hello");
		assertEquals(case1, 'H');
		char case2 = FindMinChar.findMinCharRec("hello");
		assertEquals(case2, 'e');
	}
	
	@Test
	public void test1(){
		boolean case1= Palindrome.isPalindromeRec("abmba");
		assertEquals(case1, true);
		boolean case2= Palindrome.isPalindromeRec("aabbc");
		assertEquals(case2, false);
	}

	

}
