package com.eam.proyectofinalappemp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel")
public class Hotel extends BaseEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "rating")
	private int rating;

	@ManyToOne
	@JoinColumn(name = "city_id", referencedColumnName = "id")
	private City city;

	@OneToMany(mappedBy = "hotel")
	private List<HotelImage> images;

	@OneToMany(mappedBy = "hotel")
	private List<Room> rooms;

	public Hotel() {

	}

	public Hotel(String name, String address, int rating) {
		this.name = name;
		this.address = address;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
