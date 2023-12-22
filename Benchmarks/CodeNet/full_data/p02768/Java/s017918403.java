import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DBouquet solver = new DBouquet();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBouquet {
        long mod = 1_000_000_007;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            long n = in.nextInt();
            long a = in.nextInt();
            long b = in.nextInt();
            long res = power(n);
            long tmp = (mod - comb(a, n)) % mod;
            res += tmp;
            res %= mod;
            tmp = (mod - comb(b, n)) % mod;
            res += tmp;
            res %= mod;

            // d(comb(1, 3));

        /*long res = 0;
        for (int k=0; k<=n; k++) {
            if (k!=a && k!=b) {
                res += comb(a, n);
                res %= mod;
            }
        }*/
            out.println(res - 1);
        }

        private long comb(long a, long n) {
            long res = 1;
            for (int k = 1; k <= a; k++) {
                res *= n - k + 1;
                res %= mod;
                long tmp = inverse(k);
                tmp = (mod + (tmp % mod)) % mod;
                res *= tmp;
                res %= mod;
            }
            return res;
        }

        DBouquet.MyPair gcd(int a, int b) {
            DBouquet.MyPair res;
            if (a == 0) {
                return new DBouquet.MyPair(0, 1);
            }
            DBouquet.MyPair d = gcd(b % a, a);
            return new DBouquet.MyPair(d.second - (b / a) * d.first, d.first);
        }

        private long inverse(long val) {
            DBouquet.MyPair res = gcd((int) val, (int) mod);
            return res.first;
        }

        private long power(long n) {
            long cur = 1;
            while (n >= 1) {
                n--;
                cur *= 2;
                cur %= mod;
            }
            return cur;
        }

        public static class MyPair implements Comparable<DBouquet.MyPair> {
            int first;
            int second;

            public MyPair(int first, int second) {
                this.first = first;
                this.second = second;
            }

            public String toString() {
                return "[" + first + ", " + second + "]";
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                DBouquet.MyPair myPair = (DBouquet.MyPair) o;
                return first == myPair.first &&
                        second == myPair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(DBouquet.MyPair p2) {
                return first - p2.first != 0 ? first - p2.first : this.second - p2.second;
            }

        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
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

