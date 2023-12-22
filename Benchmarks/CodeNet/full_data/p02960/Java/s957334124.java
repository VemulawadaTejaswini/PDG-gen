import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 1000000007L;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        char[] str = scanner.next().toCharArray();
        long[] dp = new long[13];
        dp[0] = 1;
        int N = str.length;
//        for(int i = N-1; i >= 0; i--) {
        for(int i =0; i < N; i++) {
            long[] newdp = new long[13];
            if (str[i] == '?') {
                for(int j = 0; j < 10; j++) {
                    for(int k = 0; k < 13; k++) {
                        int ind = (10*k + j) % 13;
                        newdp[ind] = (newdp[ind] + dp[k]) % MOD;
                    }
                }
            }
            else {
                int curVal = (str[i]-'0');
                for(int k = 0; k < 13; k++) {
                    int ind = (10*k + curVal) % 13;
                    newdp[ind] = (newdp[ind] + dp[k]) % MOD;
                }
            }
            dp = newdp;
        }
        out.println(dp[5]);
        out.flush();
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        public FastScanner() {
            this(new InputStreamReader(System.in));
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
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
