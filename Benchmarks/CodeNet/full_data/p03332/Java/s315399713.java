import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        initFac(n);
        long a = sc.nextLong(); long b = sc.nextLong(); long k = sc.nextLong();
        long res = 0;
        for (int i = 0; i <= n; i++) {
            if ((k - a * i) < 0) continue;
            if ((k - a * i) % b != 0) continue;
            int j = (int) ((k - a * i) / b);
            res = (res + (nck(n, i) * nck(n, j)) % mod) % mod;
        }
        out.println(res);
        out.close();
    }

    static long[] fac;
    static long mod = (long) 998244353;

    static void initFac(long n) {
        fac = new long[(int) n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = (fac[i - 1]  * i) % mod;
        }
    }



    static long nck(int n, int k) {
        if (n < k)
            return 0;
        long den = inv((int) (fac[k] * fac[n - k] % mod));
        return fac[n] * den % mod;
    }

    static long pow(long b, long e) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1)
                ans = ans * b % mod;
            e >>= 1;
            b = b * b % mod;
        }
        return ans;
    }

    static long inv(long x) {
        return pow(x, mod - 2);
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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


    }

}