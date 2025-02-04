import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int[][] dp = new int[N+1][3];
        for(int i = 1; i <= N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2])+a;
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2])+b;
            dp[i][2] = Math.max(dp[i-1][1], dp[i-1][0])+c;
        }
        out.println(Math.max(Math.max(dp[N][0], dp[N][1]), dp[N][2]));
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
