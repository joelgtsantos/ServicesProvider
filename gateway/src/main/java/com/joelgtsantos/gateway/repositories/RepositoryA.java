/**
 * 
 */
package com.joelgtsantos.gateway.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joelgtsantos.gateway.api.v1.domain.EntityA;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
public interface RepositoryA extends JpaRepository<EntityA, Long> {

}
