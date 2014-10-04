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
		assertEquals("alvaro", user.getName());
		assertEquals("aragoneses", user.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("alvaro aragoneses", user.fullName());
	}
	
	@Test
	public void testInitials() {
		assertEquals("a.a.", user.initials());
	}
}
