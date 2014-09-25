package com.nc.resources;

import java.net.UnknownHostException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mongodb.DB;
import com.mongodb.DBAddress;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.nc.resources.objects.UserDetails;


@Path("/")
public class LoginResource {
	
	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(UserDetails users) {
/*		try{
		Mongo mongo = new Mongo();
		DB conn = mongo.connect(new DBAddress(""));
		DBCollection coll = conn.getCollection("test");
		DBObject object = coll.findOne();
		} catch(Exception e) {
			return Response.serverError().build();
		}*/
		return Response.ok("Hello world " +users.getUsername() +":"+ users.getPassword() ).build();
	}
	
	
	@POST
	@Path("/signup")
	@Produces(MediaType.APPLICATION_JSON)
	public Response signUp(UserDetails users) {
/*		try{
		Mongo mongo = new Mongo();
		DB conn = mongo.connect(new DBAddress(""));
		DBCollection coll = conn.getCollection("test");
		DBObject object = coll.findOne();
		} catch(Exception e) {
			return Response.serverError().build();
		}*/
		return Response.ok("Signed Up " +users.getUsername() +":"+ users.getPassword() ).build();
	}
	
	
}
