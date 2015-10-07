package main;

import main.ru.javawebinar.webapp.model.ContactType;
import main.ru.javawebinar.webapp.model.Section;
import main.ru.javawebinar.webapp.model.*;
import main.ru.javawebinar.webapp.store.ArrayStorage;

import java.util.HashMap;
import java.util.Map;

/**
 * User: gkislin
 * Date: 18.06.2014
 */
public class Main {
    public static void main(String[] args) {
        Map<ContactType, String> contacts = new HashMap<>();
        Map<SectionType, Section> sections = new HashMap<>();
        contacts.put(ContactType.MOBILE, "063-621-52-02");
        contacts.put(ContactType.HOME_PHONE, "492-15-44");


        Resume res = new Resume("1", "Vlad", contacts, sections);
        Resume res1 = new Resume("2", "Vlad", contacts, sections);
        Resume res2 = new Resume("3", "Vlad", contacts, sections);

        ArrayStorage as = new ArrayStorage();
        as.save(res);
        as.save(res1);
        as.save(res2);
        System.out.println("size = " + as.size());


        System.out.println(as.toString());
        System.out.println(as.load("2"));
        as.delete("3");
        System.out.println("size = " + as.size());
//        System.out.println(as.toString());
        System.out.println("aaaa");
        System.out.println(as.load("2"));


    }
}
