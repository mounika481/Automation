Feature: Login into Application


Scenario Outline: Positive test validating login
Given initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com/" site
And Click on login link in home page to land on Secure sign in page
When User enters <Username> and <Password> and logs in
Then Verify that user is sucessfully logged in
And Close browsers


Examples:
|Username	|Password	|
|test99@gmail.com	|12345	|
|mouni@gmail.com	|2345	|



