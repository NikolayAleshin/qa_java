package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void getEatMeatTest() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getKittensNumberTest() {
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }

    @Test
    public void getKittensMoreOneNumberTest() {
        int actual = 2;
        int expected = 2;
        assertEquals(expected, feline.getKittens(actual));
    }
}