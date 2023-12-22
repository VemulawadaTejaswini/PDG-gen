import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRGBTriplets solver = new DRGBTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRGBTriplets {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();

            long total = 0;

            int[][] prefix = new int[3][n];
            Map<Character, Integer> map = Map.of(
                    'R', 0,
                    'G', 1,
                    'B', 2
            );
            // R - 0, G - 1, B - 2

            for (int i = 0; i < n; i++) {
                Integer c = map.get(s.charAt(i));
                if (i > 0) {
                    for (int d = 0; d < 3; d++) {
                        prefix[d][i] = prefix[d][i - 1];
                    }
                }

                prefix[c][i] += 1;
            }

            boolean[] taken = new boolean[3];

            for (int i = 0; i < n; i++) {
                int c0 = map.get(s.charAt(i));
                taken[c0] = true;
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        continue;
                    }
                    int c1 = map.get(s.charAt(j));
                    taken[c1] = true;

                    int c2; // 2nd color

                    for (c2 = 0; c2 < 3; c2++) {
                        if (!taken[c2]) {
                            break;
                        }
                    }

                    int lo = j;
                    int mid = Math.min(j + (j - i), n);
                    int hi = n - 1;

                    total += prefix[c2][mid - 1] - prefix[c2][lo];     // lo..mid - 1

                    if (hi > mid) {
                        total += prefix[c2][hi] - prefix[c2][mid];        // mid + 1..hi
                    }
                    taken[c1] = false;
                }
                taken[c0] = false;
            }
            out.println(total);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

