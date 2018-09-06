package csku.expense;

public class main {
    public static void main(String[] args) {
        System.out.println("Starting income and expense app with an amount of 500");
        Expense expense = new Expense(500);
        System.out.println("add 100");
        expense.addMoney(100);
        System.out.println("withdraw 600");
        expense.takeOutMoney(600);
        System.out.println("Total balance is " + expense.getMoney());
    }
}
