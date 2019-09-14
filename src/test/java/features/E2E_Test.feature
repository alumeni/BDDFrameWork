Feature: Login/Signup Page 

Scenario: Guest signs up to online visit with valid data 

	Given I an a Guest on the Signup page 
	When I fill in the Email Field with a valid email address 
	And I fill in the FirstName Field with my "Anna" 
	And I fill LastName Field  with my "Terra" 
	And I create a valid Password with my "123" 
	And check CheckButton 
	And click Start My Visit Button 
	Then I am redirected to Start Page 
	
	
	
Scenario: User goes to continue their visit 

	Given I’m user on the Start Page 
	When  I click Continue My Visit Button 
	Then I am redirected to The Basic Page 
	
Scenario: User goes to the Medical Questions Page 

	Given I am user on the The Basic Page 
	When I click Female Button 
	And fill the  Birthday Field with "11111111" 
	And fill the  Zip code Field with "10004" 
	And click Next Button 
    Then  I go to the Medical Questions Page 
	
	
	
Scenario: User go through Medical Questions Page 
	Given User on Medical Questions Page 
	When I click Continue Buton 
	And I click No to Are you pregnant 
	And click No and my period has remained 
	Then I get Result Page 
	
	
Scenario: User selects result 
	Given: User on Result Page
	When I select Yes, continue with this option Button 
	And go to the Your Plan Page 
	And select Monthly plan Button 
	And click Continue Button 
	Then I go to Payment Page 
	
	
