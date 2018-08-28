/**
 * 
 */
package com.joelgtsantos.gateway.api.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.joelgtsantos.gateway.api.v1.domain.EntityA;

/**
 * @author Joel Santos
 *
 * gateway
 * 2018
 */
public class EntitiesABCList {
	private List<EntityA> entityAList;
	private List<EntityB> entityBList;
	private List<EntityC> entityCList;
	
	public EntitiesABCList() {
		this.entityAList = new ArrayList<>();
		this.entityBList = new ArrayList<>();
		this.entityCList = new ArrayList<>();
	}
	
	public List<EntityA> getEntityAList() {
		return entityAList;
	}
	public void setEntityAList(List<EntityA> entityAList) {
		this.entityAList = entityAList;
	}
	public List<EntityB> getEntityBList() {
		return entityBList;
	}
	public void setEntityBList(List<EntityB> entityBList) {
		this.entityBList = entityBList;
	}
	public List<EntityC> getEntityCList() {
		return entityCList;
	}
	public void setEntityCList(List<EntityC> entityCList) {
		this.entityCList = entityCList;
	}
}
