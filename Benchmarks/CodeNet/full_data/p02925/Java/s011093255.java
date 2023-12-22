import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        ArrayDeque<Integer>[] deq = new ArrayDeque[n];
        for (int i = 0; i < n; i++) {
            deq[i] = new ArrayDeque();
            for (int j = 0; j < n-1; j++) {
                deq[i].addLast(in.ni()-1);
            }
        }
        int ans = 0;
        int[] use = new int[n];
        boolean flag = true, update = true;
        while(flag){
            if(!update){
                ans = -1;
                break;
            }
            Arrays.fill(use, -1);
            flag = false;
            update = false;
            for (int i = 0; i < n; i++) {
                if(!deq[i].isEmpty()){
                    flag = true;
                    if(use[deq[i].peekFirst()]==-1){
                        use[i] = deq[i].peekFirst();
                    }else if(use[deq[i].peekFirst()]==i){
                        deq[deq[i].pollFirst()].pollFirst();
                        update = true;
                    }
                }
            }
            if(update)ans++;
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