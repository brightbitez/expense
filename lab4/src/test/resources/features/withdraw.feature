Feature: withdraw
    As a user
    I want to withdraw money from my account
Background:
    Given a user with account balance 100 exists
Scenario: Add money to my account
    When I withdraw 20 money from my account
    Then my account balance after withdraw is 80
