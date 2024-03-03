package com.eam.proyectofinalappemp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "room_type")
public class RoomType extends BaseEntity {

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "roomType")
	private List<Room> roomList;

	public RoomType() {

	}

	public RoomType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
