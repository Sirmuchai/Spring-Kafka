package com.sity.mskafka.contoller;

import com.sity.mskafka.model.MessageRequest;
import com.sity.mskafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class ApiController {

    private KafkaService kafkaService;

    public ApiController(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @PostMapping("/message")
    public void  publish(@RequestBody MessageRequest request){
        kafkaService.publish(request);
    }


}
