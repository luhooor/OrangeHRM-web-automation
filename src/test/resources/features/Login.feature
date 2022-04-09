@Login
Feature: Login

  Background:
    Given I am on the Login page

  @positive
  Scenario: Successfully login as Admin
    When I input username and password
    And I click the login button
    Then I should be redirected to Admin Dashboard

  @negative
  Scenario Outline: Unsuccessfully login
    When I input "<username>" as username and "<password>" as password
    And I click the login button
    Then I should see error message: "<message>"

    Examples:
      | username | password      | message                  |
      |          |               | Username cannot be empty |
      | Admin    | wrongpassword | Invalid credentials      |
      | Admin    |               | Password cannot be empty |