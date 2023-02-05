package com.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Adactinselecthotel {
	WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	public WebElement getRadiobutton() {
	return radiobutton;
	}
	@FindBy(id = "continue")
	private WebElement contin;
	public WebElement getContin() {
	return contin;
	}
	public Pom_Adactinselecthotel(WebDriver as) {
	this.driver = as;
	PageFactory.initElements(this.driver,this);
	}

}
