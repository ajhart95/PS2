package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	final int odd = 5;
	final int even = 6;
	final int prime = 7;
	
	MyInteger odd_num = new MyInteger(odd);
	MyInteger even_num = new MyInteger(even);
	MyInteger prime_num = new MyInteger(prime);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void OddTest() {

		assertTrue(odd_num.isOdd());
		assertFalse(even_num.isOdd());
		
	}
	
	@Test
	public void EvenTest() {

		assertTrue(even_num.isEven());
		assertFalse(odd_num.isEven());
		
	}
	@Test
	public void PrimeTest() {

		assertTrue(prime_num.isPrime());
		assertFalse(even_num.isPrime());
		
	}
	
	@Test
	public void PrimeTestMyInt() {

		assertTrue(prime_num.isPrime(prime_num));
		assertFalse(prime_num.isPrime(even_num));
	
	}
	
	@Test
	public void EvenTestMyInt() {
		
		assertTrue(even_num.isEven(even_num));
		assertFalse(even_num.isEven(odd_num));
			
	}

	@Test
	public void OddTestMyInt() {
		
		assertTrue(odd_num.isOdd(odd_num));
		assertFalse(odd_num.isOdd(even_num));
			
	}
	@Test
	public void EqualsTest() {

		assertTrue(prime_num.equals(prime));
		assertFalse(even_num.equals(prime));
		
	}
	
	@Test
	public void EqualsTestMyInt() {

		assertTrue(prime_num.equals(prime_num));
		assertFalse(even_num.equals(prime));
		
	}

}
