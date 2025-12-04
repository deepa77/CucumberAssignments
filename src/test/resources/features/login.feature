
  Feature: User Login

    Scenario: Successful login with valid credentials
      Given the user is on the login page
      When the user enters valid credentials with username and password
      And user clicks on login button
      Then the user should be redirected to the dashboard page.

      Scenario: User attempts to login with empty credentials
    Given the user is on login page
    When the user enter empty username and empty password
    And user clicks on login button
    Then  the user is able to see the error messsage



        Scenario: User Login With Invalid Credentials
          Given the user is on the login page
          When the user enters invalid credentials with username and password
          And user clicks on login button
          Then the user is able to see the error message.