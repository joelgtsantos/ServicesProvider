/**
 * 
 */
package com.joelgtsantos.gateway.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.joelgtsantos.gateway.api.v1.model.EntityB;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
@Service
public class ServiceBImpl implements ServiceB {

	private final EntityB[] entityBList;
	
	public ServiceBImpl(EntityB[] entityBList) {
		this.entityBList = entityBList;
	}
	
	/* (non-Javadoc)
	 * @see com.joelgtsantos.gateway.services.ServiceB#getAllB()
	 */
	@Override
	public List<EntityB> getAllB() {
		return Arrays.asList(entityBList);
	}

}
