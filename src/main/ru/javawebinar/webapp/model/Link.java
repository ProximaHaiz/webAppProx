package main.ru.javawebinar.webapp.model;

import main.ru.javawebinar.webapp.model.main.Search;

import java.time.LocalDate;
import java.util.Collection;

/**
 * GKislin
 * 27.09.2015.
 */
public class Link {
    private final String name;
    private final String url;

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Link link = (Link) o;

        if (!name.equals(link.name)) {
            return false;
        }
        return !(url != null ? !url.equals(link.url) : link.url != null);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    public static class Contact {
         String type;
         String contact;

         @Override
         public boolean equals(Object o) {
              if (this == o) return true;
              if (!(o instanceof Contact)) return false;

              Contact contact1 = (Contact) o;

              if (!contact.equals(contact1.contact)) return false;
              if (!type.equals(contact1.type)) return false;

              return true;
         }

         @Override
         public int hashCode() {
              int result = type.hashCode();
              result = 31 * result + contact.hashCode();
              return result;
         }

         public void setType(String type) {

              this.type = type;
         }

         public void setContact(String contact) {
              this.contact = contact;
         }

         public Contact(String type, String contact) {
              this.type = type;
              this.contact = contact;
         }
    }

    public static class MultiTextSection extends Section {
        private Collection<String> content;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MultiTextSection)) return false;

            MultiTextSection that = (MultiTextSection) o;

            if (content != null ? !content.equals(that.content) : that.content != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return content != null ? content.hashCode() : 0;
        }

        public Collection<String> getContent() {

            return content;
        }

        public void setContent(Collection<String> content) {
            this.content = content;
        }

        public MultiTextSection(Collection<String> content) {
            super();
            this.content = content;
        }
    }

    public static class Organization {
       private Search homePage;
       private Collection<Position> periods;

        public Organization(Search homePage, Collection<Position> periods) {

            this.homePage = homePage;
            this.periods = periods;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Organization)) return false;

            Organization that = (Organization) o;

            if (homePage != null ? !homePage.equals(that.homePage) : that.homePage != null) return false;
            if (periods != null ? !periods.equals(that.periods) : that.periods != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = homePage != null ? homePage.hashCode() : 0;
            result = 31 * result + (periods != null ? periods.hashCode() : 0);
            return result;
        }

        public Search getHomePage() {

            return homePage;
        }

        public void setHomePage(Search homePage) {
            this.homePage = homePage;
        }

        public Collection<Position> getPeriods() {
            return periods;
        }

        public void setPeriods(Collection<Position> periods) {
            this.periods = periods;
        }

    }

    public static class OrganizationSection extends Section{
       private Collection<Organization> content;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof OrganizationSection)) return false;

            OrganizationSection that = (OrganizationSection) o;

            if (content != null ? !content.equals(that.content) : that.content != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return content != null ? content.hashCode() : 0;
        }

        public Collection<Organization> getContent() {

            return content;
        }

        public void setContent(Collection<Organization> content) {
            this.content = content;
        }

        public OrganizationSection(Collection<Organization> content) {
            this.content = content;
        }
    }

    public static class Position {
       private LocalDate startDate;
       private LocalDate endDate;
       private String position;
       private String description;

        public Position(LocalDate startDate, LocalDate endDate, String position, String description) {
            this.startDate = startDate;
            this.endDate = endDate;
            this.position = position;
            this.description = description;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Position position1 = (Position) o;

            if (description != null ? !description.equals(position1.description) : position1.description != null)
                return false;
            if (endDate != null ? !endDate.equals(position1.endDate) : position1.endDate != null) return false;
            if (position != null ? !position.equals(position1.position) : position1.position != null) return false;
            if (startDate != null ? !startDate.equals(position1.startDate) : position1.startDate != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = startDate != null ? startDate.hashCode() : 0;
            result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
            result = 31 * result + (position != null ? position.hashCode() : 0);
            result = 31 * result + (description != null ? description.hashCode() : 0);
            return result;
        }
    }

    /**
     * Created by Proxima on 02.10.2015.
     */
    public static enum Properties {
        OBJECTIVE,ACHIEVEMENT,QUALIFICATIONS,EXPERIENCE,EDUCATION,
    }

    public static class Resume {
       private String fullName;
       private Collection<Contact> contacts;
       private Section sections;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Resume)) return false;

            Resume resume = (Resume) o;

            return !(contacts != null ? !contacts.equals(resume.contacts) : resume.contacts != null) &&
                    !(fullName != null ? !fullName.equals(resume.fullName) : resume.fullName != null) &&
                    !(sections != null ? !sections.equals(resume.sections) : resume.sections != null);

        }

        @Override
        public int hashCode() {
            int result = fullName != null ? fullName.hashCode() : 0;
            result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
            result = 31 * result + (sections != null ? sections.hashCode() : 0);
            return result;
        }

        public String getFullName() {

            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Collection<Contact> getContacts() {
            return contacts;
        }

        public void setContacts(Collection<Contact> contacts) {
            this.contacts = contacts;
        }

        public Section getSections() {
            return sections;
        }

        public void setSections(Section sections) {
            this.sections = sections;
        }

        public Resume(String fullName, Collection<Contact> contacts, Section sections) {
            this.fullName = fullName;
            this.contacts = contacts;
            this.sections = sections;
        }
    }

    public static class Section {
        private String type;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Section)) return false;

            Section section = (Section) o;

            return !(type != null ? !type.equals(section.type) : section.type != null);

        }

        @Override
        public int hashCode() {
            return type != null ? type.hashCode() : 0;
        }

        public String getType() {

            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Section() {

        }

        public Section(String type) {
            this.type = type;
        }
    }

    public static class TextSection extends Section {
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TextSection)) return false;
            if (!super.equals(o)) return false;

            TextSection that = (TextSection) o;

            if (content != null ? !content.equals(that.content) : that.content != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + (content != null ? content.hashCode() : 0);
            return result;
        }

        public TextSection(String type, String content) {
            super(type);

            this.content = content;
        }
    }
}
