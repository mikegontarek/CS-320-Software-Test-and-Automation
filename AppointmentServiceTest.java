package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import Contact.Appointment;
import Contact.AppointmentService;

class AppointmentServiceTest {

	@Test
	void testLookupAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Date date = new Date();
		Appointment appointment = new Appointment("1,", date, "remove teeth");
		appointmentService.addAppointment(appointment);
		
		Appointment retrieved = appointmentService.lookupAppointment("1");
		assertTrue(appointment.getAppointmentId().equals("1"));
		}
	
	@Test
	void testDeleteAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Date date = new Date();
		Appointment appointment = new Appointment("1", date, "remove teeth");
		appointmentService.addAppointment(appointment);
		appointmentService.deleteAppointment("1");
		
		Appointment retrieved = appointmentService.lookupAppointment("1");
	}
}
