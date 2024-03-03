package com.eam.proyectofinalappemp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol extends BaseEntity {

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "rol")
	private List<User> users;

	public Rol() {

	}

	public Rol(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
