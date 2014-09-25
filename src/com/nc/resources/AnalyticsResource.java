package com.nc.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/reports")
public class AnalyticsResource {
	
	@GET
	@Path("/blogCount")
	public Response getBlogCounts(){
		
		return Response.ok().build();
	}
	
	@GET
	@Path("/users")
	public Response getBlogHits(){
		
		return Response.ok().build();
	}
}
