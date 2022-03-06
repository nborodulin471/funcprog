import java.util.List;
import java.util.stream.Collectors;

public abstract class ServiceSort {
    // Монады
    public static List<String> sortList(List<String> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
