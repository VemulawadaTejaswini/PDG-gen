import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int x = in.ni(), y = in.ni();
        int a = in.ni(), b = in.ni(), c = in.ni();
        int[] p = in.ni(a), q = in.ni(b), r = in.ni(c);
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        ArrayDeque<Integer> P = new ArrayDeque<>();
        for (int i = 0; i < x; i++) P.addFirst(-p[i]);
        ArrayDeque<Integer> Q = new ArrayDeque<>();
        for (int i = 0; i < y; i++) Q.addFirst(-q[i]);
        ArrayDeque<Integer> R = new ArrayDeque<>();
        for (int i = 0; i < r.length; i++) R.addFirst(-r[i]);

        long ans = 0;
        while(!P.isEmpty()||!Q.isEmpty()){
            if(R.isEmpty()){
                while(!P.isEmpty()) ans += P.pollLast();
                while(!Q.isEmpty()) ans += Q.pollLast();
            }else{
                if(P.isEmpty()){
                    if(Q.peekLast()>R.peekLast()) ans += Q.pollLast();
                    else{
                        ans += R.pollLast();
                        Q.pollFirst();
                    }
                }else if(Q.isEmpty()){
                    if(P.peekLast()>R.peekLast()) ans += P.pollLast();
                    else{
                        ans += R.pollLast();
                        P.pollFirst();
                    }
                }else{
                    if(P.peekLast()<R.peekLast()&&Q.peekLast()<R.peekLast()){
                        if(P.peekFirst()<Q.peekFirst()){
                            ans += R.pollLast();
                            P.pollFirst();
                        }else{
                            ans += R.pollLast();
                            Q.pollFirst();
                        }
                    }else{
                        if(P.peekLast()>R.peekLast()) ans += P.pollLast();
                        else ans += Q.pollLast();
                    }
                }
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
                a[i] = -ni();
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