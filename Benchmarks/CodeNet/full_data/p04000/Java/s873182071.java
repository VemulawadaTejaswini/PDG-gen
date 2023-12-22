import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        long h = in.nl(), w = in.nl();
        int n = in.ni();
        int[] dx = new int[]{0,0,1,1,1,0,-1,-1,-1};
        int[] dy = new int[]{0,1,1,0,-1,-1,-1,0,1};
        HashMap<Point, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = in.ni(), b = in.ni();
            for (int j = 0; j < 9; j++) {
                if(a+dx[j]<=1||a+dx[j]>=h||b+dy[j]<=1||b+dy[j]>=w) continue;
                Point p = new Point(a+dx[j], b+dy[j]);
                map.put(p, map.containsKey(p)?map.get(p)+1:1);
            }
        }
        long[] ans = new long[10];
        for(Point p: map.keySet()) ans[map.get(p)]++;
        ans[0] = (h-2)*(w-2)-map.size();
        for(long l: ans) out.println(l);
    }
    public static class Point{
        int x, y;
        public Point(int x, int y){
            this.x = x; this.y = y;
        }
        @Override
        public boolean equals(Object o){
            return ((Point)o).x==x&&((Point)o).y==y;
        }
        @Override
        public int hashCode(){
            long res = 114514;
            res *= x;
            res %= mod;
            res *= y;
            res %= mod;
            return (int)res;
        }
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