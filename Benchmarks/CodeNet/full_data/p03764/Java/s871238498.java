import java.util.*;
import java.io.*;

public class Main {
    static long mod = (long) 1e9 + 7;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int m = sc.nextInt();
        long a = 0;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            a = (a + x * i) % mod;
            a = (a - x * (n - 1 - i)) % mod;
            if (a < 0) a += mod;
        }
        long b = 0;
        for (int i = 0; i < m; i++) {
            long x = sc.nextLong();
            b = (b + x * i) % mod;
            b = (b - x * (m - 1 - i)) % mod;
            if (b < 0) b += mod;
        }
        out.println((a * b) % mod);
        out.close();
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