package main.ru.javawebinar.webapp.store;

import main.ru.javawebinar.webapp.model.Resume;

import java.util.*;

/**
 * GKislin
 * 02.10.2015.
 */
public class ArrayStorage implements IStore {
    private static final int MAX_LENGTH = 7;
    private Resume[] array = new Resume[MAX_LENGTH];
    private int counter = 0;

    @Override
    public void clear() {
        this.array = null;
        counter = 0;
    }

    @Override
    public void save(Resume r) {
        if (r != null) {
            array[counter++] = r;
        } else {
            throw new IllegalArgumentException("r = " + null);
        }
    }

    @Override
    public void update(Resume r) {

    }

    @Override
    public Resume load(String uuid) {
        Resume resume = null;
        if (uuid == null) {
            throw new IllegalArgumentException("uuid = " + null);
        } else {
            for (int i = 0; i < this.size() - 1; i++) {
//                System.out.println(array[i].getUuid());
                if (Objects.equals(array[i].getUuid(), uuid)) {
                    resume = array[i];
                }
            }
            if (resume == null) {
                throw new NoSuchElementException("element with uuid <<" + uuid + ">> is missing");
            }
        }
        return resume;
    }

    @Override
    public void delete(String uuid) {
        if (uuid != null) {
            int count;
            for (count = 0; count < array.length; count++) {
//            System.out.println("count = " + count + ", UUID = " + array[count].getUuid());
                if (Objects.equals(array[count].getUuid(), uuid)) {
                    array[count] = null;
//                System.out.println(count);
                    System.arraycopy(array, count + 1, array, count, this.size() - count);
                    break;
                }
            }
        } else {
            throw new IllegalArgumentException("uuid = " + null);
        }
    }

    @Override
    public Collection<Resume> getAllSorted() {
        for (int i = 0; i < this.size(); i++) {
//            System.out.println("a");
            for (int j = 0; j < this.size() - 1 - i; j++) {
//                System.out.println("j = " + j);
                if (array[j].getFullName().compareTo(array[j + 1].getFullName()) > 0) {
                    Resume tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return new ArrayList<>(Arrays.asList(array));
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

    public void printFullName() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(array[i].getFullName());
        }
    }

    //в разработке
    private Resume binarySearchFor_uuid(String uuid) {
        int key = Integer.parseInt(uuid);
        int left = Integer.parseInt(array[0].getUuid());
        int right = Integer.parseInt(array[size() - 1].getUuid());

        while (left <= right) {
            int mid = (left + right) >>> 1;
            int midVal = Integer.parseInt(array[mid].getUuid());

            if (midVal < key)
                left = mid + 1;
            else if (midVal > key)
                right = mid - 1;
            else
                return array[mid]; // key found
        }
        return null;  // key not found.
//        System.out.println(left);
//        System.out.println(roght);
    }
}
