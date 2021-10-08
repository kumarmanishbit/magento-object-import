package com.mani.soni.magentoobject;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="magento_customer")
public class MagentoCustomer {

	// annotate the class as an entity and map to db table

	// define the fields

	// annotate the fields with db column names

	// ** set up mapping to InstructorDetail entity

	// create constructors

	// generate getter/setter methods

	// generate toString() method

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="id")
	private int id;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="email")
	private String email;

	@Column(name="city")
	private String city;

	@Column(name="postCode")
	private String postCode;

	@Column(name="street")
	private String street;

	@Column(name="country")
	private String country;

	@Column(name="countryId")
	private String countryId;

	@Column(name="regionId")
	private Integer regionId;

	@Column(name="regionCode")
	private String regionCode;

	@Column(name="region")
	private String region;

	@Column(name="phone")
	private String phone;


	public MagentoCustomer() {

	}

	public MagentoCustomer(String firstName, String lastName, String email, String city, String postCode,
						   String street, String country, String countryId,
						   Integer regionId,
						   String regionCode, String region, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.city = city;
		this.postCode = postCode;
		this.street = street;
		this.country = country;
		this.countryId = countryId;
		this.regionId = regionId;
		this.regionCode = regionCode;
		this.region = region;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPhone() {
		return phone;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}











