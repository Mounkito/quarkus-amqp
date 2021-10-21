package org.yohan;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class GreetingProducer {

    @Inject
    @Channel("out")
    Emitter<Greeting> emitter;

    public void send(Greeting msg) {
        emitter.send(msg);
    }
}