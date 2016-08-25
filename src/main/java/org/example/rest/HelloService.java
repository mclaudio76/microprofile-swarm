package org.example.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;
import javax.ws.rs.PUT;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;

@Path("/helloservice")
public class HelloService {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("--> GET INVOKED ").build();
	}

	@DELETE
	@Path("/{id}")
	public Response doDelete(@PathParam("id") Long id) {
		return Response.noContent().build();
	}

	@PUT
	@Consumes({"text/plain", "application/json"})
	public Response doPut(String entity) {
		return Response.created(
				UriBuilder.fromResource(HelloService.class).build()).build();
	}

	@POST
	@Consumes({"text/plain", "application/json"})
	public Response doPost(String entity) {
		return Response.created(
				UriBuilder.fromResource(HelloService.class).build()).build();
	}
}