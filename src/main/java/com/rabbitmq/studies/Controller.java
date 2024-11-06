package com.rabbitmq.studies;

import com.rabbitmq.studies.Produtor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Produtor orderProducer;

    public Controller(Produtor orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping("/sendOrder")
    public String sendMsg(@RequestParam String msg) {
        orderProducer.sendOrder(msg);
        return "item: " + msg;
    }
}
