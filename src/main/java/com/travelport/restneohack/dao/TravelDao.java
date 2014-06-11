package com.travelport.restneohack.dao;

import com.travelport.restneohack.model.json.Account;

public interface TravelDao {

	public Account findById(String id);
}
