package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AlexTest {

    Alex alex;

    @Before
    public void init() throws Exception {
        alex = new Alex();
    }


    @Test
    public void getKittensTest() {

        int expectedKittens = 0;
        assertEquals(expectedKittens, alex.getKittens());
    }

    @Test
    public void getFriendsNameTest() {
        List<String> expectedNameFriends = Arrays.asList("Марти", "Глория", "Мелман");
        assertEquals(expectedNameFriends, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        String expectedPlaceOfLiving = "Нью-Йоркский Зоопарк";
        assertEquals(expectedPlaceOfLiving, alex.getPlaceOfLiving());
    }
}