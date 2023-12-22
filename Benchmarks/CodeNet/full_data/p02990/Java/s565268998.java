import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }


    /**
     * modの逆元を計算する関数 by 拡張互除法
     *
     * @param a 逆元を求めたい数
     * @param m 法となっている数
     * @return 求めたい逆元
     */
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

    private void solve() {
        try {
            long sev = (long) Math.pow(10, 9) + 7;
            long n,k;
            n = sc.nextLong();
            k = sc.nextLong();

            long[] kaijou = new long[2001];
            long[] kaiinv = new long[2001];
            kaijou[0] = 1;
            kaiinv[0] = modinv(1, sev);
            for (int i = 1; i <= 2000; i++) {
                kaijou[i] = (kaijou[i-1] * i) % sev;
                kaiinv[i] = modinv(kaijou[i], sev);
            }

            for (int i = 1; i <= k; i++) {
                // (n-k+1)C(i) * (k-1)C(i-1)
                long tmp1=1, tmp2=1;

                tmp1 *= kaijou[(int)(n-k+1)];
                tmp1 = (tmp1 * kaiinv[i]) % sev;
                tmp1 = (tmp1 * kaiinv[(int)(n-k+1-i)]) % sev;

                tmp2 *= kaijou[(int) (k-1)];
                tmp2 = (tmp2 * kaiinv[i-1]) % sev;
                tmp2 = (tmp2 * kaiinv[(int)(k-i)]) % sev;

                System.out.println((tmp1 * tmp2) % sev);
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
}