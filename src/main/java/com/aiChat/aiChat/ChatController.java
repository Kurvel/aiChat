package com.aiChat.aiChat;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    
    @PostMapping("/chat")
    public String postChat(@RequestBody String prompt) {

        return "hej!";
    }
}
