import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Writer;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        CLCMs solver = new CLCMs();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLCMs {
        private static final int MAX = 888251;
        private static final int MOD = 998244353;
        private static final ModMath MM = new ModMath(MOD);
        private static final PrimeTable table = new PrimeTable(MAX);
        private static final long[] coeff = new long[MAX];

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Arrays.fill(coeff, -1);
            coeff[1] = 1;
            int n = in.ints();
            int[] a = in.ints(n);
            int[] sum = new int[MAX];
            long ans = 0;
            for (int num : a) {
                for (int d : table.getDivisors(num)) {
                    ans += sum[d] * coeff(d) % MOD * num % MOD;
                    ans %= MOD;
                    sum[d] += num;
                    sum[d] %= MOD;
                }
            }
            out.ans(ans).ln();
        }

        private static long coeff(int divisor) {
            if (coeff[divisor] != -1) return coeff[divisor];
            long coefficient = 0;
            for (int d : table.getDivisors(divisor)) {
                if (d == divisor) continue;
                coefficient += coeff(d);
                coefficient %= MOD;
            }
            coefficient = (MM.inv(divisor) - coefficient + MOD) % MOD;
            return coeff[divisor] = coefficient;
        }

    }

    static class PrimeTable {
        private final int[] divisor;
        private final List<Integer> primes = new ArrayList<>();

        public PrimeTable(int n) {
            this.divisor = new int[n];
            for (int i = 2; i < n; i++) {
                if (divisor[i] != 0) continue;
                divisor[i] = i;
                primes.add(i);
                for (int j = i + i; j < n; j += i) {
                    if (divisor[j] == 0) divisor[j] = i;
                }
            }
        }

        public Map<Integer, Integer> primeFactorize(int x) {
            Map<Integer, Integer> res = new HashMap<>();
            while (divisor[x] != 0) {
                res.merge(divisor[x], 1, Integer::sum);
                x /= divisor[x];
            }
            return res;
        }

        public List<Integer> getDivisors(int x) {
            Set<Map.Entry<Integer, Integer>> factors = primeFactorize(x).entrySet();
            int count = 1;
            for (Map.Entry<Integer, Integer> ent : factors) count *= ent.getValue() + 1;
            List<Integer> divisors = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                int t = i;
                int v = 1;
                for (Map.Entry<Integer, Integer> ent : factors) {
                    int exp = t % (ent.getValue() + 1);
                    for (int j = 0; j < exp; j++) v *= ent.getKey();
                    t /= ent.getValue() + 1;
                }
                divisors.add(v);
            }
            return divisors;
        }

    }

    static interface Verified {
    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod, boolean unsafe) {
        /*if (!unsafe && !IntMath.isPrime(mod)) {
            throw new RuntimeException("This class is designed for primes!");
        }*/
            this.mod = mod;
        }

        public ModMath(long mod) {
            this(mod, false);
        }

        public ModMath() {
            this(DEFAULT_MOD, true);
        }

        public long inv(long x) {
            return pow(x, mod - 2);
            //return mod(LongEuclidSolver.solve(x, mod).x);
        }

        public long pow(long x, long y) {
            y %= (mod - 1);
            if (y < 0) {
                return pow(inv(x), -y);
            } else if (y == 0) {
                return 1;
            } else if (y % 2 == 0) {
                long z = pow(x, y / 2);
                return (z * z) % mod;
            } else {
                return (x % mod) * pow(x, y - 1) % mod;
            }
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

