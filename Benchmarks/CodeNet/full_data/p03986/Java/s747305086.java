import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        char[] x = in.ns().toCharArray();
        int ans = 0;
        ArrayList<Integer> st = new ArrayList<>();
        int s = 0, t = 0;
        if(x[0]=='S') s = 1;
        else{
            t = 1;
            st.add(0);
        }
        for (int i = 1; i < x.length; i++) {
            if(x[i]=='S') {
                if(x[i-1]=='T') st.add(t);
                s++; t=0;
            }else if(x[i]=='T'){
                if(x[i-1]=='S') st.add(s);
                t++; s=0;
            }
        }
        if(x[x.length-1]=='S'){
            st.add(s);
            st.add(0);
        }else st.add(t);
        for (int i = 0; i+1 < st.size(); i += 2) {
            if(st.get(i)>st.get(i+1)){
                ans += st.get(i+1);
                if(i+2 < st.size()) st.add(i+2,st.get(i+2)+st.get(i)-st.get(i+1));
            }else{
                ans += st.get(i);
            }
        }

        out.println(x.length-ans*2);
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