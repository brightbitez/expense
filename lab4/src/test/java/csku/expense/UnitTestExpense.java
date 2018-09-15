package csku.expense;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class UnitTestExpense {
    Expense expense;
    int initBalance = 100;

    @BeforeEach
    void init(){expense = new Expense(initBalance);}

    @Test
    void testAddMoney(){
        expense.addMoney(200);
        assertEquals(300,expense.getMoney());
    }
    @Test
    void testWithdraw(){
        expense.takeOutMoney(100);
        assertEquals(0,expense.getMoney());
    }
    @Test
    void testEdit(){
        expense.addMoneyWithTransaction(100,1,3,2016, 1, 1);
        expense.editTransaction(1,50,2,2,2017,1,1);
        assertEquals(50,expense.getTransactionAmount(1));
        assertEquals(2,expense.getTransactionDay(1));
        assertEquals(2,expense.getTransactionMonth(1));
        assertEquals(2017,expense.getTransactionYear(1));
        assertEquals(1,expense.getTransactionCategory(1));
        assertEquals(1,expense.getTransactionDescription(1));
    }


}
