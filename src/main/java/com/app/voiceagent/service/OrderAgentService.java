package com.app.voiceagent.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OrderAgentService {

    private final ChatClient chatClient;

    public OrderAgentService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String ask(String message) {
        return chatClient
                .prompt()
                .user(message)
                .call()
                .content();
    }
}
