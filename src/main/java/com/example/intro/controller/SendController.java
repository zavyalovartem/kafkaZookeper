package com.example.intro.controller;

import com.example.intro.Message;
import lombok.Data;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Random;

@RestController
@RequestMapping("send")
@Data
public class SendController {
    private final KafkaTemplate<String, Message> kafkaTemplate;

    @RequestMapping("/sendTest")
    public void send(){
        Random rnd = new Random();
        for (int i = 0; i < 5; i++){
            Message msg = new Message();
            msg.setExample(rnd.nextInt());
            msg.setTimestamp(new Timestamp(System.currentTimeMillis()));
            kafkaTemplate.send("test", msg);
        }
    }
}
