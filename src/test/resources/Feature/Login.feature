Feature: validate adacticin hotel funcionality 
Scenario Outline: verify adacticin login details with valid credentials 
	Given user is on the Adacticin page 
	When user should enter "<userName>" and "<password>" and click login button
	When user should select hotel details"<Location>","<Hotels>","<Roomtype>","<NoOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"and click btnContinue
	And user should enter user and payment details
	|txtFirstName|txtLastName|txtAddress|creditCardNo    |creditCardType|expiryCardMonth|expiryCardYear|getcVV|
	|Indhu		|Elango		|Omr		|9780654321123456|VISA    		|August         |2022          |708|
	
	And click book now and ordernumber
		
	Examples:
	|userName   |password|Location		|Hotels  	|	Roomtype |NoOfRooms	   |checkInDate  |checkOutDate    |adultsPerRoom		    |childrenPerRoom|
	|IndhuElango|Nila@123|London        |Hotel Creek|Super Deluxe|5 - Five     |03/04/2021   |04/04/2021     |3 - Three 			|2 - Two     |
	
		