package main.ru.javawebinar.webapp.store;

import main.ru.javawebinar.webapp.model.Resume;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * GKislin
 * 02.10.2015.
 */
public class ArrayStorage implements IStore {
    private static final int MAX_LENGTH = 10000;
    private Resume[] array = new Resume[MAX_LENGTH];
    private int counter = 0;

    @Override
    public void clear() {
        this.array = null;
        counter = 0;
    }

    @Override
    public void save(Resume r) {
        array[counter++] = r;
    }

    @Override
    public void update(Resume r) {

    }

    @Override
    public Resume load(String uuid) {
        for (Resume res : array) {
            if (Objects.equals(res.getUuid(), uuid)) {
                return res;
            }
        }

        return null;
    }

    @Override
    public void delete(String uuid) {
        int count;
        for (count = 0; count < array.length; count++) {
            System.out.println("count = " +count);
            if (Objects.equals(array[count].getUuid(), uuid)) {
                array[count] = null;
                System.out.println(count);
//                System.arraycopy(array, count + 1, array, count, this.size()-count);
                counter -= 1;
            }
        }
    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public String toString() {
        return "ArrayStorage{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
