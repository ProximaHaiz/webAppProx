package main;

import main.ru.javawebinar.webapp.model.ContactType;
import main.ru.javawebinar.webapp.model.Link;
import main.ru.javawebinar.webapp.model.MultiTextSection;

import java.util.Arrays;

/**
 * User: gkislin
 * Date: 18.06.2014
 */
public class Main {
    public static void main(String[] args) {
        for (ContactType contact : ContactType.values()) {
            System.out.println(contact.toHtml("value"));
        }
        new MultiTextSection("a", "b", "b");
        new MultiTextSection(new String[]{"a", "b", "b"});
    }
}
