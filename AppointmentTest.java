package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Contact.Appointment;

class AppointmentTest {


	@Test
	void testAppointment() {
		Date date = new Date();
		Appointment appointment = new Appointment("1", date, "remove teeth");
		assertTrue(appointment.getAppointmentId().equals("1"));
		assertTrue(appointment.getDate().before(date));
		assertTrue(appointment.getDescription().equals("remove teeth"));
	}
	
	@Test 
	void testAppoinmentIdTooLong()	{
		Date date = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("123456789123", date, "remove teeth");
		});
	}
	
	@Test
	void testAppointmentIdIsNull() {
		Date date = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, date, "remove teeth");
		});
	}
	
	@Test
	void testDateIsNull() {
		Date date = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", null, "remove teeth");
		});
	}
	
	@Test
	void testDateIsBeforeCurrentDate() {
		Date date = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", date, "remove teeth");
		});
	}

	@Test
	void testDescriptionIsNull() {
		Date Date = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", Date ,null);
		});
	}
	
	@Test
	void testDescriptionIsTooLong() {
		Date Date = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1", Date ,"We are going to the dentist, Once there they tak xrays to see how our teeth look.  Then they tell us that we need to have all four wisdome teeth out!!!!");
		});
	}
	
	
	
}
