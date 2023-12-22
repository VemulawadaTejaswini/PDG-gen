
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();

        final Map<Integer, Integer> counter = new HashMap<>();
        final Edge[] edges = new Edge[n - 1];
        for (int i = 0; i < n - 1; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            counter.compute(a, (k, v) -> v == null ? 1 : v + 1);
            counter.compute(b, (k, v) -> v == null ? 1 : v + 1);
            edges[i] = new Edge(a, b);
        }

        final List<Integer> list = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());

        final List<Map.Entry<Integer, Integer>> entries = counter.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .collect(Collectors.toList());

        final int[] values = new int[n + 1];
        for (int i = 0; i < n; i++) {
            final int value = list.get(i);
            final Map.Entry<Integer, Integer> entry = entries.get(i);

            values[entry.getKey()] = value;
        }

        final int sum = Arrays.stream(edges)
                .map(edge -> Math.min(values[edge.a], values[edge.b]))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        final String string = Arrays.stream(values, 1, values.length)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));
        System.out.println(string);
    }

    private static class Edge {
        final int a;
        final int b;

        Edge(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }

    private static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
