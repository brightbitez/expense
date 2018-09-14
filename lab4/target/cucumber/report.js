$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/withdraw.feature");
formatter.feature({
  "line": 1,
  "name": "withdraw",
  "description": "  As a user\r\n  I want to withdraw money from my account",
  "id": "withdraw",
  "keyword": "Feature"
});
formatter.before({
  "duration": 105102,
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
  "name": "a user with account balance 100 exists",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 28
    }
  ],
  "location": "StepDefExpense.a_user_with_account_balance_exists(int)"
});
formatter.result({
  "duration": 195405302,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add money to my account",
  "description": "",
  "id": "withdraw;add-money-to-my-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I withdraw 20 money from my account",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "my account balance after withdraw is 80",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 11
    }
  ],
  "location": "StepDefExpense.withdraw_money(int)"
});
formatter.result({
  "duration": 168763,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "80",
      "offset": 37
    }
  ],
  "location": "StepDefExpense.my_account_balance_after_withdraw_is(int)"
});
formatter.result({
  "duration": 3977659,
  "status": "passed"
});
});