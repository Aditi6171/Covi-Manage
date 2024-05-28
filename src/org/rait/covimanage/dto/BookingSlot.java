package org.rait.covimanage.dto;

import java.util.Date;

public class BookingSlot {
	private Integer id;
	private String vaccineType;
	private String vaccineLocation;
	private Date vaccineDate;
	private String timeSlot;
	private String userName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}

	public String getVaccineLocation() {
		return vaccineLocation;
	}

	public void setVaccineLocation(String vaccineLocation) {
		this.vaccineLocation = vaccineLocation;
	}

	public Date getVaccineDate() {
		return vaccineDate;
	}

	public void setVaccineDate(Date vaccineDate) {
		this.vaccineDate = vaccineDate;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "BookingSlot [id=" + id + ", vaccineType=" + vaccineType + ", vaccineLocation=" + vaccineLocation + ", vaccineDate=" + vaccineDate + ", timeSlot="
				+ timeSlot + ", userName=" + userName + "]";
	}

}
