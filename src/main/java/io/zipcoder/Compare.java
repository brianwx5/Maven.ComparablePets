package io.zipcoder;

import java.util.Comparator;

public class Compare implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        int result = 0;
       /* if(o1.compareTo(o2) ==0) {
           return o1.getName().compareTo(o2.getName());
        } else {
            return o1.compareTo(o2);
        } */

        if (o1 instanceof Cat) {
            if (!(o2 instanceof Cat))
                result = -1;
        } else if (o1 instanceof Turtle) {
            if (!(o1 instanceof Turtle)) {
                result = 1;
            }
        } else if (o1 instanceof Dog) {
            if (o2 instanceof Cat) {
                result = 1;
            } else if (o2 instanceof Turtle) {
                result = -1;
            }
        } else {
            if (o1.compareTo(o2) == 0) {
                result = o1.getName().compareTo(o2.getName());
            } else {
                result = o1.compareTo(o2);
            }
        }
        return result;
    }
}
