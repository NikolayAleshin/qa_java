package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    Animal animal;

    @Before
    public void init() {
        animal = new Animal();
    }

    @Test
    public void getFoodHerbivoreTest() throws Exception {
        List<String> expectedFood = Arrays.asList("Трава", "Различные растения");
        assertEquals(expectedFood, animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodPredatorTest() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, animal.getFood("Хищник"));
    }

    @Test
    public void getFoodExceptionTest() {
        try {
            animal.getFood("Тест");
            throw new Exception("Не сработало исключение метода");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void getFamilyTest() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }
}