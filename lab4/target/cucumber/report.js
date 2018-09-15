$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/add.feature");
formatter.feature({
  "line": 1,
  "name": "add",
  "description": "  As a user\r\n  I want to add money to my account",
  "id": "add",
  "keyword": "Feature"
});
formatter.before({
  "duration": 106604,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "a user with account balance 150 exists",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "150",
      "offset": 28
    }
  ],
  "location": "StepDefExpense.a_user_with_account_balance_exists(int)"
});
formatter.result({
  "duration": 197646432,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add money to my account",
  "description": "",
  "id": "add;add-money-to-my-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I add 20 money to my account",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "my account balance after add is 170",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 6
    }
  ],
  "location": "StepDefExpense.add_money(int)"
});
formatter.result({
  "duration": 235429,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "170",
      "offset": 32
    }
  ],
  "location": "StepDefExpense.my_account_balance_after_add_is(int)"
});
formatter.result({
  "duration": 3671969,
  "status": "passed"
});
});