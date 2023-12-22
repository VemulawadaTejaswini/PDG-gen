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

            int[] count = new int[3];
            Map<Character, Integer> colorToIndex = Map.of(
                    'R', 0,
                    'G', 1,
                    'B', 2
            );

            for (int i = 0; i < n; i++) {
                int c = colorToIndex.get(s.charAt(i));
                count[c] += 1;
            }

            long total = count[0] * count[1] * count[2];

            for (int i = 0; i < n; i++) {
                for (int steps = 0; steps < n; steps++) {
                    if (i - steps < 0 || i + steps > n - 1) {
                        continue;
                    }

                    int c0 = s.charAt(i - steps);
                    int c1 = s.charAt(i);
                    int c2 = s.charAt(i + steps);

                    if (c0 != c1 && c1 != c2 && c2 != c0) {
                        total -= 1;
                    }
                }
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

