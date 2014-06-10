package com.travelport.restneohack.dao;

import com.travelport.restneohack.model.domain.Travel;

public class TravelDaoImpl implements TravelDao {

	public Travel findById(String id) {
		Travel travel = new Travel();
		travel.setId(id);
		travel.setDetail("Detail of :"+id);
		return travel;
	}

}
