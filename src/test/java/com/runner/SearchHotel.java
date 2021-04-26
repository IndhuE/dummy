package com.runner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SearchHotel extends BaseClass {

	BaseClass baseClass = new BaseClass();

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	@FindBy(id = "location")
	private WebElement dDnLocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotel;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;
	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildrenPerRoom;

	@FindBy(id = "Submit")
	private WebElement btnSearch;

	public void searchHotel(String location, String hotel, String roomType, String noOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		searchHotelByMandatoryFields(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);
//		dropDownText(getdDnLocation(), location);
		dropDownText(getdDnHotel(), hotel);
		dropDownText(getdDnRoomType(), roomType);
//		dropDownText(getdDnNoOfRooms(), noOfRooms);
//		dropDownText(getdDnAdultsPerRoom(), adultsPerRoom);
		dropDownText(getdDnChildrenPerRoom(), childrenPerRoom);
//		searchHotelByDates(checkInDate, checkOutDate);
	}

	public void searchHotelByMandatoryFields(String location, String noOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom) {
		dropDownText(getdDnLocation(), location);
		dropDownText(getdDnNoOfRooms(), noOfRooms);
		dropDownText(getdDnAdultsPerRoom(), adultsPerRoom);
		searchHotelByDates(checkInDate, checkOutDate);
	}

	public void searchHotelByDates(String checkInDate, String checkOutDate) {
		enterText(getTxtCheckInDate(), checkInDate);
		enterText(getTxtCheckOutDate(), checkOutDate);
		searchHotelOnlyClick();
	}

	public void searchHotelOnlyClick() {
		btnClick(getBtnSearch());

	}

}
