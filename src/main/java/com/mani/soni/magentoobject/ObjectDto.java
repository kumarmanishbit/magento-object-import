package com.mani.soni.magentoobject;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjectDto {

    @JsonProperty("results")
    private List<Result> results = null;
    @JsonProperty("info")
    private Info info;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Dob {

        @JsonProperty("date")
        private String date;
        @JsonProperty("age")
        private Integer age;

        @JsonProperty("date")
        public String getDate() {
            return date;
        }

        @JsonProperty("date")
        public void setDate(String date) {
            this.date = date;
        }

        @JsonProperty("age")
        public Integer getAge() {
            return age;
        }

        @JsonProperty("age")
        public void setAge(Integer age) {
            this.age = age;
        }

    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Coordinates {

        @JsonProperty("latitude")
        private String latitude;
        @JsonProperty("longitude")
        private String longitude;

        @JsonProperty("latitude")
        public String getLatitude() {
            return latitude;
        }

        @JsonProperty("latitude")
        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        @JsonProperty("longitude")
        public String getLongitude() {
            return longitude;
        }

        @JsonProperty("longitude")
        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Id {

        @JsonProperty("name")
        private String name;
        @JsonProperty("value")
        private String value;

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("value")
        public String getValue() {
            return value;
        }

        @JsonProperty("value")
        public void setValue(String value) {
            this.value = value;
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Info {

        @JsonProperty("seed")
        private String seed;
        @JsonProperty("results")
        private Integer results;
        @JsonProperty("page")
        private Integer page;
        @JsonProperty("version")
        private String version;

        @JsonProperty("seed")
        public String getSeed() {
            return seed;
        }

        @JsonProperty("seed")
        public void setSeed(String seed) {
            this.seed = seed;
        }

        @JsonProperty("results")
        public Integer getResults() {
            return results;
        }

        @JsonProperty("results")
        public void setResults(Integer results) {
            this.results = results;
        }

        @JsonProperty("page")
        public Integer getPage() {
            return page;
        }

        @JsonProperty("page")
        public void setPage(Integer page) {
            this.page = page;
        }

        @JsonProperty("version")
        public String getVersion() {
            return version;
        }

        @JsonProperty("version")
        public void setVersion(String version) {
            this.version = version;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Location {

        @JsonProperty("street")
        private Street street;
        @JsonProperty("city")
        private String city;
        @JsonProperty("state")
        private String state;
        @JsonProperty("country")
        private String country;
        @JsonProperty("postcode")
        private String postcode;
        @JsonProperty("coordinates")
        private Coordinates coordinates;
        @JsonProperty("timezone")
        private Timezone timezone;

        @JsonProperty("street")
        public Street getStreet() {
            return street;
        }

        @JsonProperty("street")
        public void setStreet(Street street) {
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

        @JsonProperty("state")
        public String getState() {
            return state;
        }

        @JsonProperty("state")
        public void setState(String state) {
            this.state = state;
        }

        @JsonProperty("country")
        public String getCountry() {
            return country;
        }

        @JsonProperty("country")
        public void setCountry(String country) {
            this.country = country;
        }

        @JsonProperty("postcode")
        public String getPostcode() {
            return postcode;
        }

        @JsonProperty("postcode")
        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        @JsonProperty("coordinates")
        public Coordinates getCoordinates() {
            return coordinates;
        }

        @JsonProperty("coordinates")
        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        @JsonProperty("timezone")
        public Timezone getTimezone() {
            return timezone;
        }

        @JsonProperty("timezone")
        public void setTimezone(Timezone timezone) {
            this.timezone = timezone;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Login {

        @JsonProperty("uuid")
        private String uuid;
        @JsonProperty("username")
        private String username;
        @JsonProperty("password")
        private String password;
        @JsonProperty("salt")
        private String salt;
        @JsonProperty("md5")
        private String md5;
        @JsonProperty("sha1")
        private String sha1;
        @JsonProperty("sha256")
        private String sha256;

        @JsonProperty("uuid")
        public String getUuid() {
            return uuid;
        }

        @JsonProperty("uuid")
        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        @JsonProperty("username")
        public String getUsername() {
            return username;
        }

        @JsonProperty("username")
        public void setUsername(String username) {
            this.username = username;
        }

        @JsonProperty("password")
        public String getPassword() {
            return password;
        }

        @JsonProperty("password")
        public void setPassword(String password) {
            this.password = password;
        }

        @JsonProperty("salt")
        public String getSalt() {
            return salt;
        }

        @JsonProperty("salt")
        public void setSalt(String salt) {
            this.salt = salt;
        }

        @JsonProperty("md5")
        public String getMd5() {
            return md5;
        }

        @JsonProperty("md5")
        public void setMd5(String md5) {
            this.md5 = md5;
        }

        @JsonProperty("sha1")
        public String getSha1() {
            return sha1;
        }

        @JsonProperty("sha1")
        public void setSha1(String sha1) {
            this.sha1 = sha1;
        }

        @JsonProperty("sha256")
        public String getSha256() {
            return sha256;
        }

        @JsonProperty("sha256")
        public void setSha256(String sha256) {
            this.sha256 = sha256;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Name {

        @JsonProperty("title")
        private String title;
        @JsonProperty("first")
        private String first;
        @JsonProperty("last")
        private String last;

        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        @JsonProperty("title")
        public void setTitle(String title) {
            this.title = title;
        }

        @JsonProperty("first")
        public String getFirst() {
            return first;
        }

        @JsonProperty("first")
        public void setFirst(String first) {
            this.first = first;
        }

        @JsonProperty("last")
        public String getLast() {
            return last;
        }

        @JsonProperty("last")
        public void setLast(String last) {
            this.last = last;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Picture {

        @JsonProperty("large")
        private String large;
        @JsonProperty("medium")
        private String medium;
        @JsonProperty("thumbnail")
        private String thumbnail;

        @JsonProperty("large")
        public String getLarge() {
            return large;
        }

        @JsonProperty("large")
        public void setLarge(String large) {
            this.large = large;
        }

        @JsonProperty("medium")
        public String getMedium() {
            return medium;
        }

        @JsonProperty("medium")
        public void setMedium(String medium) {
            this.medium = medium;
        }

        @JsonProperty("thumbnail")
        public String getThumbnail() {
            return thumbnail;
        }

        @JsonProperty("thumbnail")
        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Registered {

        @JsonProperty("date")
        private String date;
        @JsonProperty("age")
        private Integer age;

        @JsonProperty("date")
        public String getDate() {
            return date;
        }

        @JsonProperty("date")
        public void setDate(String date) {
            this.date = date;
        }

        @JsonProperty("age")
        public Integer getAge() {
            return age;
        }

        @JsonProperty("age")
        public void setAge(Integer age) {
            this.age = age;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Result {

        @JsonProperty("gender")
        private String gender;
        @JsonProperty("name")
        private Name name;
        @JsonProperty("location")
        private Location location;
        @JsonProperty("email")
        private String email;
        @JsonProperty("login")
        private Login login;
        @JsonProperty("dob")
        private Dob dob;
        @JsonProperty("registered")
        private Registered registered;
        @JsonProperty("phone")
        private String phone;
        @JsonProperty("cell")
        private String cell;
        @JsonProperty("id")
        private Id id;
        @JsonProperty("picture")
        private Picture picture;
        @JsonProperty("nat")
        private String nat;

        @JsonProperty("gender")
        public String getGender() {
            return gender;
        }

        @JsonProperty("gender")
        public void setGender(String gender) {
            this.gender = gender;
        }

        @JsonProperty("name")
        public Name getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(Name name) {
            this.name = name;
        }

        @JsonProperty("location")
        public Location getLocation() {
            return location;
        }

        @JsonProperty("location")
        public void setLocation(Location location) {
            this.location = location;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("login")
        public Login getLogin() {
            return login;
        }

        @JsonProperty("login")
        public void setLogin(Login login) {
            this.login = login;
        }

        @JsonProperty("dob")
        public Dob getDob() {
            return dob;
        }

        @JsonProperty("dob")
        public void setDob(Dob dob) {
            this.dob = dob;
        }

        @JsonProperty("registered")
        public Registered getRegistered() {
            return registered;
        }

        @JsonProperty("registered")
        public void setRegistered(Registered registered) {
            this.registered = registered;
        }

        @JsonProperty("phone")
        public String getPhone() {
            return phone;
        }

        @JsonProperty("phone")
        public void setPhone(String phone) {
            this.phone = phone;
        }

        @JsonProperty("cell")
        public String getCell() {
            return cell;
        }

        @JsonProperty("cell")
        public void setCell(String cell) {
            this.cell = cell;
        }

        @JsonProperty("id")
        public Id getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Id id) {
            this.id = id;
        }

        @JsonProperty("picture")
        public Picture getPicture() {
            return picture;
        }

        @JsonProperty("picture")
        public void setPicture(Picture picture) {
            this.picture = picture;
        }

        @JsonProperty("nat")
        public String getNat() {
            return nat;
        }

        @JsonProperty("nat")
        public void setNat(String nat) {
            this.nat = nat;
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Street {

        @JsonProperty("number")
        private Integer number;
        @JsonProperty("name")
        private String name;

        @JsonProperty("number")
        public Integer getNumber() {
            return number;
        }

        @JsonProperty("number")
        public void setNumber(Integer number) {
            this.number = number;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Timezone {

        @JsonProperty("offset")
        private String offset;
        @JsonProperty("description")
        private String description;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("offset")
        public String getOffset() {
            return offset;
        }

        @JsonProperty("offset")
        public void setOffset(String offset) {
            this.offset = offset;
        }

        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        @JsonProperty("description")
        public void setDescription(String description) {
            this.description = description;
        }
    }
}