public class Main {
    private static final String text = "Some strange sentence in a foreign language";

    // Комментариями отмечены черты функционального стиля
    public static void main(String[] args) {
        // Детерминированность функций
        BrokenString brokenString = s -> s.split(" ");

        // Нет использования состояния
        Dictionary dictionary = Dictionary.fillDictionary(text, brokenString, ServiceSort::sortList);

        // Выведем чего получилось
        dictionary.getSource().forEach(System.out::println);
    }
}
