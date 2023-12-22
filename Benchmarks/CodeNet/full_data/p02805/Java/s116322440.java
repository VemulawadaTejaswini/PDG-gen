import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        int N;
        int[] x;
        int[] y;

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            N = in.nextInt();
            x = new int[N];
            y = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            double lx = 0, hx = 1000;
            for (int i = 0; i < 1000; i++) {
                double llx = (lx * 2 + hx) / 3;
                double hhx = (lx + hx * 2) / 3;
                double temp1 = calc(x, llx);
                double temp2 = calc(x, hhx);
                if (temp1 < temp2) {
                    hx = hhx;
                } else {
                    lx = llx;
                }
            }

            double ly = 0, hy = 1000;
            for (int i = 0; i < 1000; i++) {
                double lly = (ly * 2 + hy) / 3;
                double hhy = (ly + hy * 2) / 3;
                double temp1 = calc(y, lly);
                double temp2 = calc(y, hhy);
                if (temp1 < temp2) {
                    hy = hhy;
                } else {
                    ly = lly;
                }
            }

            double px = hx;
            double py = hy;
            double d = 0;
            for (int i = 0; i < N; i++) {
                double t = Math.sqrt(Math.pow(px - x[i], 2) + Math.pow(py - y[i], 2));
                d = Math.max(d, t);
            }
            out.printf("%.18f\n", d);
        }

        private double calc(int[] xs, double x) {
            double max = 0;
            for (int i = 0; i < N; i++) {
                double t = Math.abs(xs[i] - x);
                max = Math.max(max, t);
            }
            return max;
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
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

