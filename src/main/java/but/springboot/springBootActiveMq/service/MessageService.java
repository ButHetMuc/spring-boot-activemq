package but.springboot.springBootActiveMq.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(String message){
        jmsTemplate.convertAndSend("conversation",message);
    }
}
