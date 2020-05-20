Feature: Login in test for Free CRM application 

Scenario: User able to log in with valid credentials 
	Given user is on free crm login page and logs in 
	Then user is able to login to homepage 
	And I click on companies tab 
	Then I create a new company 
