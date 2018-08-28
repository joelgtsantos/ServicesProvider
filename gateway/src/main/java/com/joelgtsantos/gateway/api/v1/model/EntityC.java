/**
 * 
 */
package com.joelgtsantos.gateway.api.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityC {
	private Long id;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
