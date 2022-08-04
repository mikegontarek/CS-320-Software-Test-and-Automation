package Contact;
import java.util.Scanner;


public class Contact {
	//Declare contact variables
		private final String contactId;
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String address;
		
		
		public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
			if(contactId == null || contactId.length() > 10) {
				throw new IllegalArgumentException("Invalid ContactID");
			}
			if(firstName == null || firstName.length() > 10) {
				throw new IllegalArgumentException("Invalid First Name");
			}
			if(lastName == null || lastName.length() > 10) {
				throw new IllegalArgumentException("Invalid Last Name");
			}
			if(phoneNumber == null || phoneNumber.length() != 10) {
				throw new IllegalArgumentException("Invalid Phone Number");
			}
			if(address == null ||  address.length() > 30) {
				throw new IllegalArgumentException("Invalid Address");
			}
			
			this.contactId = contactId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.address = address;
		}
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			ContactService CS= new ContactService();
			int choice = 0;
			
			// While loop that displays the menu for the user to choose from. 
			while(choice !=3) {
				System.out.println("Menu: ");
				System.out.println("1. Enter Contact");
				System.out.println("2. Display Contacts");
				System.out.println("3. Exit");
				System.out.println("Enter a Choice");
				choice=scanner.nextInt();
				
				// Switch statements that user chooses from the menu.
				switch(choice) {
				case 1:
					System.out.println("Enter Contact ID:");
					String contactId = scanner.next();

					System.out.println("Enter First Name:");
					String firstName = scanner.next();
					
					System.out.println("Enter Last Name: ");
					String lastName = scanner.next();
				
					System.out.println("Enter Phone Number: ");
					String phoneNumber = scanner.next();
					
					System.out.println("Enter Address: ");
					String address = scanner.next();
					address = address + scanner.nextLine();
					
					// Display contact information that was just entered. 
					
					System.out.println("Contact ID; " + contactId);
					System.out.println("First Name: " + firstName);
					System.out.println("Last Name: " + lastName);
					System.out.println("Phone Number: " + phoneNumber);
					System.out.println("Address: " + address);
					
					// Add contact into the array list
					Contact contact = new Contact(contactId, firstName, lastName, phoneNumber, address);
					
					// Call addContact to add to array list
					CS.addContact(contact);
					break;
					
				case 2:
					// If two print Display Contacts
					System.out.println("Display Contacts");
					
					// Call displayContacts to display the contact List
					CS.displayContacts();
					break;
					
				}
			}
			// If three print Good Bye!
			System.out.println("Good Bye!");
			
	
		}
		
		//GETTER METHODS
		
		public String getContactId() {
			return contactId;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public String getAddress() {
			return address;
		}
		
		
		//SETTER METHODS
		 
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}		

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
}