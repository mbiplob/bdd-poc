Feature: Login feature with data and tags
#Author: Md Biplob

  @dataDrivenTest
  Scenario Outline: login with valid credentials
    Given I open Browser
    And I navigate to the login page
    When I enter username as "<username>"
    And I enter password as "<password>"
    Then I should see the customer welcome page

    Examples:
    | username            |  password   |
    | joy123@gmail.com    |  joy123     |
    | graviton103@gt.com  |  graviton1  |
    | graviton102@gt.com  |  graviton1  |
    | graviton101@gt.com  |  graviton1  |
