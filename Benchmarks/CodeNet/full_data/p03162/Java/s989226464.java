import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        //0 = swim/ 1 = bugs/ 2 = hw
        int[][] act = new int[N][3];
        for(int i = 0; i < N; i++) {
            act[i][0] = scanner.nextInt();
            act[i][1] = scanner.nextInt();
            act[i][2] = scanner.nextInt();
        }
        int[][] dp = new int[N][3];
        dp[0][0] = act[0][0];
        dp[0][1] = act[0][1];
        dp[0][2] = act[0][2];
        for(int i = 1; i < N; i++) {
            dp[i][0] = act[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = act[i][1] + Math.max(dp[i-1][2], dp[i-1][0]);
            dp[i][2] = act[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
        }
        int max = 0;
        for(int i = 0; i < 3; i++) {
            max = Math.max(max, dp[N-1][i]);
        }
        out.println(max);
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
