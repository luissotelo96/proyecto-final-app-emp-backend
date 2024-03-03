package com.eam.proyectofinalappemp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "contract_detail")
	private String contractDetail;

	@Column(name = "phone_number")
	private Long phoneNumber;

	@Column(name = "address")
	private String address;

	@ManyToOne
	@JoinColumn(name = "rol_id", referencedColumnName = "id")
	private Rol rol;

	public User() {

	}

	public User(String name, String email, String password, String contractDetail, Long phoneNumber, String address) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.contractDetail = contractDetail;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContractDetail() {
		return contractDetail;
	}

	public void setContractDetail(String contractDetail) {
		this.contractDetail = contractDetail;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
