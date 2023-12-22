
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static class Pair {
        int u;
        int v;

        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return u == pair.u &&
                    v == pair.v;
        }

        @Override
        public int hashCode() {
            return Objects.hash(u, v);
        }
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Set<Integer>> nodes = new HashMap<>();
        Map<Pair, Long> weights = new HashMap<>();

        for (int i = 0; i < n - 1; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            long w = scanner.nextLong();

                Set<Integer> uEnds = nodes.getOrDefault(u, new HashSet<>());
                uEnds.add(v);
                nodes.put(u, uEnds);
                Set<Integer> vEnds = nodes.getOrDefault(v, new HashSet<>());
                vEnds.add(u);
                nodes.put(v, vEnds);
                weights.put(new Pair(u, v), w);
                weights.put(new Pair(v, u), w);
        }

        int [] colors = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            colors[i] = -1;
        }
        PriorityQueue<Integer> uncolors = new PriorityQueue<>();
        uncolors.add(1);
        colors[1] = 0;
        while (!uncolors.isEmpty()) {
            int current = uncolors.poll();
            int currentColor = colors[current];
            for (Integer end : nodes.getOrDefault(current, new HashSet<>())) {
                if (colors[end] == -1) {
                    long weight = weights.get(new Pair(current, end));
                    if (weight % 2 == 0) {
                        colors[end] = currentColor;
                    } else {
                        colors[end] = 1 - currentColor;
                    }
                    uncolors.add(end);
                }
            }
        }
        for (int i = 1; i <= n; ++i) {
            System.out.println(colors[i]);
        }



    }

}
