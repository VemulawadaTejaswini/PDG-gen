import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EFlatten solver = new EFlatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFlatten {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            EFlatten.Sieve sieve = new EFlatten.Sieve(1000000);
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                List<EFlatten.Pair> f = sieve.factors(arr[i]);
                for (EFlatten.Pair p : f) {
                    Integer pow = map.putIfAbsent(p.first, p.second);
                    if (pow != null) {
                        map.put(p.first, Math.max(p.second, map.get(p.first)));
                    }
                }
            }

            EFlatten.ModInt lcm = new EFlatten.ModInt(1);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                for (int i = 0; i < entry.getValue(); i++) {
                    lcm.multiply(new EFlatten.ModInt(entry.getKey()));
                }
            }

            EFlatten.ModInt ans = new EFlatten.ModInt(0);
            for (int i = 0; i < arr.length; i++) {
                EFlatten.ModInt res = EFlatten.ModInt.divide(lcm, new EFlatten.ModInt(arr[i]));
                ans.add(res);
            }

            out.println(ans.x);
        }

        public static class Sieve {
            private ArrayList<Integer> primes;
            private int[] f;
            private int n;

            public Sieve(int n) {
                this.n = n;
                primes = new ArrayList<>();
                f = new int[n + 1];
                f[0] = f[1] = -1;
                for (int i = 2; i <= n; i++) {
                    if (f[i] > 0) continue;
                    primes.add(i);
                    f[i] = i;
                    for (long j = (long) i * i; j <= n; j = j + i) {
                        if (f[(int) j] == 0) f[(int) j] = i;
                    }
                }
            }

            public List<Integer> factorList(int x) {
                List<Integer> res = new ArrayList<>();
                while (x != 1) {
                    res.add(f[x]);
                    x /= f[x];
                }
                return res;
            }

            public List<EFlatten.Pair> factors(int x) {
                List<Integer> fl = factorList(x);
                if (fl.size() == 0) return new ArrayList<>();
                List<EFlatten.Pair> res = new ArrayList<>();
                res.add(new EFlatten.Pair(fl.get(0), 0));
                for (int p : fl) {
                    if (res.get(res.size() - 1).first == p) {
                        res.get(res.size() - 1).second++;
                    } else {
                        res.add(new EFlatten.Pair(p, 1));
                    }
                }
                return res;
            }

        }

        private static class ModInt {
            private static final int mod = 1000000007;
            public long x;

            public ModInt(long x) {
                this.x = (x % mod + mod) % mod;
            }

            public static EFlatten.ModInt divide(EFlatten.ModInt a, EFlatten.ModInt b) {
                EFlatten.ModInt c = new EFlatten.ModInt(a.x);
                c.divide(b);
                return c;
            }

            public EFlatten.ModInt add(EFlatten.ModInt a) {
                if ((x += a.x) >= mod) x -= mod;
                return new EFlatten.ModInt(x);
            }

            public EFlatten.ModInt multiply(EFlatten.ModInt a) {
                x *= a.x;
                x %= mod;
                return new EFlatten.ModInt(x);
            }

            public EFlatten.ModInt inv() {
                return pow(mod - 2);
            }

            public EFlatten.ModInt divide(EFlatten.ModInt a) {
                return this.multiply(a.inv());
            }

            public EFlatten.ModInt pow(long p) {
                if (p == 0) return new EFlatten.ModInt(1);
                EFlatten.ModInt r = pow(p >> 1);
                r = r.multiply(r);
                if ((p & 1) == 1)
                    r = r.multiply(this);
                return r;
            }

        }

        private static class Pair {
            public int first;
            public int second;

            public Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EFlatten.Pair pair = (EFlatten.Pair) o;
                return first == pair.first &&
                        second == pair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

        }

    }
}

