Feature: Check that the latest news header is displayed on the homepage
  Scenario: Navigate to homepage and check that latest news section is displayed
    Given Navigation to homepage
    When I check for the latest news section
    Then Latest News Section is displayed

  Scenario: Check that title is correct
    Given I click on the hamburger menu
    When I select Cases menu option
    Then The cases title is displayed

  Scenario: Check that title is correct
    Given I click on the services hamburger menu
    When I select services menu option
    Then The cases service title is displayed

  Scenario: Check that title is correct
    Given I click on the jobs hamburger menu
    When I select Jobs menu option
    Then The Jobs title is displayed

  Scenario: Check that the count of valtech offices is correct
    Given I click on the contact menu
    When I count the amount of offices
    Then The amount of offices is correct