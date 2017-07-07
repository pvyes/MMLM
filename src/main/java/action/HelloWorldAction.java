package action;

import com.opensymphony.xwork2.*;

import model.MessageStore;

public class HelloWorldAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    
    private MessageStore messageStore;
    private static int helloCount = 0;
    private String userName;
     
    public String execute() throws Exception {        
        messageStore = new MessageStore() ;
        if (userName != null) {
            messageStore.setMessage("Hello " + userName);
        }
        helloCount++;
        return SUCCESS;
    }
    
    public String execute(String userName) throws Exception {        
        messageStore = new MessageStore() ;
        messageStore.setMessage("Hello" + userName);
        return SUCCESS;
    }

 
    public MessageStore getMessageStore() {
        return messageStore;
    }
 
    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
    
    public int getHelloCount() {
        return helloCount;
    }
 
    public void setHelloCount(int helloCount) {
        HelloWorldAction.helloCount = helloCount;
    }
    
    public String getUserName() {
    	return userName;
    }
    
    public void setUserName(String userName) {
    	this.userName = userName;
    }
 }
