Feature: Testing Login page
Scenario: Positive login Test
Given open the site
When entering username "student" 
When password "Password123"
And click submit button
Then get specifc url to check login is sucesfull

Scenario: wrong name or password login Test
Given open the site
When entering username "stunt" 
When password "Password123"
And click submit button
Then get specifc text to check test cse  is failed

