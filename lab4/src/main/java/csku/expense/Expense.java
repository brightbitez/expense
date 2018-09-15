package csku.expense;

import java.util.Date;

public class Expense {
    private int money;
    private Transaction[] transaction = new Transaction[100];
    private int count = 1;

    public Expense(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money){
        this.money += money;
    }
    public void addMoneyWithTransaction(int amount, int day,int month,int year, int category, int description){
        this.transaction[count] = new Transaction(amount,day,month,year,category,description);
        this.money+=amount;
        count++;
    }
    public void takeOutMoneyWithTransaction(int amount, int day,int month,int year, int category, int description){
        if(this.money>=amount){
            this.transaction[count] = new Transaction(amount,day,month,year,category,description);
            this.money-=amount;
            count++;
        }
        else{
            System.out.println("not enough money");
        }
    }
    public int takeOutMoney(int money){
        if(this.money>=money){
            this.money-=money;
            return money;
        }
        else{
            System.out.println("not enough money");
            return 0;
        }
    }
    public void editTransaction(int transactionNumber, int amount, int day ,int month,int year, int category, int description){
        this.transaction[transactionNumber].edit(amount,day,month,year,category,description);
    }
    public int getTransactionAmount(int transactionNumber){
        return transaction[transactionNumber].getAmount();
    }
    public int getTransactionDay(int transactionNumber){
        return transaction[transactionNumber].getDay();
    }
    public int getTransactionMonth(int transactionNumber){
        return transaction[transactionNumber].getMonth();
    }public int getTransactionYear(int transactionNumber){
        return transaction[transactionNumber].getYear();
    }
    public int getTransactionCategory(int transactionNumber){
        return transaction[transactionNumber].getCategory();
    }
    public int getTransactionDescription(int transactionNumber){
        return transaction[transactionNumber].getDescription();
    }




}
