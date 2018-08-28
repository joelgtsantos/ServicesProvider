/**
 * 
 */
package com.joelgtsantos.serviceb.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.joelgtsantos.serviceb.api.v1.domain.EntityB;
import com.joelgtsantos.serviceb.services.ServiceB;


/**
 * @author Joel Santos
 *
 * spring5-rest-api
 * 2018
 */
@RestController
@RequestMapping(ControllerB.BASE_URL)
public class ControllerB {

	public static final String BASE_URL = "/api/v1/b";
    private final ServiceB serviceB;
    public ControllerB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EntityB> getListofB(){
    	return serviceB.getAll();
    }

}