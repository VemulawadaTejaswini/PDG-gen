/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    long max(long...x) {long rs = x[0]; for(long y: x) rs = Math.max(rs, y); return rs;}
    long min(long...x) {long rs = x[0]; for(long y: x) rs = Math.min(rs, y); return rs;}
    

    int n;
    ArrayList<ArrayList<Integer>> g;
    HashMap<Long, Long> mp;

    long go(int v, int c, int p) {
        long k = 100l*v + c;
        if(mp.containsKey(k)) return mp.get(k);

        long rs = 1;
        if(c==0) {
            for(int u: g.get(v)) {
                if(u!=p) {
                    long x = (go(u, 0, v) + go(u, 1, v))%MOD;
                    rs = (rs * x) % MOD;
                }
            }
        } else {
            for(int u: g.get(v)) {
                if(u!=p) {
                    long x = go(u, 0, v);
                    rs = (rs * x) % MOD;
                }
            }
        }
        mp.put(k, rs%MOD);
        return rs%MOD;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        n = in.nextInt();
        g = new ArrayList<>();
        for(int i=0; i<n; i++) g.add(new ArrayList<>());
        for(int i=0; i<n-1; i++) {
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            g.get(x).add(y);
            g.get(y).add(x);
        }
        mp = new HashMap<>();
        long rs = go(0, 0, -1);
        rs = (rs + go(0, 1, -1))%MOD;
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