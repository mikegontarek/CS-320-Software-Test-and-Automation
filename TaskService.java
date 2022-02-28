package Contact;

import java.util.ArrayList;
import Contact.Task;

public class TaskService {
	//Declare Array list to hold tasks
	public ArrayList<Task> taskList;
	
	//ArrayList constructor
	public TaskService() {
		taskList = new ArrayList<Task>();
	}
	// Create taskList and add task
	public TaskService(Task task) {
		taskList = new ArrayList<Task>();
		taskList.add(task);
	}
	//Method to add new task if not existing
	public boolean addTask(Task task) {
        if(lookupTask(task.getTaskId()) != null) {
            return false;
        }
        taskList.add(task);
        return true;
    }
	//Method to remove a Task
	public boolean deleteTask(String taskId) {
		Task retrieved = lookupTask(taskId);
		if (retrieved != null)	{
			taskList.remove(retrieved);
			return true;
		}
		return false;
	}
	//Method to update task name
	public boolean updateName(String taskId, String name) {
		Task retrieved = lookupTask(taskId);
		if(retrieved != null) {
			retrieved.setName(name);
			return true;
		}
		return false;
	}
	//Method to update task description
	public boolean updateDescription(String taskId, String description) {
		Task retrieved = lookupTask(taskId);
		if(retrieved != null) {
			retrieved.setDescription(description);
			return true;
		}
		return false;
	}
	
	//Method to lookup task
	public Task lookupTask(String taskId) {
		for(Task task : taskList) {
			if(taskId.equals(task.getTaskId())) {
				return task;
			}
		}
		
		return null;
	
	}
}
