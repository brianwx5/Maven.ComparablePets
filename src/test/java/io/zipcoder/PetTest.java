package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void setNameTest() {
        // Given
        Pet testPet = new Pet();
        String expectedName = "Milo";

        // When
        testPet.setName(expectedName);
        String actualName = testPet.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        // Given
        Pet testPet = new Pet();
        String expectedSpeak = "";

        // When
        String actualSpeak = testPet.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void setAgeTest() {
        // Given
        Pet testPet = new Pet();
        int expectedAge = 9;

        // When
        testPet.setAge(expectedAge);
        int actualAge = testPet.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void compareToTest() {
        // Given
        Pet testPet1 = new Pet("abc");
        Pet testPet2 = new Pet("aaa");

        // When
        int result = testPet1.compareTo(testPet2);

        // Then
        Assert.assertTrue(result > 0);
    }

    @Test
    public void turtleSpeakTest() {
        // Given
        Pet testPet = new Turtle("whatever");
        String expectedSpeak = "Snap";

        // When
        String actualSpeak = testPet.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void catSpeakTest() {
        // Given
        Pet testPet = new Cat("whatever");
        String expectedSpeak = "Meow";

        // When
        String actualString = testPet.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualString);
    }

    @Test
    public void DogSpeakTest() {
        // Given
        Pet testPet = new Dog("whatever");
        String expectedSpeak = "Bark";

        // When
        String actualString = testPet.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualString);
    }
}