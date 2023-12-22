import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ACandyDistributionAgain solver = new ACandyDistributionAgain();
        solver.solve(1, in, out);
        out.close();
    }

    static class ACandyDistributionAgain {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt(), x = in.nextInt();
            int[] a = in.nextIntArray(n);
            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                if (a[i] > x) {
                    out.println(i);
                    return;
                } else {
                    x -= a[i];
                }
            }
            if (x == 0) {
                out.println(n);
            } else {
                out.println(n - 1);
            }
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int[] nextIntArray(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

    }
}

