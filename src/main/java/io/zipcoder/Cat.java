package io.zipcoder;

import java.util.ArrayList;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }

    public String speak() {
        return "Meow";

    }

}
