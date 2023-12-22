import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Random;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            int d = in.nextInt();
            boolean stress = false;
            if (stress) {
                Random random = new Random(0);
                for (int step = 0; step < 1000; step++) {
                    height = random.nextInt(50) + 1;
                    width = random.nextInt(50) + 1;
                    d = 1 + random.nextInt(height + width - 2);
                    if (!check(solve(height, width, d), d)) {
                        throw new AssertionError(height + " " + width + " " + d);
                    }
                }
            }
            int[][] a = solve(height, width, d);
            char[] s = new char[width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    s[j] = "RYGB".charAt(a[i][j]);
//                s[j] = "ABCD".charAt(a[i][j]);
                }
                out.println(new String(s));
            }
//        if (!check(a, d)) {
//            throw new AssertionError();
//        }
        }

        private int[][] solve(int height, int width, int d) {
            int[][] a = new int[height][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int u = (((i + j) % (2 * d) + (2 * d)) % (2 * d)) / d;
                    int v = (((i - j) % (2 * d) + (2 * d)) % (2 * d)) / d;
                    a[i][j] = 2 * u + v;
                }
            }
            return a;
        }

        private boolean check(int[][] a, int d) {
            int height = a.length;
            int width = a[0].length;
            for (int r1 = 0; r1 < height; r1++) {
                for (int r2 = 0; r2 < height; r2++) {
                    for (int c1 = 0; c1 < width; c1++) {
                        for (int c2 = 0; c2 < width; c2++) {
                            int dist = Math.abs(r1 - r2) + Math.abs(c1 - c2);
                            if (dist == d && a[r1][c1] == a[r2][c2]) {
                                System.out.println(r1 + " " + c1 + " " + r2 + " " + c2);
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
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
                    st = new StringTokenizer(in.readLine());
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

