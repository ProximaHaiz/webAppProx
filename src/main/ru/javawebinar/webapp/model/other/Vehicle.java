package main.ru.javawebinar.webapp.model.other;

/**
 * Created by Proxima on 02.10.2015.
 */
public interface Vehicle {
    default void printInfo(String model) {
        System.out.println("Vehicle model is " + model);
    }
}
