package com.cup.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;
 
@Path("/movie")
public class JSONService {

//	@BadgerFish
//	@GET
//	@Path("/get")
//	@Produces("application/json")
//	public Movie getMovieInJSON() {
// 
//		Movie movie = new Movie();
//		movie.setName("Transformers: Dark of the Moon");
//		movie.setDirector("Michael Bay");
//		movie.setYear(2011);
// 
//		return movie; 
// 
//	}
	
	@BadgerFish
	@GET
	@Path("/get")
	@Produces("application/json")
	public List<Movie> getListJSON(){
		ArrayList<Movie> movieL = new ArrayList<Movie>();
			Movie movie = new Movie();
			movie.setName("Transformers: Dark of the Moon");
			movie.setDirector("Michael Bay");
			movie.setYear(2011);
			
			Movie movie2 = new Movie();
			movie2.setName("Transformers: Translate");
			movie2.setDirector("Michael Bay#");
			movie2.setYear(2013);
			
			movieL.add(movie);
			movieL.add(movie2);
		
		return movieL;
	}
 
}
