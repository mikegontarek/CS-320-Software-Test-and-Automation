package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;
import Contact.Task;
import Contact.TaskService;

class TaskServiceTest {

	
	@Test
	void testLookupTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("1", "dancing", "Dancing with my daughter in the living room");
		Task task1 = new Task("2", "running", "Running with my daughter in the back yard");
		taskService.addTask(task);
		
		Task retrieved = taskService.lookupTask("1");
		assertTrue(task.getTaskId().equals("1"));
		
		Task retrieved1 = taskService.lookupTask("2");
		assertTrue(task.getTaskId().equals("2"));
		
	}
	
	@Test
	void testUpdateName() {
		   TaskService taskService = new TaskService();
		   Task task = new Task("1", "dancing", "Dancing with my daughter in the living room");
		   taskService.addTask(task);

		   taskService.updateName("1", "running");

		   Task retrieved = taskService.lookupTask("1");
		   assertTrue(task.getTaskId().equals("1"));
		   assertTrue(task.getName().equals("running"));
		}
	
	@Test
	void testUpdateDescription() {
		TaskService taskService = new TaskService();
		Task task = new Task("1", "Dancing", "Dancing with my daughter in the living room");
		taskService.addTask(task);
		
		taskService.updateDescription("1", "Dancing with my daughter in the kitchen");
		
		Task retrieved = taskService.lookupTask("1");
		assertTrue(task.getTaskId().equals("1"));
		assertTrue(task.getDescription().equals("Dancing with my daughter in the kitchen"));
	}
	
	@Test
	void testRemoveTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("1", "Dancing", "Dancing with my daughter in the living room");
		taskService.addTask(task);
		taskService.deleteTask("1");
		
		Task retrieved = taskService.lookupTask("1");
	}
}

