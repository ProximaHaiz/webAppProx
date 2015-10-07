package main.ru.javawebinar.webapp.model.other;

/**
 * Created by Proxima on 02.10.2015.
 */
public interface Ground extends Vehicle {
    default void toRun() {
        System.out.println("I can running!!!");
    }
}
