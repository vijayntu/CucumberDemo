Feature: Portal Login

Background: 
Given Validate the browser
When Browser is triggered
Then Check browser is displayed

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "Vijay" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@PortalTest
Scenario: Home page default login cards not displayed
Given User is on NetBanking landing page
When User login into application with "John" and password "4321"
Then Home page is populated
And Cards displayed are "false"

@PortalTest
Scenario: Home page default register
Given User is on NetBanking landing page
When User sign up with following details
| john | abcd | john@abcd.com | Singapore | 66898913 |
Then Home page is populated
And Cards displayed are "false"

@PortalTest
Scenario Outline: Home page default login with multiple users
Given User is on NetBanking landing page
When User login in to application with <Username> and password <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username | password |
|User1    | Pass1    |
|User2    | Pass2    |
|User3    | Pass3    |
|User4    | Pass4    |
|User5    | Pass5    |