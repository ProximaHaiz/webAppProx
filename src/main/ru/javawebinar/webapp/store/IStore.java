package main.ru.javawebinar.webapp.store;

import main.ru.javawebinar.webapp.model.Resume;

import java.util.Collection;

/**
 * GKislin
 * 02.10.2015.
 */
public interface IStore {
    void clear();

    void save(Resume r);

    void update(Resume r);

    Resume load(String uuid)/*throws PersonalizationException*/;

    void delete(String uuid);

    Collection<Resume> getAllSorted();

    int size();
}
