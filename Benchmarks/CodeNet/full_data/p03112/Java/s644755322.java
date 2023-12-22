
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int a,b,q;
            a = sc.nextInt();
            b = sc.nextInt();
            q = sc.nextInt();

            long[] s,t,x;
            s = new long[a+2];
            t = new long[b+2];
            x = new long[q];

            s[0] = Long.MIN_VALUE/4;
            for (int i = 1; i <= a; i++) {
                s[i] = sc.nextLong();
            }
            s[a+1] = Long.MAX_VALUE/4;

            t[0] = Long.MIN_VALUE/4;
            for (int i = 1; i <= b; i++) {
                t[i] = sc.nextLong();
            }
            t[b+1] = Long.MAX_VALUE/4;

            for (int i = 0; i < q; i++) {
                x[i] = sc.nextLong();
            }

            for (int i = 0; i < q; i++) {
                long xx = x[i];
                int si = Arrays.binarySearch(s, xx);
                si = si >= 0 ? si : ~si;
                int ti = Arrays.binarySearch(t, xx);
                ti = ti >= 0 ? ti : ~ti;

                long min = Long.MAX_VALUE;
                Set<Long> ss = new HashSet<>();ss.add(s[si]);ss.add(s[si-1]);
                Set<Long> ts = new HashSet<>();ts.add(t[ti]);ts.add(t[ti-1]);
                for (long sstmp: ss) {
                    for (long tstmp: ts) {
                        long hoge = Math.abs(sstmp - xx) + Math.abs(tstmp - sstmp);
                        if (min > hoge) min = hoge;
                        long huga = Math.abs(tstmp - xx) + Math.abs(tstmp - sstmp);
                        if (min > huga) min = huga;
                    }
                }
                System.out.println(min);


            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }

    long modinv(long a, long m) {
        long b = m, u = 1, v = 0;
        while (b > 0) {
            long tmp;
            long t = a / b;

            a -= t * b;

            // swap(a,b)
            tmp = a;
            a = b;
            b = tmp;

            u -= t * v;

            // swap(u,v)
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
    }

    long div(long a, long b, int MOD) {
        a %= MOD;
        return a * modinv(b, MOD) % MOD;
    }

    long modpow(long a, long n, int MOD) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            n >>= 1;

        }
        return res;
    }

    static class PaC {
        private long[] fac, finv, inv;
        private int MOD;

        public PaC(int MAX, int MOD) {
            MAX++;
            this.fac = new long[MAX];
            this.finv = new long[MAX];
            this.inv = new long[MAX];
            this.MOD = MOD;

            this.fac[0] = this.fac[1] = 1;
            this.finv[0] = this.finv[1] = 1;
            this.inv[1] = 1;
            for (int i = 2; i < MAX; i++) {
                this.fac[i] = this.fac[i - 1] * i % MOD;
                this.inv[i] = MOD - this.inv[MOD % i] * (MOD / i) % MOD;
                this.finv[i] = this.finv[i - 1] * this.inv[i] % MOD;
            }
        }

        public long combination(int n, int k) {
            if (n < k) {
                return 0;
            }
            if (n < 0 || k < 0) {
                return 0;
            }
            return this.fac[n] * (this.finv[k] * this.finv[n - k] % this.MOD) % this.MOD;
        }

        public long permutation(int n, int k) {
            if (n < k) {
                return 0;
            }
            if (n < 0 || k < 0) {
                return 0;
            }
            return this.fac[n] * (this.finv[n - k] % this.MOD) % this.MOD;
        }

    }
}