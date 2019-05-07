package org.lba.springboot1.kafka.service.impl;

import org.lba.springboot1.kafka.service.KafkaConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumerServiceImpl.class);
	
	public String helloClient() {
	
		return "Client executed";
	}
	
    @KafkaListener(topics = "${kafka.topic.read}",groupId="${kafka.consumer.groupid}")
    public void consumeString(String message) {
    	LOG.info(String.format("#### -> Consumed message -> %s", message));
    }
}

 