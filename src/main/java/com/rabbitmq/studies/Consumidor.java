package com.rabbitmq.studies;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Consumidor {

    @RabbitListener(queues = Config.QUEUE_NAME)
    public void receiveOrder(String order) {
        System.out.println("Order received: " + order);

        processOrder(order);
    }

    private void processOrder(String order) {
        System.out.println("Processing order: " + order);

    }
}
