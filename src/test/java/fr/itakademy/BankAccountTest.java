package fr.itakademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    
    private BankAccount bankAccount;

    @BeforeEach
    public void init() {
        Client client = new Client(132, "John", "Doe", 20, 120);
        this.bankAccount = new BankAccount(456, 1337, client);
    }

    @Test
    void should_add_money_to_bank() {
        this.bankAccount.depositMoney(10);
        assertEquals(1347, this.bankAccount.getAccountCredit());
    }
}
