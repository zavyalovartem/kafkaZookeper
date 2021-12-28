package com.example.intro.service;

import com.example.intro.Message;
import com.example.intro.entities.ConsumedMessage;
import lombok.Data;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Data
public class Listener {
    private final ConsumedMessagesRepositoryService repositoryService;

    @KafkaListener(topics = "test")
    public void listen(Message message) {
        ConsumedMessage consumedMessage = new ConsumedMessage();
        consumedMessage.setDate(message.getTimestamp());
        consumedMessage.setIntexample(message.getExample());
        repositoryService.save(consumedMessage);
    }
}
