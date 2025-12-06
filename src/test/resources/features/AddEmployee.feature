 Feature: Add Employee to the HRMS

   Background:
     When user enters  username and password
     And user clicks on login button
     Then user is able to login successfully
     When user clicks on PIM option
     And user clicks on Add Employee button

         @param
      Scenario: Adding Employee without employeeID
        When user enters firstname and lastname
        And user clicks on save button
        Then employee is added successfully

        @examples
        Scenario: Adding Employee with providing employeeID
          When user enters firstname and lastname and employeeID
          And user clicks on save button
          Then employee is added successfully
    @testing
   Scenario: Invalid Employee Information
      When user enters invalid employee information
      And user clicks on save button
      Then the user is able to see the error