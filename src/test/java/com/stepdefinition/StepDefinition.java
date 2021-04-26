package com.stepdefinition;

import java.util.List;
import java.util.Map;
import com.baseclass.BaseClass;
import com.runner.BookingPage;
import com.runner.LogInPage;
import com.runner.SearchHotel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	
	BaseClass baseClass=new BaseClass();                                         
	@Then("user should select hotel details{string},{string},{string},{string},{string},{string},{string},{string}and click Search")
	public void userShouldSelectHotelDetailsAndClickSearch(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	}

	@Then("user should verify {string} is present")
	public void userShouldVerifyIsPresent(String string) {
	}

	@When("user should select hotel and click continue button in select hotel page")
	public void userShouldSelectHotelAndClickContinueButtonInSelectHotelPage() {
	   
	}

	@When("user should enter booking details{string},{string},{string}and click BookNow")
	public void userShouldEnterBookingDetailsAndClickBookNow(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Then("user should see in the next page {string}")
	public void userShouldSeeInTheNextPage(String string) {
	    
	}

	@When("user should click BookNow")
	public void userShouldClickBookNow() {
	   
	}

	@Then("user could able to see {string}")
	public void userCouldAbleToSee(String string) {
	   
	}

	@When("user should enter booking details{string},{string},{string},{string},{string},{string},{string},{string}and click BookNow")
	public void userShouldEnterBookingDetailsAndClickBookNow(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   
	}

	@Then("user should see in the next page {string} and generated order id and click Booked itinerary to cancel the booking")
	public void userShouldSeeInTheNextPageAndGeneratedOrderIdAndClickBookedItineraryToCancelTheBooking(String string) {
	    
	}

	@Then("particular order id is generated,select id and click Cancel selected")
	public void particularOrderIdIsGeneratedSelectIdAndClickCancelSelected() {
	   
	}

	@Then("user should see the {string} message.")
	public void userShouldSeeTheMessage(String string) {
	   
	}

	@When("select hotel page should be displayed and clicked Booked Itinerary for cancel the booking")
	public void selectHotelPageShouldBeDisplayedAndClickedBookedItineraryForCancelTheBooking() {
	    
	}

	@When("select the particular {string} you want to cancel and click Cancel id button")
	public void selectTheParticularYouWantToCancelAndClickCancelIdButton(String string) {
	   
	}

	@Then("user should be able to see {string} in Booked itenerary")
	public void userShouldBeAbleToSeeInBookedItenerary(String string) {
	   
	}

	@Then("user should select hotel details{string},{string},{string},{string},{string},{string},{string} and {string}and click search")
	public void userShouldSelectHotelDetailsAndAndClickSearch(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   
	}

	@Then("user should select hotel details{string},{string},{string},{string},{string}and click search")
	public void userShouldSelectHotelDetailsAndClickSearch(String string, String string2, String string3, String string4, String string5) {
	   
	}

	@Then("user should verify multiple options {string} is present")
	public void userShouldVerifyMultipleOptionsIsPresent(String string) {
	    
	}

	@Then("user should able to see {string}")
	public void userShouldAbleToSee(String string) {
	   
	}

	@When("user should click search in Search Hotel page")
	public void userShouldClickSearchInSearchHotelPage() {
	    
	}


}
