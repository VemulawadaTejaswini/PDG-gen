import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        String S = in.ns();
        long ans = 0;
        if(S.length()==1){
            ans = Long.parseLong(S);
        }else{
            String format = "%".concat(String.valueOf(S.length()-1)).concat("s"), s;
            for (int i = 0; i < (1 << (S.length()-1)); i++) {
                s = String.format(format, Long.toString(i,2)).replace(' ', '0');
                ArrayDeque<Integer> deq = new ArrayDeque<>();
                for (int j = 0; j < s.length(); j++) {
                    if(s.charAt(j)=='1') deq.addFirst(j);
                }
                int l = 0, r;
                while(!deq.isEmpty()){
                    r = deq.pollLast();
                    ans += Long.parseLong(S.substring(l, r+1));
                    l = r+1;
                }
                ans += Long.parseLong(S.substring(l));
            }
        }
        out.println(ans);
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