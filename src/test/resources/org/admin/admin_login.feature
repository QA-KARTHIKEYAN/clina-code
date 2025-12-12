Feature: Login functionalit

  Scenario: Successful login with valid credentailsy
    Given user is on login page
    When user enters valid username and password
    Then user should be logged in
