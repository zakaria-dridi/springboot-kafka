package com.dridi.springbootkafka.kafka;

import com.dridi.springbootkafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "test-consumer",groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message recieved -> %s",user.toString()));
    }

}
