package csku.expense;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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


}
