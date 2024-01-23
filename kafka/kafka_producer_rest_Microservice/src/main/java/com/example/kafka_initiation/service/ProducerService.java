package com.example.kafka_initiation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    //Kafka template params : the name of the topic and the message
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate ;

    public void sendMessageToTopic(String message) {

        kafkaTemplate.send("namekTopic", message);
    }

}
