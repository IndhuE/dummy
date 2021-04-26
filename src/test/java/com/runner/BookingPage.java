package com.runner;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BookingPage extends BaseClass{
	BaseClass baseClass=new BaseClass();                                         
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement dDnCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnExpiryCardMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement dDnExpiryCardYear;
	
	@FindBy(name="cc_cvv")
	private WebElement txtCardcVV;
	
	@FindBy(id="book_now")
	private WebElement clickBookNow;
	
	public WebElement getClickBookNow() {
		return clickBookNow;
	}
		
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardNo() {
		return txtCreditCardNo;
	}

	public WebElement getdDnCardType() {
		return dDnCardType;
	}

	public WebElement getdDnExpiryCardMonth() {
		return dDnExpiryCardMonth;
	}

	public WebElement getdDnExpiryCardYear() {
		return dDnExpiryCardYear;
	}

	public WebElement getCardCvvNo() {
		return txtCardcVV;
	}

	public void bookingPage(String fname,String lname,String address,String cardNo,String cardType,String expCardMonth,String expCardYear,String cardCvvNo) {
		enterText(getTxtFirstName(), fname);
		enterText(getTxtLastName(), lname);
		enterText(getTxtAddress(), address);
		enterText(getTxtCreditCardNo(), cardNo);
		dropDownText(getdDnCardType(), cardType);
		dropDownText(getdDnExpiryCardMonth(), expCardMonth);
		dropDownText(getdDnExpiryCardYear(), expCardYear);
		enterText(getCardCvvNo(), cardCvvNo);		
		btnClick(getClickBookNow());	
	}
	
	public void bookingPage() {
		btnClick(getClickBookNow());	
}}
