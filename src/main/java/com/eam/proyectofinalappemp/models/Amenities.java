package com.eam.proyectofinalappemp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "amenities")
public class Amenities extends BaseEntity {

	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "amenities")
	private List<RoomAmenities> roomAmenitiesList;

	public Amenities() {

	}

	public Amenities(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
