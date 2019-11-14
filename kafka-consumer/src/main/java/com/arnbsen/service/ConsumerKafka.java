package com.arnbsen.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerKafka {

    @KafkaListener(topics = "demo", groupId = "demo_group")
    public void consume(String message) throws IOException {
        System.out.println(message);
    }


}