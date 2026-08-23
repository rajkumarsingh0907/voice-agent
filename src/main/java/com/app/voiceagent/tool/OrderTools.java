package com.app.voiceagent.tool;

import com.app.voiceagent.dto.OrderStatus;
import com.app.voiceagent.service.OrderService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class OrderTools {

    private final OrderService orderService;

    public OrderTools(OrderService orderService) {
        this.orderService = orderService;
    }

    @Tool( description = "Get the current status of an order" )
    public OrderStatus getOrderStatus(String orderId) {
        return orderService.getOrderStatus(orderId);
    }
}
