import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        ExchangeArgumentsTechnique solver = new ExchangeArgumentsTechnique();
        solver.solve(1, in, out);
        out.close();
    }

    static class ExchangeArgumentsTechnique {
        int n;
        Pair[] participants;
        Long[] dp;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            participants = new Pair[n];
            dp = new Long[n + 1];
            Arrays.fill(dp, Long.MAX_VALUE);
            for (int i = 0; i < n; i++) {
                participants[i] = new Pair(in.nextInt(), in.nextInt());
            }

            Arrays.sort(participants);
            dp[0] = 0L;
            for (Pair pair : participants) {
                int h = pair.height;
                int p = pair.power;
                for (int j = n - 1; j >= 0; j--) {
                    if (h >= dp[j]) {
                        dp[j + 1] = Math.min(dp[j + 1], p + dp[j]);
                    }
                }
            }

            for (int i = n; i > -1; i--) {
                if (dp[i] != Long.MAX_VALUE) {
                    out.println(i);
                    break;
                }
            }
        }

        class Pair implements Comparable<Pair> {
            int height;
            int power;

            public Pair(int height, int power) {
                this.height = height;
                this.power = power;
            }

            public int compareTo(Pair o) {
                long a = 1L * this.height + this.power;
                long b = 1L * o.height + o.power;
                return Long.compare(a, b);
            }

            public String toString() {
                return height + " " + power;
            }

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

