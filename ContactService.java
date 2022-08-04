package Contact;

import java.util.ArrayList;



public class ContactService {
	//Declare ArrayList to hold contacts
	public ArrayList<Contact> contactList;
	
	//ArrayList constructor
	public ContactService() {
		contactList = new ArrayList<Contact>();
	}
	//Create contactList and add contact
	public ContactService(Contact contact) {
        contactList = new ArrayList<Contact>();
        contactList.add(contact);
    }
	
	
	//Method to add new contact if not existing
	public boolean addContact(Contact contact) {
        if(lookupContact(contact.getContactId()) != null) {
            return false;
        }
        contactList.add(contact);
        return true;
    }
	
	
	//Method to remove a contact
	public boolean deleteContact(String contactId) {		///ID
        Contact retrieved = lookupContact(contactId);				///ID
        if (retrieved != null) {
            contactList.remove(retrieved);
            return true;
        }
        return false;
	}
	//Method to update first name
	public boolean updateFirstName(String contactId, String firstName) {	///ID
        Contact retrieved = lookupContact(contactId);								///ID
        if(retrieved != null) {
            retrieved.setFirstName(firstName);
            return true;
        }

        return false;
    }
	//Method to update last name
	public boolean updateLastName(String contactId, String lastName) {				///ID
        Contact retrieved = lookupContact(contactId);							///ID
        if(retrieved != null) {
            retrieved.setLastName(lastName);
            return true;
        }

        return false;
	}
	
	//Method to update phone number
	public boolean updatePhoneNumber(String contactId, String phoneNumber) {			///ID
        Contact retrieved = lookupContact(contactId);										///ID
        if(retrieved != null) {
            retrieved.setPhoneNumber(phoneNumber);
            return true;
        }

        return false;
	}
	
	//Method to update address
	public boolean updateAddress(String contactId, String address) {						///ID		
        Contact retrieved = lookupContact(contactId);									///id
        if(retrieved != null) {
            retrieved.setAddress(address);
            return true;
        }

        return false;
    }
	
	//Method to lookup contact
	public Contact lookupContact(String contactId) {									//ID
        for(Contact contact : contactList) {
            if(contactId.equals(contact.getContactId())) {					///beginning only  ID
                return contact;
            }
        }

        return null;
	}
	
	//Method to display all contacts in the arrayList
	public void displayContacts() {
		for(Contact contact : contactList) {
			System.out.println(contact.getContactId() + ", " + contact.getFirstName() + ", " + contact.getLastName() + ", " + contact.getPhoneNumber() + ", " + contact.getAddress());
		}
	}
}


