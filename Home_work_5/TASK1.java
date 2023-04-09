//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TASK1 {
    public static void main(String[] args) {
        System.out.println("Добавление контактов в телефонную книгу");
        AddNewContact("Светлана Петрова", "8918321965");
        AddNewContact("Светлана Петрова", "1234567890");
        AddNewContact("Анна Крутова", "222333344445555");
        ShowEntryContact("Светлана Петрова");
        ShowEntryContact("Павел Чернов");
        ShowEntryContact("Анна Крутова");
        System.out.println("Удаление контактов из телефонной книги");
        RemoveContact("Светлана Петрова", "8918321965");
        RemoveContact("Анна Крутова", "222333344445555");
        ShowEntryContact("Светлана Петрова");
        ShowEntryContact("Павел Чернов");
        ShowEntryContact("Анна Крутова");
    }
    public static Map<String, LinkedList<String>> PhoneBook = new HashMap<>();
    public static void AddNewContact(String name, String phoneNumber) {
        if (PhoneBook.containsKey(name)) {
            PhoneBook.get(name).add(phoneNumber);
        } else {
            LinkedList<String> numbers = new LinkedList<String>();
            numbers.add(phoneNumber);
            PhoneBook.put(name, numbers);
        }
    }
    public static LinkedList<String> SearchPhoneNumbers(String name) {
        if (!PhoneBook.containsKey(name))
            return null;
        return PhoneBook.get(name);
    }
    public static void ShowEntryContact(String name) {
        LinkedList<String> phoneNumbers = SearchPhoneNumbers(name);
        if (phoneNumbers == null) {
            System.out.printf("%s отсутствует в телефонной книге.\n", name);
        } else if (phoneNumbers.size() == 0) {
            System.out.printf("%s у него нет телефонных номеров.\n", name);
        } else {
            System.out.printf("%s есть номера телефонов: %s\n", name, String.join(", ", phoneNumbers));
            ;
        }
    }

    public static void RemoveContact(String name, String phoneNumber) {
        if (PhoneBook.containsKey(name)) {
            PhoneBook.get(name).remove(phoneNumber);
        }
    }
}