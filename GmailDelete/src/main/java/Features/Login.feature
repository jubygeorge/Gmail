Feature:  To Login to Gmail
          In this feature file we are testing all the login scenarios.(Description )
          Created by :Juby George
Scenario: To verify the user is able to login
          Verify the user is able to Login with the proper credentials
Given   The user is already in the gmail login page
When    The user enters the valid username
And     The user press Next button to enter password
Then    The user enters the valid password
And     The user press Next button to login
Then    The user is able to login to the account and successfully logs out
#End of scenario(Comment)
