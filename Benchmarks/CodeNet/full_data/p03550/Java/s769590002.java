import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        long z = in.nl(), w = in.nl();
        long[][] dp = new long[n+1][n+1];
        long[] a = in.nl(n);
        dp[n][0] = Math.abs(a[n-1]-w);
        dp[0][n] = Math.abs(a[n-1]-z);
        for (int i = 1; i <= n; i++) {
            dp[n][i] = Math.abs(a[n-1]-a[i-1]);
            dp[i][n] = Math.abs(a[n-1]-a[i-1]);
        }
        for (int i = n-1; i > 0; i--) {
            //y
            dp[i][i-1] = dp[i][n];
            for (int j = n-1; j > i; j--) {
                dp[i][i-1] = Math.min(dp[i][i-1], dp[i][j]);
            }
            for (int j = i-2; j >= 0; j--) {
                dp[i][j] = dp[i][i-1];
            }
            //x
            dp[i-1][i] = dp[n][i];
            for (int j = n-1; j > i; j--) {
                dp[i-1][i] = Math.max(dp[i-1][i], dp[j][i]);
            }
            for (int j = i-2; j >= 0; j--) {
                dp[j][i] = dp[i-1][i];
            }
        }
        for (int i = 1; i <= n; i++) {
            dp[0][0] = Math.max(dp[0][0], dp[i][0]);
        }
        out.println(dp[0][0]);
    }

    public static void main(String[] args){
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
        public int ni(){
            return Integer.parseInt(ns());
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public double nd(){
            return Double.parseDouble(ns());
        }
        public char nc(){
            return ns().toCharArray()[0];
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