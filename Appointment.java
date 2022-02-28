package Contact;

import java.util.Date;

public class Appointment {
	//Declare Appointment variables
		private final String appointmentId;
		private Date date;
		private String description;
		
		public Appointment(String appointmentId, Date date, String description) {
			if(appointmentId == null || appointmentId.length() > 10) {
				throw new IllegalArgumentException("Invalid appointmentId");
			}
			if(date == null || date.before(date) ) {
				throw new IllegalArgumentException("Invalid date");
			}
			if(description == null || description.length() > 50) {
				throw new IllegalArgumentException("Invalid description");
			}
			
			this.appointmentId = appointmentId;
			this.date = date;
			this.description= description;
		}
		//GETTER METHODS	
		//getter method to return apointmentId
		public String getAppointmentId() {
			return appointmentId;
		}
		//getter method to return date
		public Date getDate() {
			return date;
		}
		//getter method to return description
		public String getDescription() {
			return description;
		}
		
		//SETTER METHODS
		//setter method to set date
		public void setDate(Date date) {
			this.date = date;
		}
		//setter method to set description
		public void setDescription(String description) {
			this.description = description;
		}
		
		
			

}
