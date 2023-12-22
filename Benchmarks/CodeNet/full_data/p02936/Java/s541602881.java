
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int q = scanner.nextInt();

        final Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            final int a = scanner.nextInt() - 1;
            final int b = scanner.nextInt() - 1;

            map.computeIfAbsent(a, e -> new ArrayList<>())
                    .add(b);

            map.computeIfAbsent(b, e -> new ArrayList<>())
                    .add(a);
        }

        final long[] answers = new long[n];

        for (int i = 0; i < q; i++) {
            final int node = scanner.nextInt() - 1;
            final int operation = scanner.nextInt();

            answers[node] += operation;
        }

        List<Node> dfs = new ArrayList<>();
        dfs.add(new Node(0, -1));
        recursive(map, dfs, 0, -1);

        for (int i = 1; i < n; i++) {
            answers[dfs.get(i).getValue()] += answers[dfs.get(i).getParent()];
        }

        for (final long answer : answers) {
            System.out.print(answer + " ");
        }
    }

    private static void recursive(final Map<Integer, List<Integer>> map, final List<Node> list, final int parent, final int grandParent) {
        final List<Integer> children = map.get(parent);
        if (children == null) {
            return;
        }

        for (final Integer child : children) {
            if (child == grandParent) {
                continue;
            }

            list.add(new Node(child, parent));
            recursive(map, list, child, parent);
        }
    }

    static class Node {
        private final int value;
        private final int parent;

        Node(final int value, final int parent) {
            this.value = value;
            this.parent = parent;
        }

        int getValue() {
            return value;
        }

        int getParent() {
            return parent;
        }
    }
}
