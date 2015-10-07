package main.ru.javawebinar.webapp.model.other;

public class Amphibia implements Aqueous, Ground {
    public static void main(String[] args) {
        String amphy = "amphy";
        Amphibia am = new Amphibia();
        am.swimSkill();
        am.toRun();
        am.printInfo(amphy);

    }
}
