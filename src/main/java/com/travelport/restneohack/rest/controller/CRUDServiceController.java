package com.travelport.restneohack.rest.controller;

import com.travelport.restneohack.dao.TravelDao;
import com.travelport.restneohack.dao.TravelerDaoSvcImpl;
import com.travelport.restneohack.model.domain.SearchReq;
import com.travelport.restneohack.model.domain.Travel;
import com.travelport.restneohack.model.domain.Traveler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



@Controller
@RequestMapping(value = "/rest")
public class CRUDServiceController {

    private static final String APPLICATION_JSON = "application/json";
    
    //Traveler traveler;
    
    @Autowired
    private TravelDao travelDao;
    
    
    TravelerDaoSvcImpl dataImpl;

    @RequestMapping(value = "/searchTravel", method = RequestMethod.POST, consumes = APPLICATION_JSON, produces = APPLICATION_JSON)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public Travel retrieveRecord(@RequestBody SearchReq request) throws Throwable {
        if (request == null) {
            throw new RuntimeException("Request cannot be empty");
        }
        Traveler traveler = dataImpl.createTraveler(new Traveler("Todd", "Helton", "toddhelton@retired.com"));
        
        
        System.out.println("Traveler email  = " + traveler.getEmailAddress());
        return travelDao.findById(request.getId());
    }

    @RequestMapping(value = "/searchTravel/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public Travel retrieveRecord(@PathVariable(value = "id") String id) throws Throwable {
        return travelDao.findById(id);
    }
}
