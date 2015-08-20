package com.amithkoujalgi.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amithkoujalgi.services.interfaces.HelloServiceInterface;

@Component
@Path("/test")
public class HelloService
{
	@Autowired
	HelloServiceInterface svc;

	@GET
	@Path("/test")
	public Response test()
	{
		String result = svc.test();
		return Response.status( 200 ).entity( result ).build();
	}
}