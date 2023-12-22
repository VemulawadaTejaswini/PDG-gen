import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int h = in.ni(), w = in.ni(), d = in.ni();
        HashMap<Integer, Pair> map = new HashMap<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = in.ni()-1;
                map.put(a,new Pair(i,j));
            }
        }
        int[] arr = new int[h*w];
        for (int i = d; i < h * w; i++) {
            arr[i] = arr[i-d]+Math.abs(map.get(i).x-map.get(i-d).x)+Math.abs(map.get(i).y-map.get(i-d).y);
        }
        long sum;
        int q = in.ni(), l , r;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            sum = 0;
            l = in.ni()-1;
            r = in.ni()-1;
            sum += arr[r]-arr[l];
            sb.append(sum);
            sb.append("\n");
        }
        out.print(sb);
    }
    public static class Pair{
        int x; int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
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