import java.util.*;

public class PhoneBook {

    //Телефонная книга на основе HashMap
    Map<String, ArrayList<Long>> addressBook = new HashMap<>();

    //Метод вставки нового абонента в телефонную книгу
    protected void add(String nameKey, long phoneNumber) {

        ArrayList<Long> list = addressBook.get(nameKey);
        if (list == null) {
            list = new ArrayList<>();
            list.add(phoneNumber);
            addressBook.put(nameKey, list);
        } else {
            list.add(phoneNumber);
        }
    }

    //Метод выдает номер телефона по фамилии
    protected void get(String nameKey) {
        System.out.println("Контактная информация абонента - " + nameKey + ", - " + addressBook.get(nameKey));
    }

    //Вывод всей информации о каждом абоненте в телефонной книге
    protected void getUsersAll() {
        for (Map.Entry<String, ArrayList<Long>> tmp : addressBook.entrySet()) {
            System.out.println("Пользователь - " + tmp.getKey() + ", телефон - " + tmp.getValue());
        }
    }


}
