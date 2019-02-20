package io.zipcoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Application {

    IOConsole ioConsole = new IOConsole();
    List<Pet> petArrayList = new ArrayList<Pet>();


    public void start() {

        Integer totalNumberOfPets = ioConsole.getIntegerInput("How many pets do you own?");
        for (Integer i = 0; i < totalNumberOfPets; i++) {
            String name = ioConsole.getStringInput("What is your pet name?");
            Integer age = ioConsole.getIntegerInput("How old is your pet?");
            String type = ioConsole.getStringInput("What type is your pet?").toLowerCase();
            while (!(type.equals("dog") || type.equals("cat") || type.equals("turtle"))) {
                type = ioConsole.getStringInput("Try again! You must put a cat, dog, or turtle.").toLowerCase();}

                Pet pet = null;

                switch (type) {
                    case "dog":
                        pet = new Dog(name);
                        break;

                    case "cat":
                        pet = new Cat(name);
                        break;

                    case "turtle":
                        pet = new Turtle(name);
                }
                petArrayList.add(pet);
            }

        }
    public void printListByName() {
        Collections.sort(petArrayList);
        for( Pet pet: petArrayList) {
            ioConsole.println("%s %s", pet.getName(), pet.speak());
        }
    }
    public void printListByType() {
        Compare compare = new Compare();
        Collections.sort(petArrayList,new Compare());
        for( Pet pet: petArrayList) {
            ioConsole.println("%s %s", pet.getName(), pet.speak());}

    }
    }

