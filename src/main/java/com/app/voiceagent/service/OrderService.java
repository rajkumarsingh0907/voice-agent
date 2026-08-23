package com.app.voiceagent.service;

import com.app.voiceagent.dto.OrderStatus;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public OrderStatus getOrderStatus(String orderId) {

        return new OrderStatus( orderId, "SHIPPED", "Tomorrow" );
    }
}
