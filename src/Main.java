
public class Main {



    public static void main(String[] args) {
        ArrayWords arraysWorrds = new ArrayWords();
        arraysWorrds.showNames(ArrayWords.getWords());

        PhoneBook phoneSearching = new PhoneBook();

//        phoneSearching.add("Иванов", 890573464);
//        phoneSearching.add("Петров", 843213218);
//        phoneSearching.add("Сидоров", 890431241);
//        phoneSearching.add("Иванов", 890341246);
//        phoneSearching.add("Петров", 890154123);
//        phoneSearching.add("Дмитриев", 892045104);

        phoneSearching.get("Иванов");
        phoneSearching.getUsersAll();

    }
}
