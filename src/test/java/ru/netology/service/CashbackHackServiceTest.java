package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalcIfAmountCorrect() {
        int amount = 3600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcIfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcIfAmountIncorrect() {
        int amount = -3000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}