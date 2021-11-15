package Buzz;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaseBuzzTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void sholdReturn100() {
		FizzBuzz fz = new FizzBuzz();
		assertEquals(100, fz.getNumbers().length);
	}
	
	@Test
	public void mupltiplesOffFive() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("buzz", fb.fizzbuzz(5));
	}
	@Test
	public void mupltiplesOfThree() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("fizz", fb.fizzbuzz(3));
	}
	
	@Test
	public void mupltiplesOfFiveten() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("fizzbuzz", fb.fizzbuzz(15));
	}
	
}
