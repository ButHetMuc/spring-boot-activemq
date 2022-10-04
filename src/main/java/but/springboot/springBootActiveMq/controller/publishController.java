package but.springboot.springBootActiveMq.controller;

import but.springboot.springBootActiveMq.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class publishController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable("message") String message){
        messageService.sendMessage(message);
        return message;
    }
}
