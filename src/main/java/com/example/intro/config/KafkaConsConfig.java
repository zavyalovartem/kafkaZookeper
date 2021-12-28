package com.example.intro.config;

import com.example.intro.Message;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConsConfig {
//    @Value("${spring.kafka.consumer.key-deserializer}")
//    private String keyDeserializer;
//
//    @Value("${spring.kafka.bootstrap-servers}")
//    private String bootstrap;
//
//    @Value("${spring.kafka.consumer.value-deserializer}")
//    private String valueDeserializer;

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Message> kafkaListenerContainerFactory(ConsumerFactory<String, Message> consumerFactory){
        ConcurrentKafkaListenerContainerFactory<String, Message> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory);
        return factory;
    }
}
