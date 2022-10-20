Feature: Post Account
  As a user
  I want to create account
  So I can manage my account

  Scenario: Create project with valid name
    Given I set url and valid token to create project
    When I request with valid username
    Then I will get 200
    And I can verify the detail response
