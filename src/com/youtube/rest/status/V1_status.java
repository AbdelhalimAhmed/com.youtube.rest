package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {
	
	private static final String api_version = "00.01.00";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p> Java web service  </p>";
	}
	
	
	@GET
	@Path("/version")
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<p>version:</p>" + api_version;
	}
	

}
