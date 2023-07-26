package ru.netology.service;

import org.junit.Assert;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldRemain0If1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldRemain1000If0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldRemainTo1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1800);
        int expected = 200;

        Assert.assertEquals(expected,actual);
    }
}
