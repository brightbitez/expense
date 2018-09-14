Feature: add
    As a user
    I want to add money to my account
Background:
    Given a user with account balance 100 exists
Scenario: Add money to my account
    When I add 20 money to my account
    Then my account balance after add is 120
