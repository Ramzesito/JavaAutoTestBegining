package ru.netology.service;

public class CashbackHackServiceTest {

    //-------- JUNIT4 tests ----------
    @org.junit.Test
    public void shouldRemain0If1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        org.junit.Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldRemain1000If0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        org.junit.Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void shouldRemainTo1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1800);
        int expected = 200;

        org.junit.Assert.assertEquals(expected,actual);
    }

    //-------- JUNIT5 tests ----------
    @org.junit.jupiter.api.Test
    public void shouldRemain0If1000_JUnit5() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain1000If0_JUnit5() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemainTo1000_JUnit5() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1800);
        int expected = 200;

        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }
}
