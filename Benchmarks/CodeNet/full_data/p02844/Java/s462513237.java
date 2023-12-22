import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;
    //MitsuiSumitomo2019 d
    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        char[] s = in.ns().toCharArray();
        int[][] place = new int[n][10];
        for (int i = 0; i < n; i++) for (int j = 0; j < 10; j++) place[i][j] = -1;
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j < 10; j++) {
                place[i][j] = place[i+1][j];
            }
            place[i][s[i+1]-'0'] = i+1;
        }
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            int next = place[0][i];
            if(s[0]-'0'==i) next = 0;
            if(next==-1) continue;
            for (int j = 0; j < 10; j++) {
                int next2 = place[next][j];
                if(next2==-1) continue;
                for (int k = 0; k < 10; k++) {
                    int next3 = place[next2][k];
                    if(next3==-1) continue;
                    ans++;
                }
            }
        }
        out.println(ans);
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