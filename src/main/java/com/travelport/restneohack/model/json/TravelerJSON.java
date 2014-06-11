package com.travelport.restneohack.model.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravelerJSON {

    @JsonProperty("ID")
    private String id;
    
    @JsonProperty("Email")
    private String email;
    
    @JsonProperty("FirstName")
    private String firstName;
    
    @JsonProperty("LastName")
    private String lastName;
    
    @JsonProperty("Street")
    private String street;
    
    @JsonProperty("City")
    private String city;
    
    @JsonProperty("State")
    private String state;
    
    @JsonProperty("Country")
    private String country;
    
    @JsonProperty("Account")
    private String account;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
