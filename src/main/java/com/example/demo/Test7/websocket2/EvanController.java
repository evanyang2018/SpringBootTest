package com.example.demo.Test7.websocket2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class EvanController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String message) throws Exception {
        if (principal.getName().equals("evan")) {
            messagingTemplate.convertAndSendToUser("evan", "/queue/notifications",
                    principal.getName() + "-send:" + message);
        }else{
            messagingTemplate.convertAndSendToUser("yang", "/queue/notifications",
                    principal.getName() + "-send:" + message);
        }
    }


}
