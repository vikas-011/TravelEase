package com.travelease.models;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;



@Entity
public class Packages {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer packageId;

	
	@Pattern(regexp = "^[A-Za-z]+ [A-Za-z]+$")
	@Size(min = 4,message = "Package Name sholud be more than 4 letters and Alphabest")
	
	private String packageName;

	@Pattern(regexp = "^[A-Za-z]+ [A-Za-z]+$")
	private String packageDescription;
	
	
	
	
	
//	@OneToMany
//	@JoinColumn(name = "busId")
//	private Bus bus;
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	@OneToMany
	private List<Bus> bus = new ArrayList<>();
	
//	@OneToMany
//	@JoinColumn(name = "routeId")
//	private Route route;
	
	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	@OneToMany
	private List<Route> route = new ArrayList<>();
	
	
//	@OneToMany
//	@JoinColumn(name = "hotelId")
//	private Hotel hotel;

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	@OneToMany
	private List<Hotel> hotel = new ArrayList<>();
	
	
	@Min(value=5000)
	private Double packageCost;

	
	private Double packageRating;


	public Integer getPackageId() {
		return packageId;
	}


	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}


	public String getPackageName() {
		return packageName;
	}


	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}


	public String getPackageDescription() {
		return packageDescription;
	}


	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}


	public List<Bus> getBus() {
		return bus;
	}


	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}


	public List<Route> getRoute() {
		return route;
	}


	public void setRoute(List<Route> route) {
		this.route = route;
	}


	public List<Hotel> getHotel() {
		return hotel;
	}


	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}


	public Double getPackageCost() {
		return packageCost;
	}


	public void setPackageCost(Double packageCost) {
		this.packageCost = packageCost;
	}


	public Double getPackageRating() {
		return packageRating;
	}


	public void setPackageRating(Double packageRating) {
		this.packageRating = packageRating;
	}


	@Override
	public String toString() {
		return "Packages [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", bus=" + bus + ", route=" + route + ", hotel=" + hotel + ", packageCost="
				+ packageCost + ", packageRating=" + packageRating + "]";
	}


	public Packages() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}