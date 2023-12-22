

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] p = new long[n];
            long[] m = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (i == 0) {
                    p[i] = a[i];
                    m[i] = -1*a[i];
                } else {
                    if (i % 2 == 0) {
                        p[i] = p[i-1] + a[i];
                        m[i] = m[i-1] - a[i];
                    } else {
                        p[i] = p[i-1] - a[i];
                        m[i] = m[i-1] + a[i];
                    }
                }
            }

            List<Long> hoge = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long sum = 0;

                if (i%2 == 0) {
                    sum = p[i] + m[n-1] - m[i];
                } else {
                    sum = m[i] + p[n-1] - p[i];
                }
                /*
                for (int j = i - 1; j >= 0; j--) {
                    if ((i-j)%2 == 1) {
                        sum += a[j];
                    } else {
                        sum -= a[j];
                    }
                }
                 */



                /*
                for (int j = i; j < n; j++) {
                    if ((i-j) % 2 == 0) {
                        sum += a[j];
                    } else {
                        sum -= a[j];
                    }
                }

                 */
                hoge.add(sum);
                // if (i != 0) System.out.print(" ");
                // System.out.print(sum);
            }
            for (int i = 0; i < n; i++) {
                if (i != 0) System.out.print(" ");
                if (i == 0) {
                    System.out.print(hoge.get(n-1));
                } else {
                    System.out.print(hoge.get(i-1));
                }
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