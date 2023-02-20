package com.sity.mskafka.config;


import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "Sity", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener Received: "+ data + ":(");
    }


}
