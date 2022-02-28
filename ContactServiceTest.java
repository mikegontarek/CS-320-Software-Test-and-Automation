package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

class ContactServiceTest {
	
	@Test
	void testLookupContact() {
	   ContactService contactService = new ContactService();
	   Contact contact = new Contact("1", "michael", "gontarek", "3207437555", "1115 3rd st sw");
	   Contact contact1 = new Contact("2", "brett", "gontarek", "3207437555", "1115 3rd st sw");
	   contactService.addContact(contact);
	   
	   Contact retrieved = contactService.lookupContact("1");
	   assertTrue(contact.getContactId().equals("1"));
	   
	   Contact retrieved1 = contactService.lookupContact("2");
	   assertTrue(contact1.getContactId().equals("2"));
	}
	
	@Test
	void testUpdateFirstName() {
	   ContactService contactService = new ContactService();
	   Contact contact = new Contact("1", "michael", "gontarek", "3207437555", "1115 3rd st sw");
	   contactService.addContact(contact);

	   contactService.updateFirstName("1", "brett");

	   Contact retrieved = contactService.lookupContact("1");
	   assertTrue(contact.getContactId().equals("1"));
	   assertTrue(contact.getFirstName().equals("brett"));
	}
	
	@Test
	void testUpdateLastName() {
	   ContactService contactService = new ContactService();
	   Contact contact = new Contact("1", "michael", "gontarek", "3207437555", "1115 3rd st sw");
	   contactService.addContact(contact);

	   contactService.updateLastName("1", "Gontarek");

	   Contact retrieved = contactService.lookupContact("1");
	   assertTrue(contact.getContactId().equals("1"));
	   assertTrue(contact.getLastName().equals("Gontarek"));
	  	}
	
	@Test
	void testUpdatePhoneNumber() {
	   ContactService contactService = new ContactService();
	   Contact contact = new Contact("1", "michael", "gontarek", "3207437555", "1115 3rd st sw");
	   contactService.addContact(contact);
	   contactService.updatePhoneNumber("1", "3202268164");

	   Contact retrieved = contactService.lookupContact("1");
	   assertTrue(contact.getContactId().equals("1"));
	   assertTrue(contact.getPhoneNumber().equals("3202268164"));
	}
	
	@Test
	void testUpdateAddress() {
	   ContactService contactService = new ContactService();
	   Contact contact = new Contact("1", "michael", "gontarek", "3207437555", "1115 3rd st sw");
	   contactService.addContact(contact);
	   contactService.updateAddress("1", "11904 70th place n");

	   Contact retrieved = contactService.lookupContact("1");
	   assertTrue(contact.getContactId().equals("1"));
	   assertTrue(contact.getAddress().equals("11904 70th place n"));
	}
	
	@Test
	void testUpdateAddressNull() {
	   ContactService contactService = new ContactService();
	   Contact contact = new Contact("1", "michael", "gontarek", "3207437555", "1115 3rd st sw");
	   contactService.addContact(contact);
	   contactService.updateAddress("1", null);

	   Contact retrieved = contactService.lookupContact("1");
	   assertFalse(contact.getContactId().equals(null));
	  
	}
	
	
	@Test 
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1", "michael", "gontarek", "3207437555", "1115 3rd st sw");
		contactService.addContact(contact);
		contactService.deleteContact("1");
		
		Contact retrieved = contactService.lookupContact("1");
		
		
		
	}
	
}

