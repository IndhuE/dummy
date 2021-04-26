Feature: validate adacticin booking page funcionality 
Scenario Outline:
verify adacticin booking page details with all valid credentials 
	Given user is on the Adacticin page 
	When user should enter "<userName>" and "<password>" and click login button 
	Then user should select hotel details"<Location>","<Hotel>","<Roomtype>","<NoOfRooms>","<checkInDate>","<checkoutDate>","<AdultsPerRoom>","<ChildrenPerRoom>"and click Search 
	Then user should verify "select hotel" is present 
	When user should select hotel and click continue button in select hotel page 
	Then user should verify "Book A Hotel" is present 
	When user should enter booking details"<FirstName>","<LastName>","<Address>","<creditCardNo>","<cardType>","<expiryCardMonth>","<expiryCardYear>","<creditCardCvvNo>"and click BookNow 
	Then user should see in the next page "Booking confirmation" and generated order id and click Booked itinerary to cancel the booking 
	And particular order id is generated,select id and click Cancel selected 
	And user should see the "The booking has been cancelled" message.
	
	Examples: 
		|userName   |password|Location	  |Hotel      |Roomtype    |NoOfRooms    |CheckInDate   |CheckOutDate   |AdultsPerRoom|ChildrenPerRoom|FirstName   |LastName        |Address    |creditCardNo    |cardType|expiryCardMonth|expiryCardYear|creditCardCvvNo|
		|IndhuElango|Nila@123|London      |Hotel Creek|Super Deluxe|5 - Five     |08/04/2021    |09/04/2021     |3 - Three |2 - Two     	  |Indhu		|Elango			|Omr		|9780654321123456|VISA    |August         |2022          |708   |
		
Scenario Outline:
verify adacticin booking page details with all valid credentials 
	Given user is on the Adacticin page 
	When user should enter "<userName>" and "<password>" and click login button 
	And select hotel page should be displayed and clicked Booked Itinerary for cancel the booking 
	And select the particular "<order id>" you want to cancel and click Cancel id button 
	Then user should be able to see "The booking has been cancelled." in Booked itenerary 
	
	Examples: 
		|userName   |password|order id  |
		|IndhuElango|Nila@123|7JB4522BS1|