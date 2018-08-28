/**
 * 
 */
package com.joelgtsantos.gateway.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joelgtsantos.gateway.api.v1.domain.EntityA;
import com.joelgtsantos.gateway.repositories.RepositoryA;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
@Service
public class ServiceAImpl implements ServiceA{
	
	private final RepositoryA repositoryA;
	
	
	public ServiceAImpl(RepositoryA repositoryA) {
		this.repositoryA = repositoryA;
	}

	/* (non-Javadoc)
	 * @see com.joelgtsantos.gateway.services.ServiceA#getAll()
	 */
	@Override
	public List<EntityA> getAll() {
		// TODO Auto-generated method stub
		return this.repositoryA.findAll();
	}

}
