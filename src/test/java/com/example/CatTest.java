package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Feline predator = Mockito.mock();
    Cat cat = Mockito.spy(new Cat(predator));

    @Test
    public void getFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(predator, Mockito.times(1)).eatMeat();
    }

    @Test
    public void getSoundTest() {
        assertEquals(cat.getSound(), "Мяу");
    }
}