import java.util.*;
import java.io.*;

public class Main {
    static long mod = (long) 1e9 + 7;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        Long [] c = new Long[n + 1];
        for (int i = 1; i <= n; i++) c[i] = sc.nextLong();
        Arrays.sort(c, 1, n + 1, Comparator.reverseOrder());
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            long outerPow = pow(2, n - i);
            long firstInner = pow(2, i - 1);
            long secondInner = ((i - 1) * pow(2, i - 2)) % mod;
            long sum = (firstInner + secondInner) % mod;
            long total = (((outerPow * c[i]) % mod) * sum) % mod;
            ans = (ans + total) % mod;
        }
        ans = (ans * pow(2, n)) % mod;
        out.println(ans);
        out.close();
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

    static long inv(int x) {
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