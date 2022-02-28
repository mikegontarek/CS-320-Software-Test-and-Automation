package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1", "michael", "gontarek", "3207437555", "1115 3rd st sw");
		assertTrue(contact.getContactId().equals("1"));
		assertTrue(contact.getFirstName().equals("michael"));
		assertTrue(contact.getLastName().equals("gontarek"));
		assertTrue(contact.getPhoneNumber().equals("3207437555"));
		assertTrue(contact.getAddress().equals("1115 3rd st sw"));
		}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678970","michael","gontarek","3207437555","1115 3rd st sw");
		});	
	}
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null,"michael","gontarek","3207437555","1115 3rd st sw");
		});	
	}
	
	@Test void testFirstNameTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "michaellllll", "gontarek", "3207437555", "1115 3rd st sw");
		});
	}
	
	@Test void testFirstNameNull(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "gontarek", "3207437555", "1115 3rd st sw");
		});
	}
	
	@Test void testLastNameTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "michael", "gontarekkkkkkkk", "3207437555", "1115 3rd st sw");
		});
	}
	
	@Test void testLastNameNull(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "michael", null, "3207437555", "1115 3rd st sw");
		});
	}
	
	@Test void testPhoneNumberNotTen(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "michael", "gontarek", "32074375555", "1115 3rd st sw");
		});
	}
	
	@Test void testPhoneNumberNull(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "michael", "gontarek", null, "1115 3rd st sw");
		});
	}
	
	@Test void testAddressNull(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "michael", "gontarek", "3207437555", null);
		});
	}
	
	@Test void testAddressTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "michael", "gontarek", "3207437555", "1115 3rd st sw                     ");
		});
	}
	
	
}
