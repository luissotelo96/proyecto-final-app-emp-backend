package com.eam.proyectofinalappemp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel_images")
public class HotelImage extends BaseEntity {

	@Column(name = "image_url")
	private String imageUrl;

	@ManyToOne
	@JoinColumn(name = "hotel_id", referencedColumnName = "id")
	private Hotel hotel;

	public HotelImage() {

	}

	public HotelImage(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
