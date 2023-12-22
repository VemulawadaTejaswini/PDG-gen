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
            final List<List<Integer>> numListList = args.stream().skip(1)
                    .map(line -> Arrays.stream(line.split(" ")).map(Integer::valueOf).collect(toList()))
                    .collect(toList());

            final List<List<Integer>> tree = new ArrayList<>();
            IntStream.range(0, numListList.size() + 1).forEach(x -> tree.add(new ArrayList<>()));
            numListList.forEach(numList -> {
                tree.get(numList.get(0) - 1).add(numList.get(1) - 1);
                tree.get(numList.get(1) - 1).add(numList.get(0) - 1);
            });

            Integer black = 0;
            {
                List<Boolean> visited = IntStream.range(0, numListList.size() + 1).mapToObj(x -> false).collect(toList());
                List<AbstractMap.SimpleEntry<Integer, Integer>> que = new ArrayList<>();
                que.add(new AbstractMap.SimpleEntry<>(0, 0));
                while (!que.isEmpty()) {
                    final AbstractMap.SimpleEntry<Integer, Integer> curr = que.remove(0);
                    final Integer index = curr.getKey();
                    final Integer depth = curr.getValue();
                    if (index == numListList.size() - 1) {
                        continue;
                    }
                    visited.set(index, true);
                    List<AbstractMap.SimpleEntry<Integer, Integer>> children = new ArrayList<>();
                    tree.get(index).stream()
                            .filter(x -> !visited.get(x))
                            .forEach(nextIndex -> children.add(new AbstractMap.SimpleEntry(nextIndex, depth + 1)));
                    que.addAll(children);
                    if (children.isEmpty()) {
                        black += depth;
                    }
                }
            }

            Integer white = 0;
            {
                List<Boolean> visited = IntStream.range(0, numListList.size() + 1).mapToObj(x -> false).collect(toList());
                List<AbstractMap.SimpleEntry<Integer, Integer>> que = new ArrayList<>();
                que.add(new AbstractMap.SimpleEntry<>(numListList.size(), 0));
                while (!que.isEmpty()) {
                    final AbstractMap.SimpleEntry<Integer, Integer> curr = que.remove(0);
                    final Integer index = curr.getKey();
                    final Integer depth = curr.getValue();
                    if (index == 0) {
                        continue;
                    }
                    visited.set(index, true);
                    List<AbstractMap.SimpleEntry<Integer, Integer>> children = new ArrayList<>();
                    tree.get(index).stream()
                            .filter(x -> !visited.get(x))
                            .forEach(nextIndex -> children.add(new AbstractMap.SimpleEntry(nextIndex, depth + 1)));
                    que.addAll(children);
                    if (children.isEmpty()) {
                        white += depth;
                    }
                }
            }

            Integer med = numListList.size() - white - black;

            if (med % 2 == 0) {
                System.out.println(black > white? "Fennec" : "Snuke");
            } else {
                System.out.println(black >= white? "Fennec" : "Snuke");
            }
        };
    }

}
