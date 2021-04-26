Feature: validate adacticin hotel functionalities 
Scenario Outline: verify adacticin Search Hotel with all valid credentials 
	Given user is on the Adacticin page 
	When user should enter "<userName>" and "<password>" and click login button 
	Then user should select hotel details"<Location>","<Hotel>","<Roomtype>","<NoOfRooms>","<checkInDate>","<checkoutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"and click search 
	Then user should verify "select hotel" is present 
	Examples: 
		|userName   |password|	Location  |Hotel  	  |Roomtype    |NoOfRooms    |CheckInDate   |CheckOutDate   |AdultsPerRoom|ChildrenPerRoom|
		|IndhuElango|Nila@123|  London    |Hotel Creek|Super Deluxe|5 - Five     |08/04/2021    |09/04/2021     |3 - Three    |2 - Two     |
		
		
Scenario Outline: Verify Search Hotel page with only mandatory fields 
	Given user is on the Adacticin page 
	When user should enter "<userName>" and "<password>" and click login button 
	Then user should select hotel details"<Location>","<NoOfRooms>","<checkInDate>","<checkoutDate>","<AdultsPerRoom>"and click search 
	Then user should verify multiple options "select hotel" is present 
	Examples: 
		|userName   |password|Location    |NoOfRooms    |CheckInDate   |CheckOutDate   |AdultsPerRoom|
		|IndhuElango|Nila@123|London      |5 - Five     |08/04/2021    |09/04/2021     |3 - Three    |
		
Scenario Outline: verify search hotel page with entering invalid dates 
	Given user is on the Adacticin page 
	When user should enter "<userName>" and "<password>" and click login button 
	Then user should select hotel details"<Location>","<Hotel>","<Roomtype>","<NoOfRooms>","<checkInDate>","<checkoutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"and click search 
	Then user should able to see "Check-In Date shall be before than Check-Out Date,Check-Out Date shall be after than Check-In Date" 
	
	Examples: 
		|userName   |password|Location    |Hotel  	  |Roomtype    |NoOfRooms    |CheckInDate   |CheckOutDate   |AdultsPerRoom|ChildrenPerRoom|
		|IndhuElango|Nila@123|London      |Hotel Creek|Super Deluxe|5 - Five     |08/04/2021    |09/04/2021     |3 - Three 	  |2 - Two     |
		
Scenario Outline:
verify search hotel page without entering anything with click search button 
	Given user is on the Adacticin page 
	When user should enter "<userName>" and "<password>" and click login button 
	When user should click search in Search Hotel page 
	Then user should able to see "Please Select a Location" 
	
	Examples: 
		|userName   |password|Location    |Hotel  	  |Roomtype    |NoOfRooms    |CheckInDate   |CheckOutDate   |AdultsPerRoom|ChildrenPerRoom|
		|IndhuElango|Nila@123|London      |Hotel Creek|Super Deluxe|5 - Five     |08/04/2021    |09/04/2021     |3 - Three |2 - Two     |
		
		
		
	