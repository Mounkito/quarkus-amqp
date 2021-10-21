package org.yohan;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @Inject
    GreetingProducer producer;

    @POST
    public Response send(Greeting msg) {
        producer.send(msg);
        // Return an 202 - Accepted response.
        return Response.accepted().build();
    }
}