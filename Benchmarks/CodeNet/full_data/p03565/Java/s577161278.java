import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        char[] s = in.ns().toCharArray();
        char[] t = in.ns().toCharArray();
        PriorityQueue<String> ans = new PriorityQueue<>();
        out:for (int i = 0; i < s.length - t.length + 1; i++) {
            for (int j = 0; j < t.length; j++) {
                if(s[i+j]!=t[j]&&s[i+j]!='?') continue out;
            }
            char[] S = new char[s.length];
            for (int j = 0; j < i; j++) {
                if(s[j]=='?') S[j] = 'a';
                else S[j] = s[j];
            }
            for (int j = 0; j < t.length; j++) {
                S[j+i] = t[j];
            }
            for (int j = i+t.length; j < s.length ; j++) {
                if(s[j]=='?') S[j] = 'a';
                else S[j] = s[j];
            }
            ans.add(new String(S));
        }
        out.println(ans.isEmpty()?"UNRESTORABLE":ans.poll());
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