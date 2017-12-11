package com.example.demo.Test7.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class EvanController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getReponse")
    public EvanResponse say(EvanMessage message) throws Exception{
        Thread.sleep(3000);
        return new EvanResponse("welcome," + message.getName() + "!") ;
    }

}
