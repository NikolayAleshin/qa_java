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

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionNotParameterizedTest {

    @Mock
    IFeline feline;

    @Before
    public void openMocks() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getNumberKittensTest() throws Exception {
        Lion actual = new Lion("Самец", feline);
        int expectedKittens = 1;
        Mockito.when(actual.getKittens()).thenReturn(expectedKittens);
        assertEquals(expectedKittens, actual.getKittens());
    }

    @Test
    public void lionCreatedWithNoTypeSexExceptionTest() {
        try {
            new Lion("Тест", feline);
            throw new Exception("Не сработало исключение метода");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }

    @Test
    public void callGetFoodTest() throws Exception {
        Lion actual = new Lion("Самец", feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(actual.getFood()).thenReturn(expectedFood);
        assertEquals(expectedFood, actual.getFood());
    }
}