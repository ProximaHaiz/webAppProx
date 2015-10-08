package main.ru.javawebinar.webapp.model.other;

/**
 * Created by Proxima on 08.10.2015.
 */
public class PersonalizationException extends Exception{
    public PersonalizationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonalizationException(String message) {
        super(message);
    }
}
