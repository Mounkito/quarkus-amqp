package org.yohan;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

@ApplicationScoped
public class GreetingConsumer {

    private final Logger logger = Logger.getLogger(GreetingConsumer.class);

    @Incoming("in")
    public void receive(Greeting msg) {
        logger.info("Got a movie: " + msg.message);
    }
}