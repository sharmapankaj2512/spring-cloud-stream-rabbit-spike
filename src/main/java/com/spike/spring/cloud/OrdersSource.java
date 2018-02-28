package com.spike.spring.cloud;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OrdersSource {
    String OUTPUT = "ordersOutput";

    @Output(OrdersSource.OUTPUT)
    MessageChannel output();
}
