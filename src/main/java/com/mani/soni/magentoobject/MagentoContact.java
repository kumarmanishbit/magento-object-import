package com.mani.soni.magentoobject;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MagentoContact {

    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("password")
    private String password;

    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Address {

        @JsonProperty("defaultShipping")
        private Boolean defaultShipping;
        @JsonProperty("defaultBilling")
        private Boolean defaultBilling;
        @JsonProperty("firstname")
        private String firstname;
        @JsonProperty("lastname")
        private String lastname;
        @JsonProperty("region")
        private Region region;
        @JsonProperty("postcode")
        private String postcode;
        @JsonProperty("street")
        private List<String> street = null;
        @JsonProperty("city")
        private String city;
        @JsonProperty("telephone")
        private String telephone;
        @JsonProperty("countryId")
        private String countryId;

        @JsonProperty("defaultShipping")
        public Boolean getDefaultShipping() {
            return defaultShipping;
        }

        @JsonProperty("defaultShipping")
        public void setDefaultShipping(Boolean defaultShipping) {
            this.defaultShipping = defaultShipping;
        }

        @JsonProperty("defaultBilling")
        public Boolean getDefaultBilling() {
            return defaultBilling;
        }

        @JsonProperty("defaultBilling")
        public void setDefaultBilling(Boolean defaultBilling) {
            this.defaultBilling = defaultBilling;
        }

        @JsonProperty("firstname")
        public String getFirstname() {
            return firstname;
        }

        @JsonProperty("firstname")
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        @JsonProperty("lastname")
        public String getLastname() {
            return lastname;
        }

        @JsonProperty("lastname")
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        @JsonProperty("region")
        public Region getRegion() {
            return region;
        }

        @JsonProperty("region")
        public void setRegion(Region region) {
            this.region = region;
        }

        @JsonProperty("postcode")
        public String getPostcode() {
            return postcode;
        }

        @JsonProperty("postcode")
        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        @JsonProperty("street")
        public List<String> getStreet() {
            return street;
        }

        @JsonProperty("street")
        public void setStreet(List<String> street) {
            this.street = street;
        }

        @JsonProperty("city")
        public String getCity() {
            return city;
        }

        @JsonProperty("city")
        public void setCity(String city) {
            this.city = city;
        }

        @JsonProperty("telephone")
        public String getTelephone() {
            return telephone;
        }

        @JsonProperty("telephone")
        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        @JsonProperty("countryId")
        public String getCountryId() {
            return countryId;
        }

        @JsonProperty("countryId")
        public void setCountryId(String countryId) {
            this.countryId = countryId;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Customer {

        @JsonProperty("email")
        private String email;
        @JsonProperty("firstname")
        private String firstname;
        @JsonProperty("lastname")
        private String lastname;
        @JsonProperty("addresses")
        private List<Address> addresses = null;

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("firstname")
        public String getFirstname() {
            return firstname;
        }

        @JsonProperty("firstname")
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        @JsonProperty("lastname")
        public String getLastname() {
            return lastname;
        }

        @JsonProperty("lastname")
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        @JsonProperty("addresses")
        public List<Address> getAddresses() {
            return addresses;
        }

        @JsonProperty("addresses")
        public void setAddresses(List<Address> addresses) {
            this.addresses = addresses;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Region {

        @JsonProperty("regionCode")
        private String regionCode;
        @JsonProperty("region")
        private String region;
        @JsonProperty("regionId")
        private Integer regionId;

        @JsonProperty("regionCode")
        public String getRegionCode() {
            return regionCode;
        }

        @JsonProperty("regionCode")
        public void setRegionCode(String regionCode) {
            this.regionCode = regionCode;
        }

        @JsonProperty("region")
        public String getRegion() {
            return region;
        }

        @JsonProperty("region")
        public void setRegion(String region) {
            this.region = region;
        }

        @JsonProperty("regionId")
        public Integer getRegionId() {
            return regionId;
        }

        @JsonProperty("regionId")
        public void setRegionId(Integer regionId) {
            this.regionId = regionId;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MagentoContact{");
        sb.append("customer=").append(customer);
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
