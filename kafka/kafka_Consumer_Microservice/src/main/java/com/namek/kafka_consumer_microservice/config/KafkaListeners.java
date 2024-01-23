package com.namek.kafka_consumer_microservice.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "namekTopic",
            groupId =  "namekGroupID"
    )
    void listener(String data) {
        System.out.println("Listener receive: " + data );
    }
}
