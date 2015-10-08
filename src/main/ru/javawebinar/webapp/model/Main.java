package main.ru.javawebinar.webapp.model;

import main.ru.javawebinar.webapp.store.ArrayStorage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * User: gkislin
 * Date: 18.06.2014
 */
public class Main {
    public static void main(String[] args) {
        Map<ContactType, String> contacts = new HashMap<>();
        Map<SectionType, String  /*Section*/> sections = new HashMap<>();
        contacts.put(ContactType.MOBILE, "063-621-52-02");
        contacts.put(ContactType.HOME_PHONE, "492-15-44");
        sections.put(SectionType.EXPERIENCE, "ss");
        sections.put(SectionType.QUALIFICATIONS, "Boss");


        Resume res = new Resume("0", "Alad", contacts, sections);
        Resume res1 = new Resume("1", "Masha", contacts, sections);
        Resume res2 = new Resume("2", "Luba", contacts, sections);
        Resume res3 = new Resume("3", "Puda", contacts, sections);
        Resume res4 = new Resume("4", "Max", contacts, sections);
        Resume res5 = new Resume("5", "Rvan", contacts, sections);

        ArrayStorage as = new ArrayStorage();
        as.save(res);
        as.save(res1);
        as.save(res2);
        as.save(res3);
        as.save(res4);
        as.save(res5);
        System.out.println("size = " + as.size());

        as.printFullName();

        as.getAllSorted();
        System.out.println();
        as.printFullName();

        Collection <Resume> coll = as.getAllSorted();
        System.out.println(coll);

        as.binarySearchFor_uuid("3");


//        System.out.println(as.toString());
//        System.out.println(as.load("0"));
//        as.delete("3");
//        System.out.println("size = " + as.size());
//        System.out.println(as.toString());
//        System.out.println("aaaa");
//        System.out.println(as.load("4"));
    }
}
