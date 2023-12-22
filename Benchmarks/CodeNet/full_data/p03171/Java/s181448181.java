/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    long max(long...x) {
        long rs = x[0];
        for(long y: x) rs = Math.max(rs, y);
        return rs;
    }

    long min(long...x) {
        long rs = x[0];
        for(long y: x) rs = Math.min(rs, y);
        return rs;
    }

    HashMap<Long, Long> mp;

    long go(long[] a, int n, int i, int j, int t) {
        if(i>j) {
            return 0;
        }
        if(i+1==j) {
            if(t==0) {
                return max(a[i]-a[j], a[j]-a[i]);
            }
            return min(a[i]-a[j], a[j]-a[i]);
        }
        long k = 10000000*i + j*10 + t;
        if(mp.containsKey(k)) return mp.get(k);

        long x = go(a, n, i+1, j, t^1) + (t==0?a[i]:-a[i]);
        long y = go(a, n, i, j-1, t^1) + (t==0?a[j]:-a[j]);
        
        long rs = max(x, y);
        if(t==1) rs = min(x, y);
        mp.put(k, rs);
        return rs;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        mp = new HashMap<Long, Long>();
        long rs = go(a, n, 0, n-1, 0);
        out.println(rs);
    }
    

    public static void main(String[] args) throws IOException {
        if(args.length>0 && args[0].equalsIgnoreCase("d")) {
            DEBUG_FLAG = true;
        }
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;//in.nextInt();
        long start = System.nanoTime();
        while(t-- >0) {
            new Main().solve(in, out);
        }
        long end = System.nanoTime();
        debug("\nTime: " + (end-start)/1e6 + " \n\n");
        out.close();
    }
    
    static boolean DEBUG_FLAG = false;
    static void debug(String s) {
        if(DEBUG_FLAG) System.out.print(s);
    }
    
    public static void show(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
    
    static class InputReader {
        static BufferedReader br;
        static StringTokenizer st;
    
        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}