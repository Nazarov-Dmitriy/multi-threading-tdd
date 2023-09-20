package netolodgy.ru;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



class PhoneBookTest {
    static PhoneBook phoneBook = new PhoneBook();
    private static ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeAll
    static void setup() {
        phoneBook.add("Pit", 1111);
        System.setOut(new PrintStream(output));
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
    void validatePhoneBookFindByName() {
        Integer result = phoneBook.findByName("Pit");
        Assertions.assertEquals(1111, result);
    }

    @Test
    void validatePhoneBookPrintAllNames() throws Exception {
        phoneBook.add("Anna", 2222);
        phoneBook.add("Mark", 333);
        phoneBook.add("Bill", 44);
        phoneBook.add("Li", 3333);

        phoneBook.printAllNames();

          Assertions.assertEquals("""
                Anna\r
                Bill\r
                Li\r
                Mark\r
                Pit""", output.toString().trim());
    }
}