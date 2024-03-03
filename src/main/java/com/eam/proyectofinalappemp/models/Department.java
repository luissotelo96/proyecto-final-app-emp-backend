package com.eam.proyectofinalappemp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department extends BaseEntity{

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "department")
	private List<City> cities;

	public Department() {

	}

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
