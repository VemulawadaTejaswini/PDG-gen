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
            final List<Long> numList = Arrays.stream(args.get(1).split(" ")).map(Long::valueOf).collect(toList());
            Long max = 0L;
            Long ans = 0L;
            for (int i = 0; i < numList.size(); i++) {
                if (numList.get(i) >= max) {
                    max = numList.get(i);
                    ans++;
                }
            }
            System.out.println(ans);
        };
    }

}
