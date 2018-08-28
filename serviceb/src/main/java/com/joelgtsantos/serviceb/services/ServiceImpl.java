/**
 * 
 */
package com.joelgtsantos.serviceb.services;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.stereotype.Service;

import com.joelgtsantos.serviceb.api.v1.domain.EntityB;
import com.joelgtsantos.serviceb.repositories.RepositoryB;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
@Service
public class ServiceImpl implements ServiceB{
	
	private final RepositoryB repositoryB;
	
	
	public ServiceImpl(RepositoryB repositoryB) {
		this.repositoryB = repositoryB;
	}

	/* (non-Javadoc)
	 * @see com.joelgtsantos.gateway.services.ServiceA#getAll()
	 */
	@Override
	public List<EntityB> getAll() {
		// TODO Auto-generated method stub
		return this.repositoryB.findAll();
	}
}
