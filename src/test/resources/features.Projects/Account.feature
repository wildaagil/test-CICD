Feature: Create Account
  As a user
  I want to create my account
  So I can manage my account

  Scenario: Create account with valid username and password
    Given I set url and valid username and password to post account
    When I request valid username and password
    Then I will get 200
    And I can verify the detail response

  Scenario: Create account with invalid username and valid password
    Given I set url and invalid username and valid password to post account
    When I request invalid username
    Then I will get 400
    And I can verify the detail response

  Scenario: Create account with valid username and invalid password
    Given I set url and valid username and invalid password to post account
    When I request invalid password
    Then I will get 400
    And I can verify the detail response

  Scenario: Create account with invalid username and invalid password
    Given I set url and invalid username and invalid password to post account
    When I request invalid usernamen and password
    Then I will get 400
    And I can verify the detail response