package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ApplicationTest {

    @Test
    public void numberOfPetsOwned() {
        //Given

        //When

        //Then

    }


    @Test
    public void typesOfPetsOwnedWithName() {
        //Given

        //When

        //Then

    }


    @Test
    public  void printOutPetsOwnedWithName() {
        //Given

        //When

        //Then

    }

    @Test
    public void testSort(){
        ArrayList<Pet> PetList = new ArrayList<>();
        Dog dog = new Dog("Will");
        Cat cat = new Cat("Willis");
        PetList.add(dog);
        PetList.add(cat);

        ArrayList<Pet> expected = new ArrayList<>();
        expected.add(cat);
        expected.add(dog);

        Collections.sort(PetList);

        Assert.assertEquals(expected, PetList);
    }


}
