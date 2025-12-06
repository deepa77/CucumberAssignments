Feature: User Login

  @login
  Scenario: Successful login with valid credentials
    Given the user is on login page
    When the user enters valid credentials with username and password
    And user clicks on login button
    Then the user should be redirected to the dashboard page.

  @empty@login
  Scenario: User attempts to login with empty username
    Given the user is on login page
    When the user leaves empty username
    And user enters a valid password
    And user clicks on login button
    Then system should display Username cannot be empty

    @password@login
    Scenario: User attempts to login with empty password
      Given the user is on login page
      When the user leaves empty password
      And user enters a valid username
      And user clicks on login button
      Then system should display Password is empty

@Invalid@login
  Scenario: User Login With Invalid Credentials
    Given the user is on login page
    When the user enters invalid credentials with username and password
    And user clicks on login button
    Then the user is able to see the error message
