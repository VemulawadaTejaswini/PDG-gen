import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    public static int[] num;
    public static Edge[] e;
    public static int n, k;

    static void solve(InputReader in, PrintWriter out){
        n = in.ni();
        k = in.ni();
        e = new Edge[n];
        num = new int[n];
        Arrays.fill(num, -1);
        for (int i = 0; i < n; i++) e[i] = new Edge();
        for (int i = 0; i < n-1; i++) {
            int from = in.ni()-1, to = in.ni()-1;
            e[from].add(to);
            e[to].add(from);
        }
        num[0] = k;
        long ans = 1;
        if(dfs(-1,0)){
            for (int i = 0; i < n; i++) {
                ans *= num[i];
                ans %= mod;
            }
            out.println(ans);
        }else out.println(0);
    }
    public static boolean dfs(int par, int child){
        boolean flag = true;
        int c = k-2;
        if(par==-1) c++;
        for(int i: e[child]){
            if(i!=par){
                if(c>0){
                    num[i] = c--;
                    flag = flag&&dfs(child, i);
                }
                else flag = false;
            }
        }
        return flag;
    }
    public static class Edge extends ArrayList<Integer>{}

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