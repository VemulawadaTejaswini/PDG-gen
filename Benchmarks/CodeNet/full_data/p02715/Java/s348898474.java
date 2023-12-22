import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int k = sc.nextInt();
        int [] a = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            a[i] = k / i;
        }
        long ans = 0; int mod = (int) 1e9 + 7;
        long [] amt = new long[k + 1];
        for (int i = k; i >= 1; i--) {
            long put = pow(a[i], n, mod);
            for (int j = 2 * i; j <= k; j += i) {
                put = (put - amt[j]) % mod;
                if (put < 0) put += mod;
            }
            amt[i] = put;
            ans = (ans + (i * amt[i]) % mod) % mod;
        }
        out.println(ans);
        out.close();
    }

    static long pow(long b, int e, int mod) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1)
                ans = ans * b % mod;
            e >>= 1;
            b = b * b % mod;
        }
        return ans;
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