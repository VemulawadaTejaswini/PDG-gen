import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        long a;
        Pair p;
        Pair[] pair = new Pair[n];
        for (int i = 0; i < n; i++) {
            a = in.nl();
            p = new Pair(a,i);
            pair[i] = p;
        }
        Arrays.sort(pair);
        long ans = 0;
        long[][] dp = new long[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if(i==0&&j==0) continue;
                if(i+j>n) break;
                if(i==0){
                    dp[0][j] = dp[0][j-1]+pair[i+j-1].a*(n-j-pair[i+j-1].i);
                }else if(j==0){
                    dp[i][0] = dp[i-1][0]+pair[i+j-1].a*(pair[i+j-1].i-i+1);
                }else{
                    dp[i][j] = Math.max(dp[i][j-1]+pair[i+j-1].a*(n-j-pair[i+j-1].i),dp[i-1][j]+pair[i+j-1].a*(pair[i+j-1].i-i+1));
                }
                if(i+j==n) ans = Math.max(ans, dp[i][j]);
            }
        }
        out.println(ans);
    }
    public static class Pair implements Comparable<Pair>{
        long a; int i;
        public Pair(long a, int i){
            this.a = a;
            this.i = i;
        }
        @Override
        public int compareTo(Pair o) {
            return Long.compare(o.a,a);
        }
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