import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int a = in.ni(), b = in.ni(), c = in.ni(), d = in.ni(), e = in.ni(), f = in.ni();
        int max_sum = 0, max_sugar = 0;
        for (int i = 0; i <= f/(100*a); i++) {
            int water = i*100*a;
            int sugar_limit = water/100*e;
            while(water<=f){
                for (int j = 0; j*c<=sugar_limit&&(water+j*c)<=f; j++) {
                    int sugar = j*c + Math.min((sugar_limit-j*c)/d*d,(f-water-j*c)/d*d);
                    if(sugar*max_sum >= max_sugar*(water+sugar)){
                        max_sum = water + sugar;
                        max_sugar = sugar;
                    }
                }
                water += 100*b;
            }
        }
        out.printf("%d %d", max_sum, max_sugar);
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