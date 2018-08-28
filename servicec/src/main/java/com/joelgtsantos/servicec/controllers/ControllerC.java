/**
 * 
 */
package com.joelgtsantos.servicec.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.joelgtsantos.servicec.api.v1.domain.EntityC;
import com.joelgtsantos.servicec.services.ServiceC;


/**
 * @author Joel Santos
 *
 * spring5-rest-api
 * 2018
 */
@RestController
@RequestMapping(ControllerC.BASE_URL)
public class ControllerC {

	public static final String BASE_URL = "/api/v1/c";
    private final ServiceC serviceC;
    public ControllerC(ServiceC serviceC) {
        this.serviceC = serviceC;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EntityC> getListofC(){
    	return serviceC.getAll();
    }

}