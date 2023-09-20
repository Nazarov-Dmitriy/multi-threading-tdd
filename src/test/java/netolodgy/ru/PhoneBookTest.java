package netolodgy.ru;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;


class PhoneBookTest {
    static PhoneBook phoneBook = new PhoneBook();

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    @BeforeAll
    static void setup() {
        phoneBook.add("Pit", 1111);
    }
    @Before
    public void setUpStreams() {
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
        phoneBook.add("Mark", 2222);
        phoneBook.add("Bill", 2222);
        phoneBook.add("Li", 2222);

        phoneBook.printAllNames();

        Assert.assertEquals("Anna\n Bill\n Li\n".trim(), output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}