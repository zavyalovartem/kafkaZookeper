package com.example.intro.service;

import com.example.intro.entities.ConsumedMessage;
import com.example.intro.repository.ConsumedMessageRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ConsumedMessagesRepositoryService {
    private final ConsumedMessageRepository consumedMessageRepository;

    public void save(ConsumedMessage consumedMessage){
        consumedMessageRepository.save(consumedMessage);
    }

    public List<ConsumedMessage> getLastTenSortedByDateDesc(){
        return consumedMessageRepository.findTop10ByOrderByDateDesc();
    }
}
