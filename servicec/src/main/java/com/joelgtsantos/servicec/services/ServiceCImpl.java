/**
 * 
 */
package com.joelgtsantos.servicec.services;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.stereotype.Service;

import com.joelgtsantos.servicec.api.v1.domain.EntityC;
import com.joelgtsantos.servicec.repositories.RepositoryC;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
@Service
public class ServiceCImpl implements ServiceC{
	
	private final RepositoryC repositoryC;
	
	
	public ServiceCImpl(RepositoryC repositoryC) {
		this.repositoryC = repositoryC;
	}

	/* (non-Javadoc)
	 * @see com.joelgtsantos.gateway.services.ServiceA#getAll()
	 */
	@Override
	public List<EntityC> getAll() {
		// TODO Auto-generated method stub
		return this.repositoryC.findAll();
	}
}
