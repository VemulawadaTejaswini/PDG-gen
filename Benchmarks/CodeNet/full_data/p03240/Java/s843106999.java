import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        pair sp = new pair();
        int x = 0, y = 0, h = 0;
        pair[] p = new pair[n];
        for (int i = 0; i < n; i++) {
            x = in.ni(); y = in.ni(); h = in.ni();
            if(i==0){
                sp.x = x; sp.y = y; sp.h = h;
            }
            p[i] = new pair();
            p[i].x = x; p[i].y = y; p[i].h = h;
        }
        out:for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                h = sp.h + Math.abs(sp.x-i)+Math.abs(sp.y-j);
                boolean flag = true;
                for(pair a: p){
                    if(a.h != h-Math.abs(a.x-i)-Math.abs(a.y-j)&&a.h!=0) flag = false;
                }
                if(flag){
                    out.printf("%d %d %d", i, j, h);
                    break out;
                }
            }
        }
    }
    public static class pair{
        int x, y, h;
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