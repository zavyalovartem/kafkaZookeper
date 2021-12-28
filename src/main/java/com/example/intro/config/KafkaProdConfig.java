package com.example.intro.config;

import com.example.intro.Message;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProdConfig {
//    @Value("${spring.kafka.producer.key-serializer}")
//    private String keySerializer;
//
//    @Value("${spring.kafka.bootstrap-servers}")
//    private String bootstrap;
//
//    @Value("${spring.kafka.producer.value-serializer}")
//    private String valueSerializer;

//    @Bean
//    public ProducerFactory<String, Message> producerFactory(){
//        Map<String, Object> props = new HashMap<>();
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrap);
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, keySerializer);
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, valueSerializer);
//        return new DefaultKafkaProducerFactory<>(props);
//    }

    @Bean
    public KafkaTemplate<String, Message> kafkaTemplate(ProducerFactory<String, Message> producerFactory){
        return new KafkaTemplate<>(producerFactory);
    }

    @Bean
    public NewTopic testTopic(){
        return new NewTopic("test", 3, (short) 1);
    }
}
