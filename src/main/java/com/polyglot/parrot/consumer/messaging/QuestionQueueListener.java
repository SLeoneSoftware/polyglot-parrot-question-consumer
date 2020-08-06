package com.polyglot.parrot.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@EnableBinding(Sink.class)
@Component
public class QuestionQueueListener {

	@StreamListener(target = Sink.INPUT)
    public void processQuestion(String question){
        System.out.println(question);
    }

}