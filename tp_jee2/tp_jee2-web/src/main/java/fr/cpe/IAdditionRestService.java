package fr.cpe;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path("/add")
public interface IAdditionRestService{
	
	
	@GET
	@Produces("application/json")
	@Path("/")
	Double addition(@QueryParam("a") List<Double> a);	
}