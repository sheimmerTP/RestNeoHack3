package com.travelport.restneohack.model.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveTravelerReq {

	@JsonProperty("ID")
	private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
}
