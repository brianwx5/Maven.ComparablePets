package io.zipcoder;

public class Turtle extends Pet {

    public Turtle(String name) {
        super(name); }

    public Turtle(String name, Integer age) {
        super(name, age); }

    public String speak() {
        return "Snap";
    }

}
