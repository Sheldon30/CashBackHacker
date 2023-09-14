package ru.netology;

import static org.testng.Assert.*;

public class CashBackHackerTest {
    @org.junit.jupiter.api.Test
    public void testRemain() {
        CashBackHacker service = new CashBackHacker();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testAmountEqual() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testAmountLess() {
        CashBackHacker service = new CashBackHacker();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testAmountMore() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

}