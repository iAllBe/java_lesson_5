import java.util.HashMap;

public class TaskOne {
    // 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
    // человек может иметь несколько телефонов.

    public HashMap<Integer, String> fillMap(HashMap<Integer, String> phoneBook) {
        phoneBook.put(111111, "Иванов");
        phoneBook.put(33333, "Васильев");
        phoneBook.put(444444, "Петрова");
        phoneBook.put(5555555, "Иванов");
        phoneBook.put(666666, "Петрова");
        phoneBook.put(777777, "Иванов");
        return phoneBook;
    }

    public void getPhoneInfoByName(HashMap<Integer, String> phoneBook, String name) {
        for (HashMap.Entry<Integer, String> phoneBookEntry : phoneBook.entrySet()) {
            if (phoneBookEntry.getValue().equals(name)) {
                System.out.println(phoneBookEntry.getKey());
            }
        }
    }
}
