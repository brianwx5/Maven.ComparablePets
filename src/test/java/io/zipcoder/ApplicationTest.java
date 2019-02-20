package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ApplicationTest {
    private ByteArrayOutputStream byteArrOutStream = new ByteArrayOutputStream();
    private ByteArrayInputStream byteArrInStream;

    @Before
    public void changeOutputStream(){
        byteArrOutStream.reset();
        if (byteArrInStream != null) {
            byteArrInStream.reset();
        }
        System.setOut(new PrintStream(byteArrOutStream));
    }

    @After
    public void resetStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
        byteArrOutStream.reset();
        if (byteArrInStream != null) {
            byteArrInStream.reset();
        }
    }


    @Test
    public void printListByNameTest1() {
        // Given
        int numPets = 3;

        String petName1 = "Dylan";
        int petAge1 = 5;
        String petType1 = "dog";

        String petName2 = "Frank";
        int petAge2 = 3;
        String petType2 = "cat";

        String petName3 = "Bob";
        int petAge3 = 5;
        String petType3 = "turtle";

        String input = String.format("%d\n%s\n%d\n%s\n%s\n%d\n%s\n%s\n%d\n%s\n",
                numPets, petName1, petAge1, petType1, petName2, petAge2, petType2, petName3, petAge3, petType3);

        byteArrInStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrInStream);

        String expectedOutput = String.format("%s %s\n%s %s\n%s %s\n",
                petName3, "Snap", petName1, "Bark", petName2, "Meow");

        // When
        Application application = new Application();
        application.start();

        byteArrOutStream.reset();

        application.printListByName();

        String actualOutput = byteArrOutStream.toString();
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void printListByNameTest2() {
        // Given
        int numPets = 3;

        String petName1 = "a";
        int petAge1 = 5;
        String petType1 = "dog";

        String petName2 = "b";
        int petAge2 = 3;
        String petType2 = "cat";

        String petName3 = "c";
        int petAge3 = 5;
        String petType3 = "turtle";

        String input = String.format("%d\n%s\n%d\n%s\n%s\n%d\n%s\n%s\n%d\n%s\n",
                numPets, petName1, petAge1, petType1, petName2, petAge2, petType2, petName3, petAge3, petType3);

        byteArrInStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrInStream);

        String expectedOutput = String.format("%s %s\n%s %s\n%s %s\n",
                petName1, "Bark", petName2, "Meow", petName3, "Snap");

        // When
        Application application = new Application();
        application.start();

        byteArrOutStream.reset();

        application.printListByName();

        String actualOutput = byteArrOutStream.toString();
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void printListByNameTest3() {
        // Given
        int numPets = 3;

        String petName1 = "x";
        int petAge1 = 5;
        String petType1 = "dog";

        String petName2 = "n";
        int petAge2 = 3;
        String petType2 = "cat";

        String petName3 = "f";
        int petAge3 = 5;
        String petType3 = "turtle";

        String input = String.format("%d\n%s\n%d\n%s\n%s\n%d\n%s\n%s\n%d\n%s\n",
                numPets, petName1, petAge1, petType1, petName2, petAge2, petType2, petName3, petAge3, petType3);

        byteArrInStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrInStream);

        String expectedOutput = String.format("%s %s\n%s %s\n%s %s\n",
                petName3, "Snap", petName2, "Meow", petName1, "Bark");

        // When
        Application application = new Application();
        application.start();

        byteArrOutStream.reset();

        application.printListByName();

        String actualOutput = byteArrOutStream.toString();
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void printListByTypeTest1() {
        // Given
        int numPets = 3;

        String petName1 = "Cathy";
        int petAge1 = 5;
        String petType1 = "turtle";

        String petName2 = "Bob";
        int petAge2 = 3;
        String petType2 = "cat";

        String petName3 = "Terry";
        int petAge3 = 5;
        String petType3 = "dog";

        String input = String.format("%d\n%s\n%d\n%s\n%s\n%d\n%s\n%s\n%d\n%s\n",
                numPets, petName1, petAge1, petType1, petName2, petAge2, petType2, petName3, petAge3, petType3);

        byteArrInStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrInStream);

        String expectedOutput = String.format("%s %s\n%s %s\n%s %s\n",
                petName2, "Meow", petName3, "Bark", petName1, "Snap");

        // When
        Application application = new Application();
        application.start();

        byteArrOutStream.reset();

        application.printListByType();

        String actualOutput = byteArrOutStream.toString();
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void printListByTypeTest2() {
        // Given
        int numPets = 3;

        String petName1 = "xar";
        int petAge1 = 5;
        String petType1 = "dog";

        String petName2 = "bar";
        int petAge2 = 3;
        String petType2 = "turtle";

        String petName3 = "gar";
        int petAge3 = 5;
        String petType3 = "cat";

        String input = String.format("%d\n%s\n%d\n%s\n%s\n%d\n%s\n%s\n%d\n%s\n",
                numPets, petName1, petAge1, petType1, petName2, petAge2, petType2, petName3, petAge3, petType3);

        byteArrInStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrInStream);

        String expectedOutput = String.format("%s %s\n%s %s\n%s %s\n",
                petName3, "Meow", petName1, "Bark", petName2, "Snap");

        // When
        Application application = new Application();
        application.start();

        byteArrOutStream.reset();

        application.printListByType();

        String actualOutput = byteArrOutStream.toString();
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void printListByTypeTest3() {
        // Given
        int numPets = 3;

        String petName1 = "Cathy";
        int petAge1 = 5;
        String petType1 = "cat";

        String petName2 = "Bob";
        int petAge2 = 3;
        String petType2 = "dog";

        String petName3 = "Terry";
        int petAge3 = 5;
        String petType3 = "turtle";

        String input = String.format("%d\n%s\n%d\n%s\n%s\n%d\n%s\n%s\n%d\n%s\n",
                numPets, petName1, petAge1, petType1, petName2, petAge2, petType2, petName3, petAge3, petType3);

        byteArrInStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrInStream);

        String expectedOutput = String.format("%s %s\n%s %s\n%s %s\n",
                petName1, "Meow", petName2, "Bark", petName3, "Snap");

        // When
        Application application = new Application();
        application.start();

        byteArrOutStream.reset();

        application.printListByType();

        String actualOutput = byteArrOutStream.toString();
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}