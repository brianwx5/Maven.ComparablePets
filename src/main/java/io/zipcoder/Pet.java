package io.zipcoder;


import java.util.ArrayList;

public class Pet implements Comparable<Pet> {
    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private  String name;

    private  Integer age;

    public Pet () {}

    public Pet (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() { return "";
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int compareTo(Pet o) {
        int result;
        if(this.name.compareTo(o.name) ==0)
        {
            if (this instanceof Cat) {
                return result = -1;
            } else if (this instanceof Dog) {
                return result = 0;
            } else if (this instanceof Turtle){
                    return result = 1;}
        }
        return this.name.compareTo(o.getName());


        }
    }

