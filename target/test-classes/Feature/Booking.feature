Feature: validate adacticin booking page funcionality 
Scenario Outline:
verify adacticin booking page details with all valid credentials 
	Given user is on the Adacticin page 
	When user should enter "<userName>" and "<password>" and click login button 
	Then user should select hotel details"<Location>","<Hotel>","<Roomtype>","<NoOfRooms>","<checkInDate>","<checkoutDate>","<AdultsPerRoom>","<ChildrenPerRoom>"and click Search 
	Then user should verify "select hotel" is present 
	When user should select hotel and click continue button in select hotel page 
	Then user should verify "Book A Hotel" is present 
	When user should enter booking details"<FirstName>","<LastName>","<Address>"and click BookNow 
		|creditCardNo    |cardType		|expiryCardMonth|expiryCardYear|creditCardCvvNo|
		|9780654321123456|VISA    		|August         |2022          |706   |
		|9780676521123456|MasterCard   	|August         |2023          |702  |
		|2340654321123456|American Express|August       |2024          |703   |
		|1230654321123456|Other  		|August         |2025          |308   |
		
	Then user should see in the next page "Booking confirmation" 
	Examples: 
		|userName   |password|Location    |Hotel      |Roomtype    |NoOfRooms    |CheckInDate   |CheckOutDate   |AdultsPerRoom|ChildrenPerRoom|txtFirstName|txtLastName|txtAddress  |
		|IndhuElango|Nila@123|London      |Hotel Creek|Super Deluxe|5 - Five     |08/04/2021    |09/04/2021     |3 - Three 	  |2 - Two        |Indhu		|Elango		|Omr		|
		
		
Scenario Outline:
verify adactin booking page without entering anything and click book now 
	Given user is on the Adacticin page 
	When user should enter "<userName>" and "<password>" and click login button 
	Then user should select hotel details"<Location>","<Hotel>","<Roomtype>","<NoOfRooms>","<checkInDate>","<checkoutDate>","<AdultsPerRoom>","<ChildrenPerRoom>"and click Search 
	Then user should verify "select hotel" is present 
	When user should select hotel and click continue button in select hotel page 
	Then user should verify "Book A Hotel" is present 
	When user should click BookNow 
	Then user could able to see "Please Enter your First Name,  Please Enter you Last Name,  Please Enter your Address,Please Enter your 16 Digit Credit Card Number,Please Select your Credit Card Type,Please Select your Credit CardExpiry Month,Please Enter your Credit Card CVV Number" 
	Examples: 
		|userName   |password|Location    |Hotel      |Roomtype    |NoOfRooms    |CheckInDate   |CheckOutDate   |AdultsPerRoom|ChildrenPerRoom|
		|IndhuElango|Nila@123|London      |Hotel Creek|Super Deluxe|5 - Five     |08/04/2021    |09/04/2021     |3 - Three 	  |2 - Two        |
	