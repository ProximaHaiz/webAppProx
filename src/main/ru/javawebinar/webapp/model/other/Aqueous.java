package main.ru.javawebinar.webapp.model.other;

/**
 * Created by Proxima on 02.10.2015.
 */
public interface Aqueous extends Vehicle {
    default void swimSkill() {
        System.out.println("{"+getClass().getName() + "} can Swim! Yeahhhh");
    }


}
