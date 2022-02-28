package Contact;

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
		//GETTER METHODS
		//getter method to return contactId
		public String getContactId() {
			return contactId;
		}
		//getter method to return firstName
		public String getFirstName() {
			return firstName;
		}
		//getter method to return lastName
		public String getLastName() {
			return lastName;
		}
		//getter method to return phoneNumber
		public String getPhoneNumber() {
			return phoneNumber;
		}
		//getter method to return address
		public String getAddress() {
			return address;
		}
		
		//SETTER METHODS
		 
		//setter method to set firstName
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		//setter method to set lastName
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}		
		//setter method to set phoneNumber
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		//setter method to set address
		public void setAddress(String address) {
			this.address = address;
		}
		
}