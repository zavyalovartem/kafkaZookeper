package com.example.intro.controller;

import com.example.intro.entities.ConsumedMessage;
import com.example.intro.service.ConsumedMessagesRepositoryService;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Display")
@Data
public class DataDisplayController {
    private final ConsumedMessagesRepositoryService repositoryService;

    @RequestMapping("/lastTen")
    public List<ConsumedMessage> displayLastTen(){
        return repositoryService.getLastTenSortedByDateDesc();
    }
}
