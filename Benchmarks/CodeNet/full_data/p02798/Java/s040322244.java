import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSwapAndFlip solver = new DSwapAndFlip();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSwapAndFlip {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.readIntArray(n);
            int[] b = in.readIntArray(n);

            int answer = Integer.MAX_VALUE;
            for (int flips = 0; flips < (1 << n); flips++) {
                int[] x = new int[n];
                int[] flip = new int[n];
                for (int i = 0; i < n; i++) {
                    flip[i] = ((flips >> i) & 1);
                    x[i] = flip[i] == 0 ? a[i] : b[i];
                }
                int f = f(x, flip);
                // System.out.format("%18s %d%n", Integer.toBinaryString(flips), f);
                answer = Math.min(answer, f);
            }

            if (answer == Integer.MAX_VALUE)
                answer = -1;

            out.println(answer);
        }

        private static int f(int[] x, int[] flip) {
            final int n = x.length;
            int[] inv = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (x[i] > x[j]) {
                        inv[i]++;
                        inv[j]++;
                    }
                }
            }

            int answer = 0;

            for (int i = 0; i < n; i++) {
                answer += inv[i];

                if (inv[i] % 2 != flip[i]) {
                    inv[i] = 1;
                } else {
                    inv[i] = 0;
                }
            }

            List<Integer>[] sep = new List[51];
            for (int i = 0; i < n; i++) {
                if (sep[x[i]] == null)
                    sep[x[i]] = new ArrayList<>();
                sep[x[i]].add(inv[i]);
            }
            for (List<Integer> s : sep) {
                if (s == null)
                    continue;

                for (int i = 0; i < s.size(); i++) {
                    if (s.get(i) > 0) {
                        if (i + 1 < s.size() && s.get(i + 1) > 0) {
                            answer += 2;
                            s.set(i + 1, 0);
                        } else if (i + 2 < s.size() && s.get(i + 1) == 0 && s.get(i + 2) == 0) {
                            answer += 4;
                            s.set(i + 2, 1);
                        } else {
                            return Integer.MAX_VALUE;
                        }
                    }
                }
            }

            Util.ASSERT(answer % 2 == 0);
            answer /= 2;

            return answer;
        }

    }

    static class Util {
        public static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
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

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }
}

