import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.SplittableRandom;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B_123Triangle solver = new B_123Triangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_123Triangle {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            int[] a = new int[n - 1];
            for (int i = 0; i < a.length; i++) {
                a[i] = Math.abs(s[i] - s[i + 1]);
            }
            --n;

            out.println(solve012(a));

            SplittableRandom random = new SplittableRandom(0);
            for (int test = 0; test < 10000; test++) {
                n = random.nextInt(1, 100);
                a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = random.nextInt(3);
                }
                int u = solve012(a.clone());
                int v = simulate(a.clone());
                if (u != v) {
                    System.out.println(u + " " + v + " " + Arrays.toString(a));
                    throw new AssertionError();
                }
            }
        }

        private int solve012(int[] a) {
            int[] am = new int[3];
            for (int x : a) {
                ++am[x];
            }

            if (am[1] == 0) {
                for (int i = 0; i < a.length; i++) {
                    a[i] /= 2;
                }
                return 2 * solve01(a);
            }
            for (int i = 0; i < a.length; i++) {
                a[i] %= 2;
            }
            return solve01(a);
        }

        private int solve01(int[] a) {
            int n = a.length - 1;
            int p = 0;
            int r = 0;
            for (int i = 0; i <= n; i++) {
                if (a[i] == 1 && p == 0) {
                    r ^= 1;
                }

                if (i == n) {
                    break;
                }
                int x = n - i;
                while (x % 2 == 0) {
                    x /= 2;
                    ++p;
                }
                x = i + 1;
                while (x % 2 == 0) {
                    x /= 2;
                    --p;
                }
            }
            return r;
        }

        private int simulate(int[] a) {
            int n = a.length;
//        System.out.println(Arrays.toString(a));
            while (n > 1) {
                int[] na = new int[n - 1];
                for (int i = 0; i + 1 < n; i++) {
                    na[i] = Math.abs(a[i] - a[i + 1]);
                }
                --n;
                a = na;
//            System.out.println(Arrays.toString(a));
            }
            return a[0];
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

