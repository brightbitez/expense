package csku.expense;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;


public class StepDefExpense {
    Expense expense;
    @Before
    public void init() {
        expense = new Expense(100);
    }
    @Given("a user with account balance (\\d+) exists")
    public void a_user_with_account_balance_exists(int balance){expense.getMoney();}

    @When("I add (\\d+) money to my account")
    public void add_money(int money){expense.addMoney(20);}

    @Then("my account balance after add is (.*)")
    public void my_account_balance_after_add_is(int balance) {
        assertEquals(balance, expense.getMoney());
    }
    @When("I withdraw (\\d+) money from my account")
    public void withdraw_money(int money){expense.takeOutMoney(20);}

    @Then("my account balance after withdraw is (.*)")
    public void my_account_balance_after_withdraw_is(int balance) {
        assertEquals(balance, expense.getMoney());
    }
}
