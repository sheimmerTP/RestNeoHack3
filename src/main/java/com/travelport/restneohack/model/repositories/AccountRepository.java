/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.travelport.restneohack.model.repositories;

import com.travelport.restneohack.model.domain.Account;
import org.springframework.data.neo4j.repository.GraphRepository;


public interface AccountRepository extends GraphRepository<Account>{


	Account findByEmailAddress(String emailAddress);
        

}