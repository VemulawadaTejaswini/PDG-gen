import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Collection;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D756 solver = new D756();
        solver.solve(1, in, out);
        out.close();
    }

    static class D756 {
        private Integer[] cnt;

        public static Map<Integer, Integer> factorize(int n) {
            Map<Integer, Integer> factors = new TreeMap<>();
            for (int d = 2; n > 1; ) {
                int power = 0;
                while (n % d == 0) {
                    ++power;
                    n /= d;
                }
                if (power > 0) {
                    factors.put(d, power);
                }
                ++d;
                if (d * d > n) {
                    d = n;
                }
            }
            return factors;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), ans = 0;
            Map<Integer, Integer> fac = new TreeMap<>();
            for (int i = 2; i <= n; ++i) {
                Map<Integer, Integer> cur = factorize(i);
                cur.forEach((k, v) -> fac.merge(k, v, (v1, v2) -> fac.get(k) + cur.get(k)));
            }
//        facarray = (Integer[]) fac.keySet().toArray();
            cnt = fac.values().toArray(new Integer[0]);
            out.println(calc(0, 1));
        }

        private int calc(int pos, int nfac) {
            if (nfac > 75) return 0;
            if (pos == cnt.length) return nfac == 75 ? 1 : 0;
            int ans = 0;
            for (int i = 0; i <= cnt[pos]; ++i) {
                ans += calc(pos + 1, nfac * (i + 1));
            }
            return ans;
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

