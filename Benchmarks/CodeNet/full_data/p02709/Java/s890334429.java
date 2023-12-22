import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[] a = in.ni(n);
        boolean[] use = new boolean[n];
        int l = 0, r = n-1;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int index = 0;
            long mul = 0;
            for (int j = 0; j < n; j++) {
                if(!use[j]){
                    if(mul<Math.max(a[j]*(r-j),a[j]*(j-l))){
                        index = j;
                        mul = Math.max(a[j]*(r-j),a[j]*(j-l));
                    }
                }
            }
            use[index] = true;
            ans += mul;
            if(a[index]*(r-index)==mul){
                r--;
            }else if(a[index]*(index-l)==mul){
                l++;
            }
        }
        out.println(ans);
    }
    public static class Pair implements Comparable<Pair>{
        long a; long dist; long num;
        public Pair(long x, long y, long num){
            this.a = x;
            this.dist = y;
            this.num = num;
        }
        @Override
        public int compareTo(Pair o) {
            return Long.compare(o.a*o.dist,a*dist);
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