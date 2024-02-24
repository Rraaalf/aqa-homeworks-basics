package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    int amount;
    int actual;
    int expected;

    @Test
    public void remainWithAmount1000Test() {
        amount = 1000;
        actual = service.remain(amount);
        expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWithAmount1500Test() {
        amount = 1500;
        actual = service.remain(amount);
        expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainWithAmount0Test() {
        amount = 0;
        actual = service.remain(amount);
        expected = 1000;

        Assert.assertEquals(expected, actual);
    }
}
