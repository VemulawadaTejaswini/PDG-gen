import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

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
        initData();
        solve();
        out.flush();
    }

    private static void initData() {


    }

    private static void solve() {
        int l = sc.nextInt();
        int[] data = sc.na(l);

        long n2 = Long.MAX_VALUE;
        long n1 = 2;
        while (n1 + 1 < n2) {
            long oldn = (n1 + n2) / 2;
            long n = oldn;
            for (int s : data) {
                n = (n / s) * s;
            }
            if (n >= 2) {
                n2 = oldn;
            } else {
                n1 = oldn;
            }
        }
        long maxv = n2;

        n2 = Long.MAX_VALUE;
        n1 = 2;
        while (n1 + 1 < n2) {
            long oldn = (n1 + n2) / 2;
            long n = oldn;
            for (int s : data) {
                n = (n / s) * s;
            }
            if (n <= 2) {
                n1 = oldn;
            } else {
                n2 = oldn;
            }
        }

        if (n1 < maxv) {
            out.println(-1);
            return;
        }
        out.println(maxv + " " + n1);

    }


    private static void solveT() {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
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
