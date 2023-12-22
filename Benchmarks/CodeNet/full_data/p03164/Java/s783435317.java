import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        long W = scanner.nextInt();
        long dp[] = new long[100001];
        Arrays.fill(dp, Long.MAX_VALUE/2);
        dp[0] = 0;
        for(int i= 0; i < N; i++) {
            long w = scanner.nextLong();
            int v = scanner.nextInt();
            for(int j = 100000-v; j>= 0; j--) {
                if (dp[j] != Long.MAX_VALUE) dp[j+v] = Math.min(dp[j+v], dp[j] + w);
            }
        }
        long ans = 0;
        for(int i = 100000; i >= 0; i--) {
            if (dp[i] <= W) {
                ans = i;
                break;
            }
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
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
