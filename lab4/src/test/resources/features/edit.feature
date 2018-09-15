Feature: edit
    As a user
    I want to edit money transaction information of my account
Background:
    Given a user with first transaction amount of 50 exists
Scenario: Edit money transaction amount,date,category,description of my account
    When I edit first transaction amount to 100, date to 25/1/2017, category to 1 and description to 1
    Then my first transaction amount is 100, date is 25/1/2017, category is 1 and description is 1