
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final long[] bars = new long[1001];

        for (int i = 0; i < n; i++) {
            bars[scanner.nextInt()]++;
        }

        final Set<Set<Integer>> checked = new HashSet<>();
        long answer = 0;
        for (int i = 1; i < 1001; i++) {
            if (bars[i] == 0) {
                continue;
            }

            for (int j = i + 1; j < 1001; j++) {
                for (int k = Math.abs(i - j) + 1; k < i + j && k < 1001; k++) {
                    if (bars[k] == 0 || k == i || k == j) {
                        continue;
                    }

                    final Set<Integer> tmp = new HashSet<>();
                    tmp.add(i);
                    tmp.add(k);
                    tmp.add(j);
                    if (checked.contains(tmp)) {
                        continue;
                    }

                    checked.add(tmp);
                    answer += bars[i] * bars[j] * bars[k];
                }
            }
        }
        System.out.println(answer);
    }

    static class FastScanner {
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