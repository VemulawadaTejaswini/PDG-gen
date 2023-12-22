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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        static final int MODULO = 998244353;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            int max = 2;
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
                max = Math.max(max, a[i] + 1);
            }
            int[] sum = new int[max];
            for (int x : a) {
                sum[x] += x;
            }
            boolean[] prime = new boolean[max];
            Arrays.fill(prime, true);
            prime[0] = prime[1] = false;
            for (int i = 2; i * i < max; ++i)
                if (prime[i]) {
                    for (int j = i * i; j < max; j += i) prime[j] = false;
                }
            int[] ps = new int[max];
            int nps = 0;
            for (int i = 2; i < max; ++i) if (prime[i]) ps[nps++] = i;
            ps = Arrays.copyOf(ps, nps);
            for (int p : ps) {
                for (int i = (max - 1) / p; i >= 1; --i) {
                    sum[i] += sum[i * p];
                    if (sum[i] >= MODULO) sum[i] -= MODULO;
                }
            }
            for (int i = 0; i < max; ++i) sum[i] = (int) (sum[i] * (long) sum[i] % MODULO);
            for (int p : ps) {
                int upto = (max - 1) / p;
                for (int i = 1; i <= upto; ++i) {
                    sum[i] -= sum[i * p];
                    if (sum[i] < 0) sum[i] += MODULO;
                }
            }
            int[] invs = new int[max];
            invs[1] = 1;
            for (int i = 2; i < invs.length; ++i) {
                invs[i] = (int) ((MODULO - invs[((int) (MODULO % i))] * (long) (MODULO / i) % MODULO) % MODULO);
                if (invs[i] * (long) i % MODULO != 1) throw new RuntimeException();
            }
            long res = 0;
            for (int i = 1; i < max; ++i) {
                res += sum[i] * (long) invs[i] % MODULO;
            }
            for (int x : a) {
                res -= x;
            }
            res %= MODULO;
            res += MODULO;
            res %= MODULO;
            res *= invs[2];
            res %= MODULO;
            out.println(res);
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

