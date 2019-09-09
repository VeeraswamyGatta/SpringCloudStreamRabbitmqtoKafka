package com.veera.stream.kafka;

import com.veera.stream.domain.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;

@EnableBinding(Sink.class)
public class KafkaItemWriter {

	private static final Logger logger = LoggerFactory.getLogger(KafkaItemWriterApplication.class);
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	private static final String TOPIC = "springcloud-stream-kafka-mesages";
	@StreamListener(Sink.INPUT)
	public void process(Message payload) {
		kafkaTemplate.send(TOPIC, payload.getPayload());
		logger.info(" Message published to Kafka successfully" + payload.getPayload().toString());
	}
}