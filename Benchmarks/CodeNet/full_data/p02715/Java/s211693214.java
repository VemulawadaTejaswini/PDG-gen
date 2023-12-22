/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/abc162_e

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    long pow(long a, long n) {
        long rs = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                rs *= a;
                rs %= MOD;
            }
            n >>= 1;
            a *= a;
            a %= MOD;
        }
        return rs;
    }

    long mul(long a, long b) {
        return (a*b)%MOD;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int k = in.nextInt();
        int rs = 0;
        long[] dp = new long[k+1];
        for(int i=k; i>=1; i--) {
            dp[i] = pow(k/i, n);
            for(int j=2*i; j<=k; j+=i) {
                dp[i] -= dp[j];
                if(dp[i]<0) dp[i] += MOD;
            }
            rs += (i*dp[i])%MOD;
            if(rs>=MOD) rs -= MOD;
        }
        out.println(rs);
    }
    

    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;//in.nextInt();
        while(t-- >0) {
            new Main().solve(in, out);
        }
        out.close();
    }
    
    public static void show(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
    
    static class InputReader {
        static BufferedReader br;
        static StringTokenizer st;
        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
    }
}