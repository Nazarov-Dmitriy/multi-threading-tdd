package netolodgy.ru;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    void validatePhoneBookAdd() {
        Integer result  = phoneBook.add("Pit", 89952444);
        Assertions.assertEquals(1, result);
    }
}