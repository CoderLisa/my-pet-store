package com.mypetstore;

import com.mypetstore.domain.Pet;
import com.mypetstore.service.MyPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/pets")
@Scope("request")
public class MyPetStoreResource {

    @Autowired
    MyPetService myPetService;

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Pet> getAvailablePets() {
        List<Pet> availablePets = myPetService.getPets();
        return availablePets;
    }

}
