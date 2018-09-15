package csku.expense;

import java.util.Date;

public class Transaction {
    private int amount;
    private int day;
    private int month;
    private int year;
    private int category;
    private int description;

    public Transaction(int amount, int day, int month, int year, int category, int description) {
        this.amount = amount;
        this.day = day;
        this.month = month;
        this.year = year;
        this.category = category;
        this.description = description;
    }

    public Transaction(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
    public void edit(int amount, int day,int month,int year, int category, int description) {
        this.amount = amount;
        this.day = day;
        this.month = month;
        this.year = year;
        this.category = category;
        this.description = description;
    }

}
