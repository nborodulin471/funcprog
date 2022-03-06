import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class Dictionary {
    private final List<String> source;

    private Dictionary(List<String> source) {
        this.source = source;
    }

    public List<String> getSource() {
        return source;
    }

    // Функции высших порядков
    public static Dictionary fillDictionary(String text, BrokenString brokenString,
                                            Function<List<String>, List<String>> functionSort) {
        return new Dictionary(functionSort.apply(
                new Function<String, List<String>>() {
                    @Override
                    public List<String> apply(String s) {
                        return Arrays.asList(brokenString.broken(s.toLowerCase(Locale.ROOT)));
                    }
                }.apply(text)));
    }
}
