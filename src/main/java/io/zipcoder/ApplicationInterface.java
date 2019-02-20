package io.zipcoder;

import java.util.ArrayList;

public class ApplicationInterface {

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
        application.printListByName();
        application.printListByType();
    }
}
