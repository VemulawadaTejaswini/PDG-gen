import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FactorsOfFactorial solver = new FactorsOfFactorial();
        solver.solve(1, in, out);
        out.close();
    }

    static class FactorsOfFactorial {
        final long mod = (long) 1e9 + 7L;

        public void solve(int testNumber, FastReader fs, PrintWriter pw) {
            int n = fs.nextInt();
            long[] factors = new long[n + 1];
            for (int i = 2; i <= n; i++) {
                factorize(i, factors);
            }

            long ans = 1L;
            for (int i = 2; i < factors.length; i++) {
                if (factors[i] != 0) {
                    ans = ans * (factors[i] + 1) % mod;
                }
            }

            pw.println(ans);
        }

        private void factorize(int n, long[] factors) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        factors[i]++;
                        n /= i;
                    }
                }
            }
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = null;
        }

        public FastReader(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }

        public FastReader(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

