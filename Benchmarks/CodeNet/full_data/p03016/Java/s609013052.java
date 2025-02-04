import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        FTakahashisBasicsInEducationAndLearning solver = new FTakahashisBasicsInEducationAndLearning();
        solver.solve(1, in, out);
        out.close();
    }

    static class FTakahashisBasicsInEducationAndLearning {
        private static ModMath mod;

        private static int keta(long v) {
            int c = 0;
            while (v > 0) {
                c++;
                v /= 10;
            }
            return c;
        }

        private static long pow(int k) {
            long a = 1;
            while (k > 0) {
                a *= 10;
                k--;
            }
            return a;
        }

        private static long lb(long a, long b, long v) {
            return (v - a + b - 1) / b;
        }

        private static long calc(long a, long b, long q, long v, long m) {
            long vq = mod.pow(v, q);
            q %= m;
            long ansA = mod.prod(a, vq - 1, mod.inv(v - 1));
            ansA %= m;
            long ansB = vq;
            ansB -= (q * v) % m;
            ansB %= m;
            ansB += q - 1;
            ansB %= m;
            ansB *= mod.inv((v - 1) * (v - 1) % m);
            ansB %= m;
            ansB *= b;
            ansB %= m;
            return (ansA + ansB + m) % m;
        }

        public long solve(long l, long a, long b, long m) {
            mod = new ModMath(m);
            long from = 0;
            long ans = 0;
            for (int i = keta(a); i <= 18; i++) {
                long v = pow(i);
                long to = lb(a, b, v);
                if (to <= from) continue;
                to = Math.min(to, l);

                ans *= mod.pow(v, to - from);
                ans %= m;

                ans += calc((a + from * b) % m, b % m, to - from, v % m, m);
                ans %= m;

                from = to;
                if (from >= l) break;
            }
            return ans;
        }

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            long l = in.longs(), a = in.longs(), b = in.longs(), m = in.longs();
            LongChineseRemainder lcr = new LongChineseRemainder();
            for (long mi : IntMath.primeFactorize(m).keySet()) {
                lcr.grow(solve(l, a, b, mi), mi);
            }
            out.ans(lcr.getRemainder()).ln();
        }

    }

    static interface Verified {
    }

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod) {
            this.mod = mod;
        }

        public ModMath() {
            this(DEFAULT_MOD);
        }

        public long mod(long x) {
            x %= mod;
            return x < 0 ? x + mod : x;
        }

        public long inv(long x) {
            //return pow(x, mod - 2);
            return mod(LongEuclidSolver.solve(x, mod).x);
        }

        public long prod(long... x) {
            long ans = x[0];
            for (int i = 1; i < x.length; i++) {
                ans *= x[i];
                ans %= mod;
            }
            return ans;
        }

        public long pow(long x, long y) {
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

    static class LongChineseRemainder {
        private long remainder = 0;
        private long modulo = 1;

        public void grow(long b2, long m2) {
            Vec3l sol = LongEuclidSolver.solve(modulo, m2);
            long p = sol.x, d = sol.z;
            if ((b2 - remainder) % d != 0) {
                throw new IllegalStateException("Given x % " + m2 + " = " + b2 + " and x % " + modulo + " = " + remainder + ", gcd was " + sol.z);
            }
            m2 /= d;
            long m = modulo * m2;
            long tmp = (b2 - remainder) / d * p % m2;
            remainder += modulo * tmp;
            remainder %= m;
            if (remainder < 0) {
                remainder += m;
                remainder %= m;
            }
            modulo = m;
        }

        public long getRemainder() {
            return remainder;
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

    static class Vec3l implements Comparable<Vec3l> {
        public long x;
        public long y;
        public long z;

        public Vec3l(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3l o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Long.compare(z, o.z);
                }
                return Long.compare(y, o.z);
            }
            return Long.compare(x, o.x);
        }

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

        public long longs() {
            return Long.parseLong(string());
        }

    }

    static class Vec3i implements Comparable<Vec3i> {
        public int x;
        public int y;
        public int z;

        public Vec3i(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3i o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Integer.compare(z, o.z);
                }
                return Integer.compare(y, o.z);
            }
            return Integer.compare(x, o.x);
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static Map<Long, Integer> primeFactorize(long p) {
            Map<Long, Integer> factor = new HashMap<>();
            if ((p & 1) == 0) {
                int c = 0;
                do {
                    c++;
                    p >>= 1;
                } while ((p & 1) == 0);
                factor.put(2L, c);
            }
            for (long i = 3; i * i <= p; i += 2) {
                if (p % i == 0) {
                    int c = 0;
                    do {
                        c++;
                        p /= i;
                    } while ((p % i) == 0);
                    factor.put(i, c);
                }
            }
            if (p > 1) {
                factor.put(p, 1);
            }
            return factor;
        }

    }

    static class LongEuclidSolver {
        private LongEuclidSolver() {
        }

        public static Vec3l solve(long a, long b) {
            LongEuclidSolver.ReferenceLong p = new LongEuclidSolver.ReferenceLong(), q = new LongEuclidSolver.ReferenceLong();
            long d = solve(a, b, p, q);
            return new Vec3l(p.val, q.val, d);
        }

        private static long solve(long a, long b, LongEuclidSolver.ReferenceLong p, LongEuclidSolver.ReferenceLong q) {
            if (b == 0) {
                p.val = 1;
                q.val = 0;
                return a;
            } else {
                long d = solve(b, a % b, q, p);
                q.val -= (a / b) * p.val;
                return d;
            }
        }

        private static class ReferenceLong {
            private long val;

        }

    }
}

