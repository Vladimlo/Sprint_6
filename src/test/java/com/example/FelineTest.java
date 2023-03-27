package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;

    @Test
    public void eatMeatUsesGetFoodTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamalyTest() {
        String result = feline.getFamily();
        assertEquals("Метод getFamily() должен возвращать строку 'Кошачьи'", "Кошачьи", result);
    }

    @Test
    public void getKittensNoParamTest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensTest() {
        int result = feline.getKittens(10);
        assertEquals("Метод getKittensTest(int) " +
                "должен возвращать переданный ему аргумент", 10, result);
    }
}