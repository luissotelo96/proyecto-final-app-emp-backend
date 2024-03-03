package com.eam.proyectofinalappemp.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "booking")
public class Booking extends BaseEntity {

	@Column(name = "check_in")
	private Date checkIn;

	@Column(name = "check_out")
	private Date checkOut;

	@Column(name = "state")
	private int state;

	@Column(name = "total_price")
	private double totalPrice;

	@Column(name = "booking_date")
	private Date bookingDate;

	@ManyToOne
	@JoinColumn(name = "room_id", referencedColumnName = "id")
	private Room room;

	@ManyToOne
	@JoinColumn(name = "hotel_id", referencedColumnName = "id")
	private Hotel hotel;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	public Booking() {

	}

	public Booking(Date checkIn, Date checkOut, int state, double totalPrice, Date bookingDate) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.state = state;
		this.totalPrice = totalPrice;
		this.bookingDate = bookingDate;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

}
