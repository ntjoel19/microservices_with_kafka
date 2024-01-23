package com.example.kafka_initiation;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaInitiationApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaInitiationApplication.class, args);
    }

}
