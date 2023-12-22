
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final Map<Integer, Integer> indexMap = new HashMap<>();
        final Map<Integer, List<Integer>> prefectureCityMap = new HashMap<>();

        for (int i = 0; i < m; i++) {
            final int prefecture = scanner.nextInt();
            final int city = scanner.nextInt();
            indexMap.put(city, i);
            prefectureCityMap.computeIfAbsent(prefecture, list -> new ArrayList<>())
                    .add(city);
        }

        final String[] answer = new String[m];

        for (final Map.Entry<Integer, List<Integer>> entry : prefectureCityMap.entrySet()) {
            Collections.sort(entry.getValue());
            for (int i = 0; i < entry.getValue().size(); i++) {
                final String id = String.format("%06d", entry.getKey()) + String.format("%06d", i + 1);
                answer[indexMap.get(entry.getValue().get(i))] = id;
            }
        }

        for (final String s : answer) {
            System.out.println(s);
        }
    }
}
