package com.runner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class ContinuePage extends BaseClass{
	BaseClass baseClass=new BaseClass();                                         
	public ContinuePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement btnClick;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	public WebElement getBtnClick() {
		return btnClick;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}	
	public void continuePage() {
		btnClick(getBtnClick());
		btnClick(getBtnContinue());
	}

}
