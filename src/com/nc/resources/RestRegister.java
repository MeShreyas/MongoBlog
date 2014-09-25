package com.nc.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RestRegister extends Application{

	private Set<Object> singletons = new HashSet<Object>();
	 
	public RestRegister() {
		singletons.add(new LoginResource());
		singletons.add(new CommentResource());
		singletons.add(new AnalyticsResource());
		singletons.add(new VideoResource());
	}
 
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
