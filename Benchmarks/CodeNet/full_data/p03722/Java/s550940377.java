
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final long m = scanner.nextLong();

        final Map<Integer, List<Dest>> graph = new HashMap<>();
        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            final int c = scanner.nextInt();

            graph.computeIfAbsent(a, v -> new ArrayList<>()).add(new Dest(a, b, c));
        }

        final Deque<Dest> queue = new ArrayDeque<>(graph.get(1));
        final long[] array = new long[n + 1];
        Arrays.fill(array, Long.MIN_VALUE);
        array[1] = 0;

        long count = 10_000_000;

        while (count-- > 0) {
            if (queue.isEmpty()) {
                System.out.println(array[n]);
                return;
            }

            final Dest dest = queue.pollFirst();
            if (array[dest.fromNode] + dest.weight > array[dest.toNode]) {
                array[dest.toNode] = array[dest.fromNode] + dest.weight;
                final List<Dest> next = graph.get(dest.toNode);
                if (next != null) {
                    queue.addAll(next);
                }
            }
        }

        System.out.println("inf");
    }

    static class Dest {
        int fromNode;
        int toNode;
        long weight;

        Dest(final int fromNode, final int toNode, final long weight) {
            this.fromNode = fromNode;
            this.toNode = toNode;
            this.weight = weight;
        }
    }
}
