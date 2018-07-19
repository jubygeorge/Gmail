Feature: To delete all the mails from a particular sender
This scenario is used to club all the emails from a single sender and delete them all

Scenario: Delete all the mails from a particular person

Given The user is already logged in gmail
When  The user selects all the mails from a particular sender spreading across multiple pages
And   The user clicks the delete button and deletes all the mails 
Then  The usr successfully logs out with appropriate message


