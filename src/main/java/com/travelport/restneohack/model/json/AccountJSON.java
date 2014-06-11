package com.travelport.restneohack.model.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountJSON {

    @JsonProperty("ID")
    private String id;
    
    @JsonProperty("Email")
    private String email;
    
    @JsonProperty("AccountName")
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
