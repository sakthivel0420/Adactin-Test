package com.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Adactinlogin {
	
	WebDriver driver;
	@FindBy(id = "username")
	private WebElement user;
	public WebElement getUser() {
	return user;
	}
	@FindBy(id = "password")
	private WebElement pass;
	public WebElement getPass() {
	return pass;
	}
	@FindBy(id = "login")
	private WebElement Login;
	public WebElement getLogin() {
	return Login;
	}
	public POM_Adactinlogin(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(this.driver, this);
	}
	
	
	
	
	

}
