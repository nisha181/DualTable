package com.cognizant.model;

public class Address {
    public Address(String houseno) {
		super();
		this.houseno = houseno;
	}
	public Address() {
		super();
	}
	public Address(String houseno, String city) {
		super();
		this.houseno = houseno;
		this.city = city;
	}
	private String houseno;
    private String city;
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", city=" + city + "]";
	}
}
