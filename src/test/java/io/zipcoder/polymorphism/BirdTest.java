package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void speakTest() {
        Bird birdy = new Bird();
        String expected = "Tweet";
        String actual = birdy.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        // Given
        Bird birdy = new Bird();

        String expectedName = "Dove";
        // When
        String actualName = birdy.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
