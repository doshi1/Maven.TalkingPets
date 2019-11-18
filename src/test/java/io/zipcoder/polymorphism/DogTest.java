package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speakTest() {
        Dog dog = new Dog();
        String expected = "Bark";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        // Given
        Dog dog = new Dog();
        String expectedName = "Lio";
        // When
        String actualName = dog.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
