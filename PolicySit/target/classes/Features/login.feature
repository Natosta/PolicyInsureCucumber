Feature: PolicyCenter Login Test


Scenario Outline: Verify that a user can login successfully

Given the user navigates policy centre 
When  the user enters "<username>" and "<password>"
When  the user clicks on login button
When  the home page is displayed
When  the user clciks on the settings icon
When  the user click on logout
Then  the login screen is displayed
Then  close the browser




Examples:
	| username                  | password       |
	| su                        | gw             |
		
		