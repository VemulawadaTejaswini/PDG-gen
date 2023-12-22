import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    public static int[] ans;
    public static Edge[] e;
    public static PriorityQueue<Integer> que;
    public static int sum;
    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        ans = new int[n];
        e = new Edge[n];
        sum = 0;
        for (int i = 0; i < n; i++) e[i] = new Edge();
        for (int i = 0; i < n - 1; i++) {
            int a = in.ni()-1, b = in.ni()-1;
            e[a].add(b);
            e[b].add(a);
        }
        que = new PriorityQueue<>();
        for (int i = 0; i < n; i++) que.add(-in.ni());
        ans[0] = -que.poll();
        dfs(-1, 0);
        out.println(sum);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ans[i]).append(' ');
        }
        out.println(sb.toString());
    }
    public static void dfs(int from, int now){
        for(Integer to: e[now]){
            if(to != from){
                if(!que.isEmpty()){
                    ans[to] = -que.poll();
                    sum += ans[to];
                }
                dfs(now, to);
            }
        }
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