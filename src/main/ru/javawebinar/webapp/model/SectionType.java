package main.ru.javawebinar.webapp.model;

/**
 * GKislin
 * 26.12.2014.
 */
public enum SectionType {
    OBJECTIVE("�������"),
    ACHIEVEMENT("����������"),
    QUALIFICATIONS("������������"),
    EXPERIENCE("���� ������"),
    EDUCATION("�����������");

    private String title;

    SectionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
