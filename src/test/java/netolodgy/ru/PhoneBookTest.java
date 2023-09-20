package netolodgy.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class PhoneBookTest {
    static PhoneBook phoneBook = new PhoneBook();

    @BeforeAll
    static void setup() {
        phoneBook.add("Pit", 1111);
    }

    @Test
    void validatePhoneBookAdd() {
        Integer result = phoneBook.add("Pit", 1111);
        Assertions.assertEquals(2, result);
    }

    @Test
    void validatePhoneBookAdd2() {
        Integer result2 = phoneBook.add("Anna", 2222);
        Assertions.assertEquals(2, result2);
    }

    @Test
    void validatePhoneBookFindByNumber() {
        String result = phoneBook.findByNumber(1111);
        Assertions.assertEquals("Pit", result);
    }

    @Test
    void validatePhoneBookFindByName () {
        Integer result = phoneBook.findByName("Pit");
        Assertions.assertEquals("1111", result);
    }
}