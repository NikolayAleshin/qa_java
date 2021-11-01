package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Cat actualCat;

    @Mock
    Feline feline;

    @Before
    public void openMocks() {
        MockitoAnnotations.openMocks(this);
        actualCat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        String expected = "Мяу";
        assertEquals(expected, actualCat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(actualCat.getFood()).thenReturn(expectedFood);
        assertEquals(expectedFood, actualCat.getFood());
    }
}