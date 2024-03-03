package com.eam.proyectofinalappemp.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class Room extends BaseEntity {

	@Column(name = "room_number")
	private int roomNumber;

	@Column(name = "price_per_night")
	private double pricePerNight;

	@Column(name = "availability")
	private boolean availability;

	@ManyToOne
	@JoinColumn(name = "room_type_id", referencedColumnName = "id")
	private RoomType roomType;

	@ManyToOne
	@JoinColumn(name = "hotel_id", referencedColumnName = "id")
	private Hotel hotel;

	@OneToMany(mappedBy = "room")
	private List<RoomAmenities> roomAmenitiesList;

	public Room() {

	}

	public Room(int roomNumber, double pricePerNight, boolean availability) {
		this.roomNumber = roomNumber;
		this.pricePerNight = pricePerNight;
		this.availability = availability;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

}
