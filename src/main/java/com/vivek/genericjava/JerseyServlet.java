package com.vivek.genericjava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("hello")
public class JerseyServlet {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(){
    	
        return "Got it!";
    }
}
