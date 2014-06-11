package com.travelport.restneohack.rest.controller;

import com.travelport.restneohack.model.dao.AccountDaoSvcImpl;
import com.travelport.restneohack.model.domain.Account;
import com.travelport.restneohack.model.json.AccountJSON;
import com.travelport.restneohack.model.json.SaveAccountReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(value = "/rest")
public class CRUDServiceController {

    private static final String APPLICATION_JSON = "application/json";
    @Autowired
    private AccountDaoSvcImpl actDaoImpl;

    @RequestMapping(value = "/saveTravel", method = RequestMethod.POST, consumes = APPLICATION_JSON, produces = APPLICATION_JSON)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public AccountJSON storeRecord(@RequestBody AccountJSON account) throws Throwable {
        if (account == null) {
            throw new RuntimeException("Request cannot be empty");
        }

        Account accountDB = actDaoImpl.createAccount(new Account(account.getName(), account.getEmail()));
        //Traveler traveler = actDaoImpl.createAccount(new Account("Todd", "Helton", "toddhelton@retired.com"));

        account.setId(String.valueOf(accountDB.getId()));

        System.out.println("Account email  = " + accountDB.getEmailAddress());
        return account;
    }

    @RequestMapping(value = "/searchTravel/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public AccountJSON retrieveRecord(@PathVariable(value = "id") String id) throws Throwable {
        Long idLong = Long.valueOf(id);
        return map(actDaoImpl.findAccountById(idLong));
    }

    private AccountJSON map(Account account) {
        
        AccountJSON acct = new AccountJSON();
        if (account.getId() != null) {
            acct.setId(account.getId().toString());
        }
        acct.setEmail(account.getEmailAddress());
        acct.setName(account.getName());
        return acct;
    }
}
