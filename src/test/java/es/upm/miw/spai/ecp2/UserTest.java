package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class UserTest {

	public User user;
	
	@Before
	public void init(){
		user = new User(1,"alvaro","aragoneses");
	}
	
	@Test
	public void testUser() {
		assertEquals(1, user.getNumber());
		assertEquals("Alvaro", user.getName());
		assertEquals("Aragoneses", user.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Alvaro Aragoneses", user.fullName());
	}
	
	@Test
	public void testInitials() {
		assertEquals("A.", user.initials());
	}
}
