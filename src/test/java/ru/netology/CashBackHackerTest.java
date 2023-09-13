package ru.netology;

import static org.testng.Assert.*;

public class CashBackHackerTest {
    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHacker service = new CashBackHacker();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testAmountEqual() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testAmountLess() {
        CashBackHacker service = new CashBackHacker();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testAmountMore() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }

}