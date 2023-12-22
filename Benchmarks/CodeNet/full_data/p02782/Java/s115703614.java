import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int r2 = in.nextInt();
        int c2 = in.nextInt();

        ModCalculator calc = new ModCalculator(MOD);

        long ans = 0;

        // https://img.atcoder.jp/abc154/editorial.pdf
        ans = calc.add(ans, g(calc, r2, c2));
        ans = calc.subtract(ans, g(calc, r2, c1 - 1));
        ans = calc.subtract(ans, g(calc, r1 - 1, c2));
        ans = calc.add(ans, g(calc, r1 - 1, c1 - 1));

        out.println(ans);
    }

    private static long g(ModCalculator calc, int r, int c) {
        return f(calc, r + 1, c + 1);
        /*
        long ret = 0;
        for (int i = 0; i <= r; i++) {
            ret = calc.add(ret, f(calc, i + 1, c));
        }
        return ret;

         */
    }

    private static long f(ModCalculator calc, int r, int c) {
        return calc.combination(r + c, c);
    }

    static class ModCalculator {
        private final long mod;

        // factorial in mod
        // factMod[1] = 1, factMod[2] = 2, ...
        private List<Long> factorial;
        // inverse factorial in mod
        private List<Long> inverseFactorial;

        ModCalculator(long mod) {
            this.mod = mod;
            factorial = new ArrayList<>();
            inverseFactorial = new ArrayList<>();
            factorial.add(1L);
            inverseFactorial.add(1L);
        }

        /**
         * Quickly populate factorial and inverse factorial up to n
         */
        private void populate(int n) {
            // i == next index
            int start = factorial.size();
            for (int i = start; i <= n; i++) {
                factorial.add(
                        multiply(factorial.get(i - 1), i)
                );
                // temporarily add
                inverseFactorial.add(0L);
            }
            // avoid inverse calculation by filling inverseFactorial in the inverse direction
            inverseFactorial.set(n, inverse(factorial.get(n)));
            for (int i = n; i > start; i--) {
                inverseFactorial.set(i - 1, multiply(inverseFactorial.get(i), i));
            }
        }

        // a + b (mod m)
        long add(long a, long b) {
            return (a + b) % mod;
        }

        // a - b (mod m)
        long subtract(long a, long b) {
            return add(add(a, -b), mod);
        }

        // a * b (mod m)
        long multiply(long a, long b) {
            return (a * b) % mod;
        }

        // x^-1 (mod m)
        long inverse(long x) {
            return power(x, mod - 2);
        }

        // x^n (mod m)
        long power(long x, long n) {
            long ans = 1;
            while (n != 0) {
                if ((n & 1) == 1L) ans = multiply(ans, x);
                x = multiply(x, x);
                n = n >> 1;
            }
            return ans;
        }

        /**
         * Calculates factorial value in mod.
         */
        long factorial(int n) {
            populate(n);
            return factorial.get(n);
        }

        /**
         * Calculates inverse factorial value in mod.
         */
        long inverseFactorial(int n) {
            populate(n);
            return inverseFactorial.get(n);
        }

        /**
         * Calculates combination value in mod.
         * <br>a.k.a
         * <br>aCb
         * <br> = n! / (n - r)! r!
         */
        long combination(int n, int r) {
            if (n == 0 && r == 0) return 1;
            if (n < r || n < 0) return 0;

            populate(n);
            return multiply(factorial.get(n), multiply(inverseFactorial.get(n - r), inverseFactorial.get(r)));
        }

        /**
         * Calculates permutation value in mod.
         * <br>a.k.a
         * <br>aPb
         * <br> = n! / (n - r)!
         */
        long permutation(int n, int r) {
            if (n == 0 && r == 0) return 0;
            if (n < r || n < 0) return 0;

            populate(n);
            return multiply(factorial.get(n), inverseFactorial.get(n - r));
        }
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
