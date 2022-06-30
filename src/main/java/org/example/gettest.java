package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/gettest")
public class gettest {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getresponse(){
        return "Hello AIT";
    }
}
