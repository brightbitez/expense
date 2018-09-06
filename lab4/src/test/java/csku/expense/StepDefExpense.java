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
        expense = new Expense(0);
    }
    @Given("A user with account balance (\\d+) exists")
    public void a_user_with_account_balance_exists(int balance){expense.getMoney();}
    @When("I add (\\d+) money to the account")
    public void add_money(int money){expense.addMoney(100);}
    @When("I withdraw (\\d+) money from my account")
    public void withdraw_money(int money){expense.takeOutMoney(100);}
    @Then("my account balance is (.*)")
    public void my_account_balance_is(int balance) {
        assertEquals(balance, expense.getMoney());
    }
    @Then("my account balance is (.*)")
    public void my_account_balance_is2(int balance) {
        assertEquals(balance, expense.getMoney());
    }
}
