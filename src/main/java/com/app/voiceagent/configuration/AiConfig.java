package com.app.voiceagent.configuration;

import com.app.voiceagent.tool.OrderTools;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

    @Bean
    ChatClient chatClient(ChatClient.Builder builder, OrderTools orderTools) {
        return builder
                .defaultSystem(""" 
                       You are a helpful order assistant. 
                       
                       Keep your responses short and clear 
                       because they will be converted into speech. 
                       
                       Use the available tool whenever the user asks about an order status. 
                       Never invent order information.
                       
                       """)
                .defaultAdvisors(new SimpleLoggerAdvisor())
                .defaultTools(orderTools)
                .build();
    }
}
