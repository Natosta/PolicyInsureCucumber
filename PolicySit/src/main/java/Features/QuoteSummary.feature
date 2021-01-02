Feature: PolicyCenter Quote Summary Page


Scenario Outline: Verify the quote summary page 

Given i am on the policy centre login page  
When  they enter the user "<username>" and "<password>"
And   they click on the login button 
And   they click on Actions
And   they complete all fields 
And   they click on the search button 
And   they click on person 
And   they set the primary phone to Mobile 
And   they enter the mobile phone number
And   they click on the Update button
And   they click on New Submission  
And   they select a personal motor product 
And   they complete all required fields 
And   they click on the quote button 
Then  the quote summary page should be displayed 


Examples:
	| username                  | password       |
	| su                        | gw             |
		