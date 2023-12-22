import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

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
            final List<Integer> numList = Arrays.stream(args.get(0).split(" ")).map(Integer::valueOf).collect(toList());
            final Integer W = numList.get(1);
            final List<Integer> colorList = Arrays.stream(args.get(2).split(" ")).map(Integer::valueOf).collect(toList());
            final List<String> map = new ArrayList<>();

            StringBuilder line = new StringBuilder();
            Boolean odd = true;
            for (int index = 0; index < colorList.size(); index++) {
                for (int i = 0; i < colorList.get(index); i++) {
                    if (line.length() < W) {
                        line.append(Integer.valueOf(index + 1).toString());
                    } else {
                        map.add(odd ? line.toString() : line.reverse().toString());
                        line = new StringBuilder();
                        line.append(Integer.valueOf(index + 1).toString());
                        odd = !odd;
                    }
                }
            }
            map.add(odd ? line.toString() : line.reverse().toString());

            map.forEach(System.out::println);
        };
    }

}
