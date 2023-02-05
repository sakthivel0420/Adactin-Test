package com.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_AdactinBooked {
	WebDriver driver;
	@FindBy(xpath = "(//input[@type ='checkbox'])[2]")
	private WebElement Booked;
	public WebElement getBooked() {
	return Booked;
	}
	@FindBy(id = "check_all")
	private WebElement checkbox;
	public WebElement getCheckbox() {
	return checkbox;
	}
	@FindBy(xpath = "(//input[@type ='text'])[2]")
	private WebElement searchbox;
	public WebElement getSearchbox() {
	return searchbox;
	}
	@FindBy(id = "search_hotel_id")
	private WebElement go;
	public WebElement getGo() {
	return go;
	}
	public Pom_AdactinBooked(WebDriver l) {
	this.driver = l;
	PageFactory.initElements(this.driver,this);
	}
}
