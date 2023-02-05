package com.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_AdactinBookHotel {
	WebDriver driver;
	@FindBy(id = "first_name")
	private WebElement Firstname;
	public WebElement getFirstname() {
	return Firstname;
	}
	@FindBy(name = "last_name")
	private WebElement Lastname;
	public WebElement getLastname() {
	return Lastname;
	}
	@FindBy(id = "address")
	private WebElement BillingAddress;
	public WebElement getBillingAddress() {
	return BillingAddress;
	}
	@FindBy(id = "cc_num")
	private WebElement credit_card_no;
	public WebElement getCredit_card_no() {
	return credit_card_no;
	}
	@FindBy(id = "cc_type")
	private WebElement credit_card_type;
	public WebElement getCredit_card_type() {
	return credit_card_type;
	}
	@FindBy(id = "cc_exp_month")
	private WebElement Expire_MonthDate;
	public WebElement getExpire_MonthDate() {
	return Expire_MonthDate;
	}
	@FindBy(id = "cc_exp_year")
	private WebElement Expire_yearDate;
	public WebElement getExpire_yearDate() {
	return Expire_yearDate;
	}
	@FindBy(id = "cc_cvv")
	private WebElement ccv_number;
	public WebElement getCcv_number() {
	return ccv_number;
	}
	@FindBy(id = "book_now")
	private WebElement Booknow;
	public WebElement getBooknow() {
	return Booknow;
	}
	public Pom_AdactinBookHotel(WebDriver lo) {
	this.driver = lo;
	PageFactory.initElements(this.driver,this);
	}
}
