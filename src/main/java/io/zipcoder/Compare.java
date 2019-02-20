package io.zipcoder;

import java.util.Comparator;

public class Compare implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        int result;
       /* if(o1.compareTo(o2) ==0) {
           return o1.getName().compareTo(o2.getName());
        } else {
            return o1.compareTo(o2);
        } */

        if (o1 instanceof Cat) {
            return -1;
        } else if (o2 instanceof Turtle) {
            return 1;
        } else {
            if (o1.compareTo(o2) == 0) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.compareTo(o2);
            }
        }
    }
}
