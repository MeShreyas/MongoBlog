package com.nc.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/video")
public class VideoResource {

	@Path("/upload")
	@Consumes("multipart/form-data")
	public Response uploadVideo(MultipartFormDataInput formData){
		
		
		return Response.ok().build();
	}
}
