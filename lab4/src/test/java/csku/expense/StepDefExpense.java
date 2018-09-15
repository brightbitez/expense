package csku.expense;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


public class StepDefExpense {
    Expense expense;
    @Before
    public void init() {
        expense = new Expense(100);
        expense.addMoneyWithTransaction(50,20,1,2016,1,1);
    }
    @Given("a user with account balance (\\d+) exists")
    public void a_user_with_account_balance_exists(int balance){expense.getMoney();}
    @Given("a user with first transaction amount of (\\d+) exists")
    public void a_user_with_first_transaction_exists(int amount){
        expense.getTransactionAmount(1);
    }
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
    @When("I edit first transaction amount to (\\d+), date to (\\d+)/(\\d+)/(\\d+), category to (\\d+) and description to (\\d+)")
    public void edit_my_first_transaction(int amount,int year,int month,int date,String category,String description){
        expense.editTransaction(1,100,25,1,2017,1,1);
    }
    @Then("my first transaction amount is (.*), date is (.*)/(.*)/(.*), category is (.*) and description is (.*)")
    public void get_first_transaction_info_after_edit(int amount,int year,int month,int date,int category,int description)
    {
        assertEquals(amount, expense.getTransactionAmount(1));
        assertEquals(date, expense.getTransactionYear(1));
        assertEquals(month, expense.getTransactionMonth(1));
        assertEquals(year, expense.getTransactionDay(1));
        assertEquals(category, expense.getTransactionCategory(1));
        assertEquals(description, expense.getTransactionDescription(1));
    }
}
