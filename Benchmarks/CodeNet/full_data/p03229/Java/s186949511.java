import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main{
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[] a = in.ni(n);
        Arrays.sort(a);
        long sum = 0, sum2 = 0;
        if(n%2==0){
            for (int i = 0; i < n; i++) {
                if(i<n/2-1) a[i] *= -2;
                else if(i==n/2-1) a[i]*= -1;
                else if(i==n/2) a[i] *= 1;
                else a[i] *= 2;
            }
            for (int i = 0; i < n; i++) sum += a[i];
        }else{
            int[] a2 = Arrays.copyOf(a,n);
            for (int i = 0; i < n; i++) {
                if(i<(n+1)/2-2) a[i] *= -2;
                else if(i<(n+1)/2) a[i]*= -1;
                else a[i] *= 2;
            }
            for (int i = 0; i < n; i++) {
                if(i<n/2) a2[i] *= -2;
                else if(i<n/2+2) a2[i] *= 1;
                else a2[i] *= 2;
            }
            for (int i = 0; i < n; i++) sum += a[i];
            for (int i = 0; i < n; i++) sum2 += a2[i];
        }
        out.println(Math.max(sum,sum2));
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