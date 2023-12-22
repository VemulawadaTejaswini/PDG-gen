import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

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
            final List<Integer> line = Arrays.stream(args.get(0).split(" ")).map(Integer::valueOf).collect(toList());
            final Integer N = line.get(0);
            final Integer K = line.get(1);
            if (K == 0) {
                System.out.println(N * N);
                return;
            }
            Long ans = 0L;
            for (int i = K + 1; i <= N; i++) {
                ans += (N / i) * (i - K);
                if (N % i != 0) {
                    ans += Math.max(0, (N % i) - (K - 1));
                }
            }
            System.out.println(ans);
        };
    }

}
