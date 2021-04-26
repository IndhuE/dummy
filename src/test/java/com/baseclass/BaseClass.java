package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	public static WebDriver driver;
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		return driver= new ChromeDriver();
	}
	public void loadUrl(String url) {
		driver.get(url);
		maximize();
		implicitWaits();
	}
	 
	public void implicitWaits() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void displayType(WebElement element) {
		if(isDisplayed(element)&&isEnabled(element))
			element.click();
	}
	
	private boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	private boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick().perform();
	}
	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
	}
	public void getText(WebElement element) {
		element.getText();
	}
	public String getAtribute(WebElement element) {
		 return element.getAttribute("value");		  
	}
	public String getAttribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}
	public void closeWindow() {
		((WebDriver)driver).close();
	}
	public void quitWindow() {
		((WebDriver)driver).quit();
	}
	public void enterText(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	public void dragAndDrop(WebElement source,WebElement dest) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).perform();
	}
	public void moveToElement(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}
	public void dropDownText(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void dropDownIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void dropDownValue(WebElement element,String argu) {
		Select select=new Select(element);
		select.selectByValue(argu);
	}
	
	public void acceptAlert() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}		
	
	public void cancelAlert() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void alertSendKeys(String value) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(value);
	}
	
	
	

	
}
