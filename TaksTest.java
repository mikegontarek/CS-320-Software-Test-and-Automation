package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Task;

class TaksTest {

	@Test
	void testTask() {
		Task task = new Task("1", "walking", "going for a walk");
		assertTrue(task.getTaskId().equals("1"));
		assertTrue(task.getName().equals("walking"));
		assertTrue(task.getDescription().equals("going for a walk"));
	}
	
	@Test
	void testTaskIdIsTooLong()	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345678912", "walking", "going for a walk");
		});
	}
	
	@Test
	void testTaskIdIsNull()	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "walking", "going for a walk");
		});
	}
	
	@Test
	void testNameIsTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1,", "walking with all of my best friends, hope this is too long", "going for a walk");
		});
	}
	
	@Test
	void testNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1,", null, "going for a walk");
		});
	}
	
	@Test
	void testDescriptionIsTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1,", "walking", "going for a walk with all of my friends today,  This is going to be such a fun day walking around the lakes!");
		});
	}
	
	@Test
	void testDescriptionIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1,", "walking", null);
		});
	}

}
