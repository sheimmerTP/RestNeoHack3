package com.travelport.restneohack.model.dao;

import com.travelport.restneohack.dao.TravelDao;
import com.travelport.restneohack.model.json.Account;
import org.springframework.stereotype.Service;
@Service
public class TravelDaoImpl implements TravelDao {

	public Account findById(String id) {
		Account travel = new Account();
		travel.setId(id);
		travel.setDetail("Detail of :"+id);
		return travel;
	}

}
