import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int MOD = (int) Math.pow(10, 9);

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ac = new int[100001];
        int[] wa = new int[100001];

        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            String s = sc.next();

            if (s.equals("AC")) {
                ac[p] = 1;
            } else {
                if (ac[p] == 0) {
                    wa[p]++;
                }
            }
        }

        int acCnt = 0;
        int waCnt = 0;
        for (int i = 1; i <= 100000; i++) {
            acCnt += ac[i];
            if (ac[i] == 1) {waCnt += wa[i];}
        }

        System.out.println(acCnt + " " + waCnt);

        System.exit(0);
    }

    static private long gcd(long m, long n) {
        if (m < n) { return gcd(n, m); }
        if (m % n == 0) { return n; }
        return gcd(n, m%n);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
            try{
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
