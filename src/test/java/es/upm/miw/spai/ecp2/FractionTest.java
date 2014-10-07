package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FractionTest {

	private  Fraction fraction;
	 
	@Before
	 public void before() {
		 fraction = new Fraction(1,2);
	 }

	@Test
	public void testIsImpropia() { 
		assertEquals(fraction.isImpropia(), false);
	 }

	@Test
	public void testSuma() { 
		Fraction f2 = new Fraction(2,3);
		assertEquals(fraction.suma(f2).decimal(), new Fraction(7,6).decimal(),0.02);
	 }

}
