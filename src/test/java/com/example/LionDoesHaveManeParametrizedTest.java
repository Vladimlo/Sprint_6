package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManeParametrizedTest {
    private final boolean expectedResult;
    private final Lion lion;

    public LionDoesHaveManeParametrizedTest(String gender, boolean expectedResult) throws Exception {
        this.expectedResult = expectedResult;
        Feline feline = Mockito.mock(Feline.class);
        this.lion = new Lion(gender, feline);
    }

    @Parameterized.Parameters
    public static Object[][] doesHaveManeData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeDataTest() throws Exception {
        assertEquals(expectedResult, lion.doesHaveMane());
    }
}