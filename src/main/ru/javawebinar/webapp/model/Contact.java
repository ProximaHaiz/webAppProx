package main.ru.javawebinar.webapp.model;

public class Contact {
    private final String type;
    private final String contact;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact1 = (Contact) o;

        if (contact != null ? !contact.equals(contact1.contact) : contact1.contact != null) return false;
        if (type != null ? !type.equals(contact1.type) : contact1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        return result;
    }

    public String getType() {
        return type;
    }

    public String getContact() {
        return contact;
    }

    public Contact(String type, String contact) {

        this.type = type;
        this.contact = contact;
    }
}
