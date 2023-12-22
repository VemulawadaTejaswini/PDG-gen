import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.stream.*;
// import static java.util.Arrays.compare;
import static java.util.Arrays.fill;
import static java.util.Arrays.sort;
import static java.util.Collections.sort;
import static java.util.Comparator.reverseOrder;
// import static java.util.List.of;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import java.math.BigInteger;
import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.ONE;
// import static java.math.BigInteger.TWO;
import static java.math.BigInteger.TEN;

import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.Math.min;
import static java.lang.Math.max;
import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;
import static java.lang.Math.asin;
import static java.lang.Math.acos;
import static java.lang.Math.atan;
import static java.lang.Math.atan2;
import static java.lang.Math.hypot;
import static java.lang.Math.sqrt;
import static java.lang.Math.log;
import static java.lang.Math.exp;
import static java.lang.String.format;
import static java.lang.System.exit;
import static java.lang.System.currentTimeMillis;

public class Main {
    public static long MOD = 1_000_000_007;

    public static void main(final String[] args) {
        final FastScanner fsc = new FastScanner();
        int n=fsc.nextInt();
        int a=fsc.nextInt();
        int b=fsc.nextInt();
        fsc.close();
        System.out.println(min(a, b)+" "+max(a+b-n, 0));
    }

    static class IntUtil {
        public static int min(final int a, final int... b) {
            int ret = a;
            for (final int c : b) {
                ret = Math.min(ret, c);
            }
            return ret;
        }

        public static int max(final int a, final int... b) {
            int ret = a;
            for (final int c : b) {
                ret = Math.max(ret, c);
            }
            return ret;
        }

        /**
         * Caluculate the ceil of a/b. Returns the smallest integer greater than or
         * equal to a/b while 'a/b' rounds fractional parts to ZERO.
         * 
         * @param a
         * @param b
         * @return the smallest integer greater than or equal to a/b
         */
        public static int ceilDiv(final int a, final int b) {
            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                if (b > 0) {
                    return (a + b - 1) / b;
                } else {
                    return (a + b + 1) / b;
                }
            } else {
                return a / b;
            }
        }

