package netolodgy.ru;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    protected TreeMap<String, Integer> phoneBookList = new TreeMap<>();

    public int add(String name, int number) {
        phoneBookList.put(name, number);
        return phoneBookList.size();
    }

    public String findByNumber(int number) {
        if (phoneBookList.containsValue(number)) {
            for (Map.Entry<String, Integer> entry : phoneBookList.entrySet()) {
                if (entry.getValue() == number) return (entry.getKey());
                break;
            }
        }
        return null;
    }

    public Integer findByName(String text) {
        if (phoneBookList.containsKey(text)) {
            return phoneBookList.get(text);
        }
        return null;
    }

    public void printAllNames() {
        for (Map.Entry<String, Integer> entry : phoneBookList.entrySet()) {
            System.out.println(entry.getKey().trim());
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBookList=" + phoneBookList +
                '}';
    }
}


