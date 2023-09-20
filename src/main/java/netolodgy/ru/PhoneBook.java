package netolodgy.ru;

import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    protected TreeMap<String, Integer> phoneBookList = new TreeMap<>();

    public int add(String name, int number) {
        phoneBookList.put(name, number);
            return phoneBookList.size();
    }

    public String findByNumber(int number) {
        return null;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBookList=" + phoneBookList +
                '}';
    }
}


