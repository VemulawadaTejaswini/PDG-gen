import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        scanner.nextLine();
        final Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            final String str = scanner.nextLine();
            if (!map.containsKey(str)) {
                map.put(str, 0);
            }

            map.put(str, map.get(str) + 1);
        }

        final List<Map.Entry<String, Integer>> sorted = map.entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .collect(Collectors.toList());

        final List<String> strings = sorted.stream()
                .filter(it -> it.getValue() == sorted.get(0).getValue())
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for (String s: strings) {
            System.out.println(s);
        }
    }
}