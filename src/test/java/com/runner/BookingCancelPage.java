package com.runner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BookingCancelPage extends BaseClass {
	public BookingCancelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement clickBookedItinerary;

	@FindBy(id = "order_id_text")
	private WebElement txtSearchOrderId;

	@FindBy(id = "search_hotel_id")
	private WebElement clkGoButton;

	@FindBy(name = "ids[]")
	private WebElement cancelOrderId;

	@FindBy(id = "order_no")
	private WebElement OrderId;

	public WebElement getClickBookedItinerary() {
		return clickBookedItinerary;
	}

	public WebElement getTxtSearchOrderId() {
		return txtSearchOrderId;
	}

	public WebElement getClkGoButton() {
		return clkGoButton;
	}

	public WebElement getCancelOrderId() {
		return cancelOrderId;
	}

	public WebElement getOrderId() {
		return OrderId;
	}

	public void cancelOrderId() {
		String atribute = getAtribute(getOrderId());
		btnClick(getClickBookedItinerary());
		enterText(getTxtSearchOrderId(), atribute);
		btnClick(getClkGoButton());
		btnClick(getCancelOrderId());
		acceptAlert();
	}
	 
	public void cancelParticularOrderId() {
		btnClick(getClickBookedItinerary());
		List<WebElement> list = driver.findElements(By.xpath("//td[@bgcolor='#CCCCCC'][3]//parent::tr//following::tr//child::td[3]"));
		for (WebElement webElement : list) {
			String atribute = getAtribute(webElement);
			if(atribute.equals("7JB4522BS1")) {
				btnClick(getCancelOrderId());
				acceptAlert();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	

}
