Feature: Testing Login page
Scenario: Positive login Test
Given you open the site
When  username 
|student|
When password 
|Password123|
And click submit button
Then get specifc url to check login is sucesfull