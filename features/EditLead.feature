Feature: edit lead

Background: Login to leaftabs

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When click on the login button
Then verify homepage is displayed
And click on crm_sfa link
And click on leads tab

Scenario Outline: edit lead

And click on find lead link
And enter first name as <firstname>
And click find leads button
And click on the first resulting lead
And click on edit button
And change the company name as <companyname>
And click on update button
Then verify whether the lead is updated


Examples:
|firstname|companyname|
|Akshaya|Flexprod|
|Parvathi|Saveetha Dental|