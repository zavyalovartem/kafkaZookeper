package com.example.intro.repository;

import com.example.intro.entities.ConsumedMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumedMessageRepository extends JpaRepository<ConsumedMessage, Long> {
    List<ConsumedMessage> findTop10ByOrderByDateDesc();
}
