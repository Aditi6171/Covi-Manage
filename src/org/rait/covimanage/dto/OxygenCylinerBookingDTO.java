package org.rait.covimanage.dto;

import java.util.Date;

public class OxygenCylinerBookingDTO {
	private Integer id;
	private String oxyCylType;
	private Integer oxyCylQuantity;
	private Date bookingDate;
	private String userName;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the oxyCylType
	 */
	public String getOxyCylType() {
		return oxyCylType;
	}

	/**
	 * @param oxyCylType the oxyCylType to set
	 */
	public void setOxyCylType(String oxyCylType) {
		this.oxyCylType = oxyCylType;
	}

	/**
	 * @return the oxyCylQuantity
	 */
	public Integer getOxyCylQuantity() {
		return oxyCylQuantity;
	}

	/**
	 * @param oxyCylQuantity the oxyCylQuantity to set
	 */
	public void setOxyCylQuantity(Integer oxyCylQuantity) {
		this.oxyCylQuantity = oxyCylQuantity;
	}

	/**
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}

	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "OxygenCylinerBookingDTO [id=" + id + ", oxyCylType=" + oxyCylType + ", oxyCylQuantity=" + oxyCylQuantity + ", bookingDate=" + bookingDate
				+ ", userName=" + userName + "]";
	}
}
