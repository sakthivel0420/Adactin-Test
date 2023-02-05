package com.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Adactinsearchhotel {
	
	WebDriver driver;
	@FindBy(id = "location")
	private WebElement location;
	public WebElement getLocation() {
	return location;
	}
	@FindBy(id = "hotels")
	private WebElement Hotels;
	public WebElement getHotels() {
	return Hotels;
	}
	@FindBy(id = "room_type")
	private WebElement Roomtype;
	public WebElement getRoomtype() {
	return Roomtype;
	}
	@FindBy(id = "room_nos")
	private WebElement Number_of_Rooms;
	public WebElement getNumber_of_Rooms() {
	return Number_of_Rooms;
	}
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement check_in_Date;
	public WebElement getCheck_in_Date() {
	return check_in_Date;
	}
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement check_out_Date;
	public WebElement getCheck_out_Date() {
	return check_out_Date;
	}
	@FindBy(id = "adult_room")
	private WebElement Adult_Per_Room;
	public WebElement getAdult_Per_Room() {
	return Adult_Per_Room;
	}
	@FindBy(id = "child_room")
	private WebElement Child_Per_Room;
	public WebElement getChild_Per_Room() {
	return Child_Per_Room;
	}
	@FindBy(id = "Submit")
	private WebElement submit;
	public WebElement getSubmit() {
	return submit;
	}
	public Pom_Adactinsearchhotel(WebDriver K) {
	this.driver = K;
	PageFactory.initElements(this.driver,this);
	}}

