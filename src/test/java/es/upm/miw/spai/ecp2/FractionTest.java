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



}
