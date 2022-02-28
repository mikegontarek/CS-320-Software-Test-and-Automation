package Contact;

import java.util.ArrayList;
import Contact.AppointmentService;

public class AppointmentService {
	//Declare Array list to hold appointments
	public ArrayList<Appointment> appointmentList;
	
	//ArrayList constructor
	public AppointmentService() {
		appointmentList = new ArrayList<Appointment>();
	}
	//Create appointmentList and add list
	public AppointmentService(Appointment apppointment) {
		appointmentList = new ArrayList<Appointment>();
		appointmentList.add(apppointment);
	}
	//Method to add new appointment if not existing
	public boolean addAppointment(Appointment appointment) {
		if(lookupAppointment(appointment.getAppointmentId()) != null) {
			return false;
			}
		appointmentList.add(appointment);
		return true;
	}
	//Method to delete appointments
	public boolean deleteAppointment(String appointmentId) {
		Appointment retrieved = lookupAppointment(appointmentId);
		if (retrieved != null)	{
			appointmentList.remove(retrieved);
			return true;
		}
		return false;
	}
	
	//Method to lookup appointment
	public Appointment lookupAppointment(String appointmentId) {
		for(Appointment appointment : appointmentList) {
			if(appointmentId.equals(appointment.getAppointmentId())) {
				return appointment;
			}
		}
		
		return null;
	}

}
