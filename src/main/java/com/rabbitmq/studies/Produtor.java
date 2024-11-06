package com.rabbitmq.studies;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class Produtor {

    private final RabbitTemplate rabbitTemplate;

    public Produtor(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendOrder(String order) {
        rabbitTemplate.convertAndSend(Config.QUEUE_NAME, order);
        System.out.println("Order sent: " + order);
    }
}
