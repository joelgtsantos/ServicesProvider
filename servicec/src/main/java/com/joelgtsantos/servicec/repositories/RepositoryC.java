/**
 * 
 */
package com.joelgtsantos.servicec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joelgtsantos.servicec.api.v1.domain.EntityC;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
public interface RepositoryC extends JpaRepository<EntityC, Long> {

}
