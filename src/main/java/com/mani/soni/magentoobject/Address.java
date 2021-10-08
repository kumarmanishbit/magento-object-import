package com.mani.soni.magentoobject;

public class Address {

    private String postcode;

    private String street;

    private String city;

    private String telephone;

    private String countryId;

    public String getPostcode() {
        return postcode;
    }

    public Address(String postcode, String street, String city, String telephone, String countryId) {
        this.postcode = postcode;
        this.street = street;
        this.city = city;
        this.telephone = telephone;
        this.countryId = countryId;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
}
