package com.eam.proyectofinalappemp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "room_amenities")
public class RoomAmenities extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "room_id", referencedColumnName = "id")
	private Room room;

	@ManyToOne
	@JoinColumn(name = "amenities_id", referencedColumnName = "id")
	private Amenities amenities;

	public RoomAmenities() {

	}
}
