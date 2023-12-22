import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;


    public static long count, N;
    public static HashMap<Long, Integer> map;
    static void solve(InputReader in, PrintWriter out){
        map = new HashMap<>();
        map.put(1l,1);
        N = in.nl();
        map.put(N,1);
        count = 1;
        for (long i = 2; i*i <= N; i++) {
            if(N%i==0){
                check(i);
                check(N/i);
            }
        }
        N--;
        for (long i = 1; i*i <= N; i++) {
            if(N%i==0){
                if(!map.containsKey(i)){
                    map.put(i,1);
                    count++;
                }
                if(!map.containsKey(N/i)){
                    map.put(N/i,1);
                    count++;
                }
            }
        }
        out.println(count);
    }
    public static void check(long x){
        long n = N;
        while(n%x==0) n /= x;
        if((n-1)%x==0){
            if(!map.containsKey(x)){
                map.put(x,1);
                count++;
            }
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