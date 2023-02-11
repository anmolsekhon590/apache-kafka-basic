package com.anmolsekhon.apachekafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ApacheKafkaListeners {
    @KafkaListener(
            topics = "book",
            groupId = "groupId" // this is here so that if we create partitions they can read from the same partition/topic
    )
    void listener(String data) {
        System.out.println("Listener received data: " + data);
    }
}
