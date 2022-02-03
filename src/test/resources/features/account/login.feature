Feature: Login function
  As a user
  I want to login in web
  So that i success login

  @test-case_1
  Scenario: Login with valid username and password
    Given I am already in login page
    When I am input username "admin"
    And I am input password "Midas2020$$"
    And I am click button signin
    Then I am successfully login

  Scenario Outline: Login with valid username and invalid password
    Given I am already in login page
    When I am input username "admin"
    And I am input password "<password>"
    And I am click button signin
    Then I am successfully login
    Examples:
     | password    |
     | notpassword |
     | Midas784376 |
