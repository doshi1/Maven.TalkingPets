package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    // Pet cat = new Pet(null, null);

    @Test
    public void speakTest() {
        Cat cat = new Cat("Tomm");
        String expected = "Meoww";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        // Given
        Cat cat = new Cat("Tomm");
        String expectedName = "Tomm";
        // When
        String actualName = cat.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }

}
