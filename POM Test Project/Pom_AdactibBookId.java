package com.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_AdactibBookId {
	WebDriver driver;
	@FindBy(linkText = "Booked Itinerary")
	private WebElement BookId;
	public WebElement getBookId() {
	return BookId;
	}
	public Pom_AdactibBookId (WebDriver rh) {
	this.driver = rh;
	PageFactory.initElements(this.driver,this);

	}

}
