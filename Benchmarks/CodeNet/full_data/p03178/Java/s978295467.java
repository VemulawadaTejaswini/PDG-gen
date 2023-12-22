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
    
    int[] s;
    int n, d;
    HashMap<Long, Long> mp;

    long go(int i, int t, int f) {
        if(i>=n) {
            if(t%d==0) return 1;
            else return 0;
        }
        long k = 100000000 * i + 100 * t + f;
        if(mp.containsKey(k)) return mp.get(k);
        long rs = 0;
        if(f==1) {
            for(int j=0; j<s[i]; j++) {
                rs += go(i+1, t+j, 0);
                rs %= MOD;
            }
            rs += go(i+1, t+s[i], 1);
            rs %= MOD;
        } else {
            for(int j=0; j<10; j++) {
                rs += go(i+1, t+j, 0);
                rs %= MOD;
            }
        }
        mp.put(k, rs);
        return rs;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        String k = in.next();
        d = in.nextInt();
        n = k.length();
        
        s = new int[n];
        for(int i=0; i<n; i++) {
            s[i] = k.charAt(i)-'0';
        }
        mp = new HashMap<Long, Long>();
        long rs = go(0, 0, 1);
        rs = (rs - 1 + MOD) % MOD;
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