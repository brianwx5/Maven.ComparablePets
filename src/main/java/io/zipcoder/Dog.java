package io.zipcoder;

public class Dog extends Pet{

    public Dog (String name) {
        super(name);
    }

    public Dog (String name, Integer age) {
        super(name,age);
    }

    public String speak() {
        return "Bark";
    }

}
