import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Consumer<List<String>> consumer = solve();

    public static void main(String[] args) {
        consumer.accept(readInput());
    }

    private static List<String> readInput() {
        final List<String> lineList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lineList.add(scanner.nextLine());
        }
        return lineList;
    }

    private static Consumer<List<String>> solve() {
        return args -> {
            List<String> strList = args.stream().skip(1).collect(toList());
            long ab = strList.stream()
                    .mapToLong(s -> {
                        long ans = 0;
                        for (int i = 0; i < s.length() - 1; i++) {
                            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') {
                                ans++;
                            }
                        }
                        return ans;
                    }).sum();
            long endA = strList.stream().filter(s -> s.endsWith("A")).count();
            long startB = strList.stream().filter(s -> s.startsWith("B")).count();
            long endAAndStartB = strList.stream().filter(s -> s.startsWith("B") && s.endsWith("A")).count();
            long plus = (endA == endAAndStartB) ? endA - 1 : Math.min(endA, startB);
            System.out.println(ab + plus);
        };
    }

}
