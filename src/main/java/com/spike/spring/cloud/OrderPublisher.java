package com.spike.spring.cloud;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.InboundChannelAdapter;

@EnableBinding(OrdersSource.class)
public class OrderPublisher {
    @InboundChannelAdapter(channel = OrdersSource.OUTPUT)
    public String publish() {
        return "order is here";
    }
}
