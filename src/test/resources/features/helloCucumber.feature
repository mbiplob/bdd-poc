Feature: Login feature
#Author: Md Biplob
  Scenario: login with valid credentials

    Given I open Browser
    And I navigate to the login page
    When I enter username
    And I enter password
    Then I should see the customer welcome page
    And I should see the logout button
    And I close browser






    # feature file
    # Step drfinitions
    # TestRunner
