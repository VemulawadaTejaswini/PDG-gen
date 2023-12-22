import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<Entry> list = IntStream.range(0, n)
                .map(i -> scanner.nextInt())
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.reducing(0, e -> 1, Integer::sum)))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .sorted(Comparator.<Map.Entry<Integer, Integer>>comparingInt(Map.Entry::getKey).reversed())
                .limit(2)
                .map(Entry::new)
                .collect(Collectors.toList());

        System.out.println(list.size() == 0 || (list.size() == 1 && !list.get(0).v()) ? 0 : list.get(0).k * list.get(list.get(0).v() ? 0 : 1).k);
    }

    static class Entry {
        int k, v;

        Entry(Map.Entry<Integer, Integer> entry) {
            this.k = entry.getKey();
            this.v = entry.getValue();
        }

        boolean v() {
            return v >= 4;
        }
    }
}