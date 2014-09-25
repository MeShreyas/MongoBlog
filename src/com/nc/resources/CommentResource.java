package com.nc.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/comments")
public class CommentResource {
	
	@GET
	@Path("/count")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCountOfComments(@QueryParam("blogid")String blogId) {
		
		return Response.ok().build();
	}

	
	@GET
	@Path("/comments")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getComments(@QueryParam("blogid")String blogId) {
		
		return Response.ok().build();
	}
}
