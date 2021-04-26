package com.stepdefinition;

import com.baseclass.BaseClass;

import cucumber.api.java.Before;

public class HookerClass extends BaseClass{
	@Before
	public void beforeHookes() {
		getDriver();
		loadUrl("http://adactinhotelapp.com/index.php");
		
	}
	public void afterClass() {
		closeWindow();
	}
}
