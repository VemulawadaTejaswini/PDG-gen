import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.next());

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long max = map.entrySet().stream().map(Map.Entry::getValue).max(Comparator.naturalOrder()).get();

        List<String> results = map.entrySet().stream()
                .filter(m -> m.getValue() == max)
                .map(Map.Entry::getKey)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        results.forEach(System.out::println);
    }
}