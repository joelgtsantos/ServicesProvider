/**
 * 
 */
package com.joelgtsantos.gateway.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.joelgtsantos.gateway.api.v1.model.EntityC;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
@Service
public class ServiceCImpl implements ServiceC {
	
private final EntityC[] entityCList;
	
	public ServiceCImpl(EntityC[] entityCList) {
		this.entityCList = entityCList;
	}
	
	/* (non-Javadoc)
	 * @see com.joelgtsantos.gateway.services.ServiceB#getAllB()
	 */
	@Override
	public List<EntityC> getAllC() {
		return Arrays.asList(entityCList);
	}
}