        /**
         * Caluculate the floor of a/b. Returns the largest integer less than or equal
         * to a/b while 'a/b' rounds fractional parts to ZERO.
         * 
         * @param a
         * @param b
         * @return the largest integer less than or equal to a/b
         */
        public static int floorDiv(final int a, final int b) {
            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                return a / b;
            } else {
                if (b > 0) {
                    return (a - b + 1) / b;
                } else {
                    return (a - b - 1) / b;
                }
            }
        }

        public static int fold(final IntBinaryOperator func, final int a, final int... b) {
            int ret = a;
            for (final int c : b) {
                ret = func.applyAsInt(ret, c);
            }
            return ret;
        }
    }

    static class LongUtil {
        public static long min(final long a, final long... b) {
            long ret = a;
            for (final long c : b) {
                ret = Math.min(ret, c);
            }
            return ret;
        }

        public static long max(final long a, final long... b) {
            long ret = a;
            for (final long c : b) {
                ret = Math.max(ret, c);
            }
            return ret;
        }

        /**
         * Caluculate the ceil of a/b. Returns the smallest integer greater than or
         * equal to a/b while 'a/b' rounds fractional parts to ZERO.
         * 
         * @param a
         * @param b
         * @return the smallest integer greater than or equal to a/b
         */
        public static long ceilDiv(final long a, final long b) {
            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                if (b > 0) {
                    return (a + b - 1) / b;
                } else {
                    return (a + b + 1) / b;
                }
            } else {
                return a / b;
            }
        }

        /**
         * Caluculate the floor of a/b. Returns the largest integer less than or equal
         * to a/b while 'a/b' rounds fractional parts to ZERO.
         * 
         * @param a
         * @param b
         * @return the largest integer less than or equal to a/b
         */
        public static long floorDiv(final long a, final long b) {
            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                return a / b;
            } else {
                if (b > 0) {
                    return (a - b + 1) / b;
                } else {
                    return (a - b - 1) / b;
                }
            }
        }

        public static long fold(final LongBinaryOperator func, final long a, final long... b) {
            long ret = a;
            for (final long c : b) {
                ret = func.applyAsLong(ret, c);
            }
            return ret;
        }
    }

    static class MathUtil {
        /**
         * Enumarate primes less than n.
         * 
         * @param n
         * @return {@code ArrayList} that holds primes.
         */
        public static ArrayList<Integer> eratosthenes(final int n) {
            final int[] div = eratosthenesDivisors(n);
            final ArrayList<Integer> result = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                if (div[i] == i) {
                    result.add(i);
                }
            }
            return result;
        }

        /**
         * execute eratosthenes's prime-enumerate algorithm. a[i] holds the greatest
         * divisor of i. if a[i]=i, i is a prime number. This arrary enables you to
         * prime-factorize in O(log n) time. (<O(sqrt n)).
         * 
         * @param n
         * @return divisor array.
         */
        public static int[] eratosthenesDivisors(final int n) {
            final int[] divisors = new int[n + 1];
            if (n <= 0) {
                return null;
            }
            for (int i = 1; i <= n; i++) {
                if ((i & 1) != 0) {
                    divisors[i] = i;
                } else {
                    divisors[i] = 2;
                }
            }
            for (long i = 3; i <= n; i += 2) {
                if (divisors[(int) i] == (int) i) {
                    for (long j = i * i; j <= n; j += (i << 1)) {
                        divisors[(int) j] = (int) i;
                    }
                }
            }
            return divisors;
        }

        /**
         * Caluculate prime-factorization.
         * 
         * @param n
         * @return {@code HashMap} of {prime: index}
         */
        public static HashMap<Long, Integer> primeFactorization(long n) {
            final HashMap<Long, Integer> primes = new HashMap<Long, Integer>();
            for (long p = 2; p * p <= n; p++) {
                int q = 0;
                while (n % p == 0) {
                    n /= p;
                    q++;
                }
                if (q > 0) {
                    primes.put(p, q);
                }
            }
            if (n > 1) {
                primes.put(n, 1);
            }
            return primes;
        }

        private static HashMap<Long, Integer> lcm(final HashMap<Long, Integer> amap,
                final HashMap<Long, Integer> bmap) {
            if (amap.size() < bmap.size()) {
                return lcm(bmap, amap);
            }
            final HashMap<Long, Integer> lcm = amap;
            for (final Map.Entry<Long, Integer> e : bmap.entrySet()) {
                final long prime = e.getKey();
                if (lcm.containsKey(prime)) {
                    lcm.put(prime, Math.max(lcm.get(prime), e.getValue()));
                } else {
                    lcm.put(prime, e.getValue());
                }
            }
            return lcm;
        }

        private static HashMap<Long, Integer> lcm(final HashMap<Long, Integer> amap, final long b) {
            final HashMap<Long, Integer> bmap = primeFactorization(b);
            return lcm(amap, bmap);
        }

        public static HashMap<Long, Integer> lcm(final long a, final long... b) {
            HashMap<Long, Integer> amap = primeFactorization(a);
            for (final long c : b) {
                amap = lcm(amap, c);
            }
            return amap;
        }

        public static long unsafeLCM(final long a, final long b) {
            return a * b / gcd(a, b);
        }

        /**
         * Caluculate the GCD of (a, b)/
         * 
         * @param a first value
         * @param b second value
         * @return GCD(a, b)
         */
        public static long gcd(long a, long b) {
            if (a < b) {
                return gcd(b, a);
            }
            long r = a % b;
            while (r != 0) {
                a = b;
                b = r;
                r = a % b;
            }
            return b;
        }

        /**
         * Return one of the solutions to {@code ax+by=gcd(a, b)}.
         * 
         * @return {@code x}, {@code y}, {@code gcd(a, b)}.
         * @param a a of ax+by=gcd(a, b).
         * @param b b of ax+by=gcd(a, b). class ReferenceLong is a reference type of
         *          long.
         */
        public static long[] extGCD(final long a, final long b) {
            final ReferenceLong x = new ReferenceLong();
            final ReferenceLong y = new ReferenceLong();
            final long[] ret = new long[3];
            ret[2] = extGCD(a, b, x, y);
            ret[0] = x.v;
            ret[1] = y.v;
            return ret;
        }

        private static long extGCD(final long a, final long b, final ReferenceLong x, final ReferenceLong y) {
            if (b == 0) {
                x.v = 1;
                y.v = 0;
                return a;
            }
            final long d = extGCD(b, a % b, y, x);
            y.v -= a / b * x.v;
            return d;
        }

        private static class ReferenceLong {
            long v = 0;
        }
    }

    static class IntArrayUtil {
        public static void reverse(final int[] a, final int begin, final int end) {
            for (int i = begin; i < begin + (end - begin) / 2; i++) {
                swap(a, i, begin + end - i - 1);
            }
        }

        public static void reverse(final int[] a) {
            reverse(a, 0, a.length);
        }

        public static void revSort(final int[] a) {
            Arrays.sort(a);
            reverse(a);
        }

        public static int[] nextPermutation(final int[] a) {
            final int[] ret = a.clone();
            final int n = ret.length;
            for (int i = n - 1; i >= 1; i--) {
                if (ret[i] > ret[i - 1]) {
                    int fail = n, pass = i;
                    while (fail - pass > 1) {
                        final int mid = pass + (fail - pass) / 2;
                        if (ret[mid] > ret[i - 1])
                            pass = mid;
                        else
                            fail = mid;
                    }
                    swap(ret, pass, i - 1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }

        public static int[] predPermutation(final int[] a) {
            final int[] ret = a.clone();
            final int n = ret.length;
            for (int i = n - 1; i >= 1; i--) {
                if (ret[i] < ret[i - 1]) {
                    int fail = n, pass = i;
                    while (fail - pass > 1) {
                        final int mid = pass + (fail - pass) / 2;
                        if (ret[mid] < ret[i - 1])
                            pass = mid;
                        else
                            fail = mid;
                    }
                    swap(ret, pass, i - 1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }

        public static void swap(final int[] a, final int u, final int v) {
            final int tmp = a[u];
            a[u] = a[v];
            a[v] = tmp;
        }

        public static int compare(final int[] a, final int[] b) {
            for (int i = 0; i < a.length; i++) {
                if (i >= b.length) {
                    return -1;
                } else if (a[i] > b[i]) {
                    return 1;
                } else if (a[i] < b[i]) {
                    return -1;
                }
            }
            if (a.length < b.length) {
                return 1;
            } else {
                return 0;
            }
        }

        public static boolean equals(final int[] a, final int[] b) {
            return compare(a, b) == 0;
        }
    }

    static class LongArrayUtil {
        public static void reverse(final long[] a, final int begin, final int end) {
            for (int i = begin; i < begin + (end - begin) / 2; i++) {
                final long tmp = a[i];
                a[i] = a[begin + end - i - 1];
                a[begin + end - i - 1] = tmp;
            }
        }

        public static void reverse(final long[] a) {
            reverse(a, 0, a.length);
        }

        public static void revSort(final long[] a) {
            Arrays.sort(a);
            reverse(a);
        }

        public static void compress(final long[] a) {
            final int n = a.length;
            final long[] sorted = a.clone();
            Arrays.sort(sorted);
            for (int i = 0; i < n; i++) {
                int l = 0, r = n;
                while (r - l > 1) {
                    final int m = l + (r - l) / 2;
                    if (sorted[m] <= a[i])
                        l = m;
                    else
                        r = m;
                }
                a[i] = l;
            }
        }

        public static long[] nextPermutation(final long[] a) {
            final long[] ret = a.clone();
            final int n = ret.length;
            for (int i = n - 1; i >= 1; i--) {
                if (ret[i] > ret[i - 1]) {
                    int fail = n, pass = i;
                    while (fail - pass > 1) {
                        final int mid = pass + (fail - pass) / 2;
                        if (ret[mid] > ret[i - 1])
                            pass = mid;
                        else
                            fail = mid;
                    }
                    swap(ret, pass, i - 1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }

        public static long[] predPermutation(final long[] a) {
            final long[] ret = a.clone();
            final int n = ret.length;
            for (int i = n - 1; i >= 1; i--) {
                if (ret[i] < ret[i - 1]) {
                    int fail = n, pass = i;
                    while (fail - pass > 1) {
                        final int mid = pass + (fail - pass) / 2;
                        if (ret[mid] < ret[i - 1])
                            pass = mid;
                        else
                            fail = mid;
                    }
                    swap(ret, pass, i - 1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }

        public static void swap(final long[] a, final int u, final int v) {
            final long tmp = a[u];
            a[u] = a[v];
            a[v] = tmp;
        }

        public static int compare(final long[] a, final long[] b) {
            for (int i = 0; i < a.length; i++) {
                if (i >= b.length) {
                    return -1;
                } else if (a[i] > b[i]) {
                    return 1;
                } else if (a[i] < b[i]) {
                    return -1;
                }
            }
            if (a.length < b.length) {
                return 1;
            } else {
                return 0;
            }
        }

        public static boolean equals(final long[] a, final long[] b) {
            return compare(a, b) == 0;
        }
    }

    static class ModUtil {
        private static long safeMAX = 100_000_000_000_000_000l;

        public static long modFold(final LongBinaryOperator function, final long a, final long... b) {
            long ret = a;
            for (final long c : b) {
                ret = function.applyAsLong(ret, c);
                ret %= MOD;
            }
            return ret;
        }

        public static long modAdd(final long a, final long... b) {
            long ret = a;
            for (final long c : b) {
                if (ret >= safeMAX || ret <= -safeMAX) {
                    ret %= MOD;
                }
                ret += c;
            }
            return ret;
        }

        public static long modMul(final long a, final long... b) {
            long ret = a;
            for (final long c : b) {
                ret *= c;
                ret %= MOD;
            }
            return ret;
        }

        public static long modDiv(final long a, final long... b) {
            long ret = a;
            for (final long c : b) {
                ret *= modinv(c);
                ret %= MOD;
            }
            return ret;
        }

        public static long modSub(final long a, final long... b) {
            long ret = a;
            for (final long c : b) {
                ret -= c;
                if (ret >= safeMAX || ret <= -safeMAX) {
                    ret %= MOD;
                }
            }
            ret %= MOD;
            if (ret < 0) {
                ret += MOD;
            }
            return ret;
        }

        /**
         * Caluculate the value b s.t. a*b mod MOD = 1.
         * 
         * @param a
         * @return inverse of a
         */
        public static long modinv(long a) {
            long b = MOD;
            long u = 1, v = 0;
            while (b >= 1) {
                final long t = a / b;
                a -= t * b;
                final long tmp1 = a;
                a = b;
                b = tmp1;
                u -= t * v;
                final long tmp2 = u;
                u = v;
                v = tmp2;
            }
            u %= MOD;
            return u >= 0 ? u : u + MOD;
        }

        /**
         * Caluculate the combination nCr.
         * 
         * @param n left
         * @param r right
         * @return nCr
         */
        public static long comb(long n, long r) {
            if (n < r) {
                return 0;
            }
            r = Math.min(r, n - r);
            long res = 1;
            for (long d = 1; d <= r; d++) {
                res *= n;
                res %= MOD;
                n--;
                res *= modinv(d);
                res %= MOD;
            }
            return res;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (final IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(final int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            final StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            final long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public void close() {
            try {
                in.close();
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
}