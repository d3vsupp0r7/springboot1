package org.lba.springboot1.kafka.controller;

import org.lba.springboot1.kafka.service.KafkaConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka/consumer")
public class KafkaConsumerController {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumerController.class);

	@Value("${kafka.topic.create}")
	private String createTopic;

	@Value("${kafka.topic.read}")
	private String readTopic;

	@Value("${kafka.topic.update}")
	private String updateTopic;

	@Value("${kafka.topic.delete}")
	private String deleteTopic;
	
	@Autowired
	private KafkaConsumerService kafkaConsumerService;
	
	@GetMapping("/consume/echo")
	public String consumeMessage() throws Exception {
		LOG.debug("*** consumeMessage - START ***");
		kafkaConsumerService.helloClient();
		LOG.debug("*** consumeMessage -   END ***");
		return "Message consumed";
	}

}
