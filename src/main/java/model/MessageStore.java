package model;

public class MessageStore {

	private String message;
	
	public MessageStore() {
		setMessage("A default message has been generated.");
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
