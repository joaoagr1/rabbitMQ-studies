package com.rabbitmq.studies;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    public static final String QUEUE_NAME = "ordersQueue";

    @Bean
    public Queue ordersQueue() {

        return new Queue(QUEUE_NAME, true);
    }
}
