package com.hcc.advweb;

public class Form_input {
	private int id;
	private int age;
	private String first_name;
	private String last_name;
	private String email;
	private String state;
	private String city;
	private String address;
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String get_first_name() {
		return first_name;
	}
	public String get_last_name() {
		return last_name;
	}
	public String get_email() {
		return email;
	}
	public String get_state() {
		return state;
	}
	public String get_city() {
		return city;
	}
	public String get_address() {
		return address;
	}
	public String get_gender() {
		return gender;
	}
	
	
	public String set_first_name() {
		this.first_name = first_name;
	}
	public String set_last_name() {
		this.last_name = last_name;
	}
	public String set_email() {
		this.email = email;
	}
	public String set_state() {
		this.state = state;
	}
	public String set_city() {
		this.city = city;
	}
	public String set_address() {
		this.address = address;
	}
	public String set_gender() {
		this.gender = gender;
	}
	
	
	public Form_input(int i, int a, String fn, String ln, String em, String st, String ci, String ad, String ge) {
		id = i;
		age = a;
		first_name = fn;
		last_name = ln;
		email = em;
		state = st;
		city = ci;
		address = ad;
		gender = ge;
	}

}
