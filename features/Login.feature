Feature: Login to leaftap application

Scenario: Login to leaftabs
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When click on the login button
Then verify homepage is displayed

Scenario: Negative login
Given Enter the username as 'demomanager'
And Enter the password as 'crmsfa'
When click on the login button
But verify error message is displayed