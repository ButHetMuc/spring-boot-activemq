package but.springboot.springBootActiveMq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @JmsListener(destination = "conversation")
    public void listen(String message){
        System.out.println("message send from queue: " +message);
    }
}
