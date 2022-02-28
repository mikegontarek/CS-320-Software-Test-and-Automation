package Contact;

public class Task {
	//Declare Task Variables
	private final String taskId;
	private String name;
	private String description;
	
	public Task(String taskId, String name, String description) {
		if(taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid taskID");
		}
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		
		this.taskId = taskId;
		this.name = name;
		this.description = description;
	}
	//GETTER METHODS
	//Getter method to return taskId
	public String getTaskId() {
		return taskId;
	}
	//getter method to return name
	public String getName() {
		return name;
	}
	//getter method to return description
	public String getDescription()	{
		return description;
	}
	
	//SETTER METHODS
	//setter method to set name
	public void setName(String name) {
		this.name = name;
	}
	//setter method to set description
	public void setDescription(String description) {
		this.description = description;
	}
	
}
