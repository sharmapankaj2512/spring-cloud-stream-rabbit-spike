package com.spike.spring.cloud;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(OrdersSink.class)
public class OrderSubscriber {
    @StreamListener(OrdersSink.INPUT)
    public void subscribe(String message) {
        System.out.println(message);
    }
}
