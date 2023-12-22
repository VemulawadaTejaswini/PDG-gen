import java.io.*;
import java.util.*;
import java.util.zip.Inflater;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(),  k = in.ni();
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.ni();
            if(x < 0) L.add(-x);
            else if(x > 0) R.add(x);
            else k--;
        }
        long min = INF;
        if(k==0) min = 0;
        else if(L.isEmpty()){
            min = R.get(k-1);
        }else if(R.isEmpty()){
            Collections.sort(L);
            min = L.get(k-1);
        }else{
            Collections.sort(L);
            if(R.size() >= k) min = R.get(k-1);
            if(L.size() >= k) min = Math.min(min, L.get(k-1));
            for (int i = 0; i < k-1 && i < R.size(); i++) {
                if(k-i-2 >= L.size()) continue;
                min = Math.min(min, R.get(i)*2+L.get(k-i-2));
            }
            for (int i = 0; i < k-1 && i < L.size(); i++) {
                if(k-i-2 >= R.size()) continue;
                min = Math.min(min, L.get(i)*2+R.get(k-i-2));
            }
        }
        out.println(min);
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