@userlist
Feature: User List

  Background:
    Given I have been in Dashboard as Admin

  @positive
  Scenario: Successfully show all users
      When I click on PIM menu
      Then I can see the list of all users

  @positive
  Scenario: Successfully show users by Employment Status
    And I click on PIM menu
    And I can see the list of all users
    When I click on Employement Status filter
    And I select Full-Time Permanent
    And I click on Search button
    Then I can see the user list by Employment Status