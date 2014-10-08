package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FractionTest {
	Fraction fr;
	Fraction f2;
	Fraction f3;

	@Before
	public void init(){
		fr = new Fraction (3,4);
		f2 = new Fraction (6,8);
		f3 = new Fraction (1,2);
	}
	
	@Test
	public void testFractionIntInt() {
		assertEquals(3,fr.getNumerator());
		assertEquals(4,fr.getDenominator());
	}
	
	@Test
	public void testFraction() {
		Fraction fract = new Fraction();
		assertEquals(1,fract.getNumerator());
		assertEquals(1,fract.getDenominator());
	}
	
	@Test
	public void testDecimal() {
		assertEquals(0.75,fr.decimal(), 10e-5);
	}

	@Test
	public void testIsImpropia() { 
		assertEquals(fr.isImpropia(), false);
	 }

	@Test
	public void testSuma() { 
		Fraction f2 = new Fraction(2,3);
		assertEquals((fr.suma(f2)).decimal(), new Fraction(17,12).decimal(),0.02);

	}
	
	@Test
	public void testIsEqual() {
		assertEquals(true,fr.isEqual(f2));
		assertEquals(false,fr.isEqual(f3));
	}

}
