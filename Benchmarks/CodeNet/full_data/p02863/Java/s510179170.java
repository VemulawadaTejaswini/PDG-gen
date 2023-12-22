import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] dp = new int[6005];
        int[][] vals = new int[n][2];
        for(int i = 0; i < n; i++) {
            vals[i][0] = scanner.nextInt();
            vals[i][1] = scanner.nextInt();
        }
        Arrays.sort(vals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for(int i =0; i < n; i++) {
            for(int k = t-1; k >= 0; k--) {
                if (dp[k] == -1) continue;
                dp[k + vals[i][0]] = Math.max(dp[k + vals[i][0]], dp[k] + vals[i][1]);
            }
        }
        int ans = 0;
        for(int i = 0; i < dp.length; i++) {
            ans = Math.max(ans, dp[i]);
        }
        out.println(ans);
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
    }
}
