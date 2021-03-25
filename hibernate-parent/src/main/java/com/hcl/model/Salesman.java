package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salesman {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SalesmanId")
	private int Salesman_id;
	@Column(name = "SalesmanName")
	private String Salesman_name;
	@Column(name = "SalesmanMobile")
	private String Salesman_mobile;
	@Column(name = "SalesmanEmail")
	private String Salesman_email;
	@Column(name = "SalesmanUsername")
	private String Salesman_username;
	@Column(name = "SalesmanPassword")
	private String Salesman_password;
	@Column(name = "SalesmanAddress")
	private String Salesman_addres;
	public int getSalesman_id() {
		return Salesman_id;
	}
	public void setSalesman_id(int salesman_id) {
		Salesman_id = salesman_id;
	}
	public String getSalesman_name() {
		return Salesman_name;
	}
	public void setSalesman_name(String salesman_name) {
		Salesman_name = salesman_name;
	}
	public String getSalesman_mobile() {
		return Salesman_mobile;
	}
	public void setSalesman_mobile(String salesman_mobile) {
		Salesman_mobile = salesman_mobile;
	}
	public String getSalesman_email() {
		return Salesman_email;
	}
	public void setSalesman_email(String salesman_email) {
		Salesman_email = salesman_email;
	}
	public String getSalesman_username() {
		return Salesman_username;
	}
	public void setSalesman_username(String salesman_username) {
		Salesman_username = salesman_username;
	}
	public String getSalesman_password() {
		return Salesman_password;
	}
	public void setSalesman_password(String salesman_password) {
		Salesman_password = salesman_password;
	}
	public String getSalesman_addres() {
		return Salesman_addres;
	}
	public void setSalesman_addres(String salesman_addres) {
		Salesman_addres = salesman_addres;
	}

	@Override
	public String toString() {
		return "Salesman [Salesman_id=" + Salesman_id + ", Salesman_name=" + Salesman_name + ", Salesman_mobile="
				+ Salesman_mobile + ", Salesman_email=" + Salesman_email + ", Salesman_username=" + Salesman_username
				+ ", Salesman_password=" + Salesman_password + ", Salesman_addres=" + Salesman_addres + "]";
	}
	public Salesman(int salesman_id, String salesman_name, String salesman_mobile, String salesman_email,
			String salesman_username, String salesman_password, String salesman_addres) {
		super();
		Salesman_id = salesman_id;
		Salesman_name = salesman_name;
		Salesman_mobile = salesman_mobile;
		Salesman_email = salesman_email;
		Salesman_username = salesman_username;
		Salesman_password = salesman_password;
		Salesman_addres = salesman_addres;
	}	

}
