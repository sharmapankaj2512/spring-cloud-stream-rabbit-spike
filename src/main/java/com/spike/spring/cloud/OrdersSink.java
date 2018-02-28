package com.spike.spring.cloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface OrdersSink {
    String INPUT = "ordersInput";

    @Input(OrdersSink.INPUT)
    MessageChannel input();
}
