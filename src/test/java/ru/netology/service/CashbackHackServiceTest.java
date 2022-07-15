package ru.netology.service;

//import org.testng.annotations.Test;
import org.junit.Test;


//import static org.testng.Assert.*;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalcIfAmountCorrect() {
        int amount = 3600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcIfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcIfAmountIncorrect() {
        int amount = -3000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}