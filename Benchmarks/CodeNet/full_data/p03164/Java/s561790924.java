import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), W = in.ni();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.ni();
            v[i] = in.ni();
        }
        long[][] dp = new long[n+1][100001];
        Arrays.fill(dp[0], INF);
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 100000; j++) {
                if(j-v[i-1]>=0) dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-v[i-1]]+w[i-1]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        int ans = 100000;
        while(dp[n][ans]>W) ans--;
        out.println(ans);
    }

    public static void main(String[] args) throws Exception{
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
        out.close();
    }
    public static class InputReader{
        private BufferedReader br;
        private StringTokenizer st;
        public InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }
        public String ns(){
            if(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public Double nd(){
            return Double.parseDouble(ns());
        }
        public int[] ni(int n){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }
        public long[] nl(int n){
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nl();
            }
            return a;
        }
        public double[] nd(int n){
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nd();
            }
            return a;
        }
    }
}