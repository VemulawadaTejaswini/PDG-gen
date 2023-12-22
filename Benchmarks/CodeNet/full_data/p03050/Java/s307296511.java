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
            long N = Long.valueOf(args.get(0));
            long m = N - 1;
            long ans = 0;
            while (m > 0) {
                long q = N / m;
                long r = N % m;
                if (q == r) {
                    ans += m;
                }
                if (r >= q) {
                    m = N / (q + 1);
                } else {
                    m--;
                }
            }
            System.out.println(ans);
        };
    }

}
