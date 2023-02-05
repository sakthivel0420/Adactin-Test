package com.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_AdactinBookConform {
	WebDriver driver;
	@FindBy(id = "search_hotel")
	private WebElement search_hotel;
	public WebElement getSearch_hotel() {
	return search_hotel;
	}
	public Pom_AdactinBookConform(WebDriver pk) {
	this.driver = pk;
	PageFactory.initElements(this.driver,this);

	}}
	

