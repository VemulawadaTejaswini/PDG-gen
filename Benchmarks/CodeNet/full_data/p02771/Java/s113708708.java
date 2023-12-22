import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(scanner.nextLine());
        }
        Map<String, Long> grouped = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Map<Long, List<String>> map = grouped.keySet().stream().collect(Collectors.groupingBy(grouped::get));
        long max = map.keySet().stream().mapToLong(m -> m).max().getAsLong();
        map.get(max).forEach(System.out::println);
    }
}