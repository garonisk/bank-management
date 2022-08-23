package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.main.model.Transaction;

public class TransactionTests{

    Transaction transaction;

    @Before
    public void setup() {
        transaction = new Transaction(Transaction.Type.WITHDRAW , 1661249104, "6b8dd258-aba3-4b19-b238-45d15edd4b48", 624.99);
    }

    @Test
    public void correctDateTest(){
        assertEquals("23-08-2022", transaction.returnDate());
    }

}

