import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[][] dp = new int[n][3];
        int[][] abc = new int[n][3];
        for (int i = 0; i < n; i++) {
            abc[i][0] = in.ni();
            abc[i][1] = in.ni();
            abc[i][2] = in.ni();
            Arrays.fill(dp[i], inf);
        }
        dp[0][0] = abc[0][0];
        dp[0][1] = abc[0][1];
        dp[0][2] = abc[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2])+abc[i][0];
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2])+abc[i][1];
            dp[i][2] = Math.max(dp[i-1][1],dp[i-1][0])+abc[i][2];
        }
        out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
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