package com.veera.stream.processor;

import com.veera.stream.domain.Data;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.GenericMessage;

@EnableBinding(Processor.class)
public class DataProcessor {

    private final Log logger = LogFactory.getLog(getClass());

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Message processUsageCost(Message payload) {
        logger.info("Data received..." + payload.getPayload());
        return new GenericMessage(payload.getPayload());
    }
}
