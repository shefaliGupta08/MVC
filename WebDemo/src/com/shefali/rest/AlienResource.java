package com.shefali.rest;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	AlienRepository repo = new AlienRepository();

@GET // Fetching a resource
@Produces(MediaType.APPLICATION_XML) // .....Content Negotiation
public List<Alien> getAliens()
{
	//System.out.println("Get alien called");
	
	return repo.getAliens();
	
}
@Path("alien/{id}")
@GET // Fetching a resource
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON}) // From server to client
public Alien getAlien(@PathParam("id") int id)
{
	return repo.getAlien(id);
}

@POST // Creating a resource
@Path("alien")
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON}) // From client to server
public Alien createAlien(Alien a1)
{
System.out.println(a1);
repo.create(a1);
return a1;
}
@PUT // updating a resource
@Path("alien")
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON}) // From client to server
public Alien updateAlien(Alien a1)
{
System.out.println(a1);

if (repo.getAlien(a1.getId()).getId() == 0)
{

	repo.create(a1);

}
else {
repo.update(a1);
}
return a1;
}

@DELETE
@Path("alien/{id}")
public Alien killAlien(@PathParam("id") int id)
{
	Alien a = repo.getAlien(id);
     
	if(a.getId()!=0)
	
	repo.delete(id);
	return a;
	
}
}


