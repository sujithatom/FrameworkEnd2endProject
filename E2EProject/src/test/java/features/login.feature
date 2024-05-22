Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1" site
And Click on login link in the home page to land on secure Sign in page
When User enters "sujithag6@gmail.com" ang "GodHelpMe@1" and logs in
Then Verify that user is successfully log in


