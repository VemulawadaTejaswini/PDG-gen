
import java.io.*;
import java.util.*;

public class Main {

    static MyScanner sc;
    private static PrintWriter out;
    static long M = 1000000007;

    public static void main(String[] s) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();


        if (stringBuilder.length() == 0) {
            sc = new MyScanner(System.in);
        } else {
            sc = new MyScanner(new BufferedReader(new StringReader(stringBuilder.toString())));
        }


        out = new PrintWriter(new OutputStreamWriter(System.out));
        long t = System.currentTimeMillis();


        solve();
        out.flush();
    }

    private static void solve() {
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int[] ct = new int[26];
        for (int i = 0; i < s1; i++) {
            String k = sc.next();
            if (k.length() != s2) {
                throw new IllegalStateException();
            }
            for (int l = 0; l < s2; l++) {
                char x = k.charAt(l);
                ct[x - 'a']++;
                if (ct[x - 'a'] == 4) {
                    ct[x - 'a'] = 0;
                }
            }
        }

        if ((s1 % 2) == 0 && (s2 % 2 == 0)) {
            for (int i : ct) {
                if (i != 0) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
            return;
        }
        int p = 0;
        if ((s1 % 2) == 1 && (s2 % 2 == 1)) {
            p = s1 + s2 - 2;

            for (int i = 0; i < 26; i++) {
                if (ct[i] % 2 == 1) {
                    ct[i]--;
                }
            }
        } else {
            if (s1 % 2 == 0) {
                p = s1;
            } else {
                p = s2;
            }
        }
        p /= 2;
        for (int c : ct) {
            if (c % 2 == 1) {
                out.println("No");
                return;
            }
        }
        int r = 0;
        for (int i : ct) {
            if (i == 2) {
                r++;
            }
        }
        out.println(r > p ? "No" : "Yes");
    }


    private static void solveT() {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    private static long gcd(long l, long l1) {
        if (l > l1) return gcd(l1, l);
        if (l == 0) return l1;
        return gcd(l1 % l, l);
    }

    private static long pow(long a, long b, long m) {
        if (b == 0) return 1;
        if (b == 1) return a;
        long pp = pow(a, b / 2, m);
        pp *= pp;
        pp %= m;
        return (pp * (b % 2 == 0 ? 1 : a)) % m;
    }


    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        MyScanner(BufferedReader br) {
            this.br = br;
        }

        public MyScanner(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        String next() {
            findToken();
            return st.nextToken();
        }

        int[] na(int n) {
            int[] k = new int[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.nextInt();
            }
            return k;
        }

        long[] nl(int n) {
            long[] k = new long[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.nextLong();
            }
            return k;
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
    }


}