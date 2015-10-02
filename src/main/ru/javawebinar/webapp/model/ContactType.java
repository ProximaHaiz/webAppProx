package main.ru.javawebinar.webapp.model;

import java.io.Serializable;

/**
 * GKislin
 * 26.12.2014.
 */
public enum ContactType {
    PHONE("���."),
    MOBILE("���������"),
    HOME_PHONE("�������� ���."),
    SKYPE("Skype"){
        @Override
        public String toHtml(String value) {
            return "<a href='skype:" + value + "'>" + value + "</a>";
        }
    },
    MAIL("�����") {
        @Override
        public String toHtml(String value) {
            return "<a href='mailto:" + value + "'>" + value + "</a>";
        }
    },
    ICQ("ICQ");

    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toHtml(String value) {
        return title + ": " + value;
    }
}
