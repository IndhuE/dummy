package com.runner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LogInPage extends BaseClass{
	BaseClass baseClass=new BaseClass();                                         
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username") 
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement btnLogin; 
		
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
//	public void login(String name,String password) {
//		enterText(getTxtUserName(), name);
//		enterText(getTxtPassword(), password);
//		btnClick(getBtnLogin());
//
//	}
	public void login(String name,String pw) {
		enterText(getTxtUserName(), name);
		enterText(getTxtPassword(), pw);
	}
	
}
