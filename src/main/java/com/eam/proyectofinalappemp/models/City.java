package com.eam.proyectofinalappemp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cities")
public class City extends BaseEntity{

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "department_id", referencedColumnName = "id")
	private Department department;

	public City() {

	}

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
