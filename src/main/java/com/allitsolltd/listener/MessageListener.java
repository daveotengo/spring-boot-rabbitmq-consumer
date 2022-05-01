package com.allitsolltd.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.allitsolltd.config.MQConfig;
import com.allitsolltd.model.CustomMessage;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE_A)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }

}