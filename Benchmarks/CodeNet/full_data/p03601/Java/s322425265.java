
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.*;

public class Main {


    static MyScanner sc;
    private static PrintWriter out;
    static long M = 1000000007;

    public static void main(String[] s) throws Exception {
//        sc = new MyScanner(new BufferedReader(new StringReader("8\n" +
//                "1 1 1 1 1 1 1 2")));
        sc = new MyScanner(System.in);


        out = new PrintWriter(new OutputStreamWriter(System.out));
        long t = System.currentTimeMillis();
        solve();
        out.flush();
    }


    private static void solve() {

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        boolean[] cans = new boolean[3001];
        boolean[] canw = new boolean[3001];
        cans[0] = true;
        canw[0] = true;
        for (int i = 0; i < 3000; i++) {
            if (cans[i]) {
                if (i + c <= 3000) {
                    cans[i + c] = true;
                }

                if (i + d <= 3000) {
                    cans[i + d] = true;
                }
            }
        }
        for (int i = 0; i < 30; i++) {
            if (canw[i]) {
                if (i + b <= 30) {
                    canw[i + a] = true;
                }

                if (i + d <= 30) {
                    canw[i + b] = true;
                }
            }
        }


        int[] max = new int[]{0,  a};
        Comparator<int[]> rr = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Double.compare(100.0 * o1[0] / (o1[0] + 100 * o1[1]), 100.0 * o2[0] / (o2[0] +  100 * o2[1]) );
            }
        };

        for (int i = 0 ; i <= 3000; i++) {
            for (int j = 1 ; j <= 30; j++) {
                if (i + j * 100 > f) continue;
                if (j * e < i) continue;
                if (!cans[i]) continue;
                if (!canw[j]) continue;
                if (rr.compare(max, new int[]{i, j}) < 0){
                    max = new int[]{i, j};
                };

            }
        }

        out.println((max[1] * 100 + max[0]) + " " + max[0]);
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