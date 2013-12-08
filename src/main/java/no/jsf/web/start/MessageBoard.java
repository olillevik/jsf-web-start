package no.jsf.web.start;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class MessageBoard {
    
    private List<Message> messages = new ArrayList<Message>();
    
    public List<Message> getMessages() {
        return messages;
    }
    
    public void addMessage(Message message) {
        messages.add(message);
    }
}
