package com.cup.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;

@Path("/phone")
public class PhoneJSONService {

	@BadgerFish
	@GET
	@Path("/get")
	@Produces("application/json")
	public List<Phone> getListJSON(){
		ArrayList<Phone> phones = new ArrayList<Phone>();
			
			Phone phone = new Phone();
			phone.setAge(13);
			phone.setId("motorola-defy-with-motoblur");
			phone.setName("Motorola DEFY with MOTOBLUR");
			phone.setSnippet("Are you ready for everything life throws your way?");
			
			Phone phone1 = new Phone();
			phone1.setAge(14);
			phone1.setId("Nexus S");
			phone1.setName("Nexus S");
			phone1.setSnippet("Fast just got faster with Nexus S.");
		
			Phone phone2 = new Phone();
			phone2.setAge(15);
			phone2.setId("MOTOROLA XOO");
			phone2.setName("MOTOROLA XOOM");
			phone2.setSnippet("The Next, Next Generation tablet.");
			
			phones.add(phone);
			phones.add(phone1);
			phones.add(phone2);
		
		return phones;
	}
}
