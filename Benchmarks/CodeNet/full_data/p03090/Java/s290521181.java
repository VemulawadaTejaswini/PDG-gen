import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;
    //agc32 b
    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        StringBuilder sb = new StringBuilder();
        if(n%2==0){
            sb.append(n*(n-2)/2).append("\n");
            for (int i = 1; i <= n; i++) {
                for (int j = i+1; j <= n; j++) {
                    if(i+j!=1+n){
                        sb.append(i).append(' ').append(j).append("\n");
                    }
                }
            }
        }else{
            sb.append((n-1)*(n-1)/2).append("\n");
            for (int i = 1; i <= n; i++) {
                for (int j = i+1; j <= n; j++) {
                    if(i+j!=n){
                        sb.append(i).append(' ').append(j).append("\n");
                    }
                }
            }
        }
        out.print(sb.toString());
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