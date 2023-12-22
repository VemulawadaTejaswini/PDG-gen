import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/4;
    public static final int inf = Integer.MAX_VALUE/4;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        long W = in.nl(), w = in.nl();
        PriorityQueue<Long> w1 = new PriorityQueue<>(), w2 = new PriorityQueue<>(), w3 = new PriorityQueue<>(), w4 = new PriorityQueue<>();
        w1.add(in.nl());
        for (int i = 0; i < n - 1; i++) {
            int a = in.ni();
            if(a-w==0) w1.add(in.nl());
            else if(a-w==1) w2.add(in.nl());
            else if(a-w==2) w3.add(in.nl());
            else w4.add(in.nl());
        }
        long[] v1 = new long[w1.size()+1], v2 = new long[w2.isEmpty()?1:w2.size()+1], v3 = new long[w3.isEmpty()?1:w3.size()+1], v4 = new long[w4.isEmpty()?1:w4.size()+1];
        v1[0] = 0; int i = 1;
        while(!w1.isEmpty()){ v1[i] = w1.poll()+v1[i-1]; i++; }
        v2[0] = 0; i = 1;
        while(!w2.isEmpty()){ v2[i] = w2.poll()+v2[i-1]; i++; }
        v3[0] = 0; i = 1;
        while(!w3.isEmpty()){ v3[i] = w3.poll()+v3[i-1]; i++; }
        v4[0] = 0; i = 1;
        while(!w4.isEmpty()){ v4[i] = w4.poll()+v4[i-1]; i++; }
        long ans = 0;
        for (long j = 0; j < v1.length; j++) {
            B:for (long k = 0; k < v2.length; k++) {
                for (long l = 0; l < v3.length; l++) {
                    long weight = j*w+k*(w+1)+l*(w+2);
                    if(weight>W) continue B;
                    long sum = v1[(int)j]+v2[(int)k]+v3[(int)l];
                    long m = (W-weight)/(w+3);
                    ans = Math.max(ans, sum+v4[(int)Math.min(m, v4.length-1)]);
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