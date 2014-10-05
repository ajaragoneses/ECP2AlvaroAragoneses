package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

	DecimalCollection dc;
	
	@Before
	public void init(){
		dc = new DecimalCollection();
		dc.add(1.0);
		dc.add(2.0);
		dc.add(3.0);
		dc.add(4.0);
	}
	
	@Test
	public void testDecimalCollection() {
		assertEquals(4, dc.size());
	}

	@Test
	public void testSize(){
		for(double i = 0.0; i < 10; i++){
			dc.add(i);
		}
		assertEquals(14, dc.size());
	}
	
	@Test
	public void testSum(){
		assertEquals(10.0, dc.sum(), 10e-5);
	}
	
	@Test
	public void testHigher(){
		dc.add(1.0);
		dc.add(5.0);
		assertEquals(5.0, dc.higher(), 10e-5);
	}
}
