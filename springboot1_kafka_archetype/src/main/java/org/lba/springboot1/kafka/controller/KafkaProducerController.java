package org.lba.springboot1.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaProducerController {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaProducerController.class);

	@Value("${kafka.topic.create}")
	private String createTopic;

	@Value("${kafka.topic.read}")
	private String readTopic;

	@Value("${kafka.topic.update}")
	private String updateTopic;

	@Value("${kafka.topic.delete}")
	private String deleteTopic;
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	@GetMapping("/publish/echo")
	public String publishMessage(@RequestParam("message") String message) throws Exception {
		LOG.debug("*** publishMessage - START ***");
		LOG.debug("** message: {}",message);
		kafkaTemplate.send(readTopic, message);
		LOG.debug("*** publishMessage -   END ***");
		return "Message ok: " + message;
	}

}
