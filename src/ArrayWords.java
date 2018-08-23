
import java.util.*;

public class ArrayWords {

    //Создаем массив слов, с разной частотой повторения
    private static String [] words = {"Тумба","Кровать","Диван","Табурет","Стул","Диван","Кресло","Кровать","Скамейка","Шкаф","Стул","Гардина","Табуерт","Шкаф","Стул",
            "Кровать","Стол","Плита","Холодильник","Тумба"};

    public static String[] getWords() {
        return words;
    }

    //В Set сохраняем уникальные слова
    Set<String> uniqNames = new HashSet<>();
    //в Map в качестве ключа сохраняем слово, а значением будет число повторений этого слова в массиве
    Map<String, Integer> mapNames = new HashMap<>();

    //Метод выводит уникальные слова(только), и слова массива с частотой повторений
    protected void showNames (String [] names) {

        for (int i = 0; i < names.length; i++) {
            int counter = 0;
            for (int j = 0; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    counter++;
                }
            }
            if (counter == 1) {
                uniqNames.add(names[i]);
                mapNames.put(names[i], counter);
            } else {
                mapNames.put(names[i], counter);
            }
        }
        System.out.println("Уникальные имена в списке - " + uniqNames);

        System.out.println("Информация сколько встречается каждая фамилия в списке: ");
        for (Map.Entry<String, Integer> tmp : mapNames.entrySet()) {
            System.out.println(tmp.getKey() + " - " + tmp.getValue());
        }
    }
}
