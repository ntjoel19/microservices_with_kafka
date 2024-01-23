package com.example.kafka_initiation.controller;


import com.example.kafka_initiation.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/api")
public class RestController {

    @Autowired
    ProducerService producerService;
    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("message") String message) {
        producerService.sendMessageToTopic(message);
    }
}
