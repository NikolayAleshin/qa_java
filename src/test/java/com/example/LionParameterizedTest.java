package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String actualSex;
    private boolean expectedSex;

    @Mock
    IFeline feline;

    public LionParameterizedTest(String actualSex, boolean expectedSex) {
        this.actualSex = actualSex;
        this.expectedSex = expectedSex;
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void openMocks() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void lionHaveManeTest() throws Exception {
        Lion actual = new Lion(actualSex, feline);
        assertEquals(expectedSex, actual.doesHaveMane());
    }
}