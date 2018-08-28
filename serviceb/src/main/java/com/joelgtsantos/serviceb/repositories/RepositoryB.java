/**
 * 
 */
package com.joelgtsantos.serviceb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joelgtsantos.serviceb.api.v1.domain.EntityB;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
public interface RepositoryB extends JpaRepository<EntityB, Long> {

}
