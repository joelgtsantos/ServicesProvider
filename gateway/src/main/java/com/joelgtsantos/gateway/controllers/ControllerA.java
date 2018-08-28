/**
 * 
 */
package com.joelgtsantos.gateway.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.joelgtsantos.gateway.api.v1.model.EntitiesABCList;
/*import com.joelgtsantos.api.v1.model.CustomerDTO;
import com.joelgtsantos.api.v1.model.CustomerListDTO;*/
import com.joelgtsantos.gateway.services.ServiceA;
import com.joelgtsantos.gateway.services.ServiceB;
import com.joelgtsantos.gateway.services.ServiceC;
import io.micrometer.core.annotation.Timed;


/**
 * @author Joel Santos
 *
 * spring5-rest-api
 * 2018
 */
@RestController
@RequestMapping(ControllerA.BASE_URL)

public class ControllerA {

	public static final String BASE_URL = "/api/v1/rest";
    private final ServiceA serviceA;
    private final ServiceB serviceB;
    private final ServiceC serviceC;
    
    public ControllerA(ServiceA serviceA, ServiceB serviceB, ServiceC serviceC) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
        this.serviceC = serviceC;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Timed(value = "get.counter.requests", histogram = true, percentiles = { 0.95, 0.99 }, extraTags = { "version",
	"v1" })
    public EntitiesABCList getList(){
    	EntitiesABCList abcList = new EntitiesABCList();
    	abcList.setEntityAList(serviceA.getAll());
    	abcList.setEntityBList(serviceB.getAllB());
    	abcList.setEntityCList(serviceC.getAllC());
    	return abcList;
    }

}