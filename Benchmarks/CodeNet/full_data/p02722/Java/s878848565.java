/*
[ ( ^ _ ^ ) ]
*/

// problem: practice/practice

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;


    long root(long n) {
        long l = 1, h = 1000_000_0;
        while(l<h) {
            long m = (l+h)/2;
            if(m*m<n) l = m+1;
            else h = m;
        }
        return l;
    }


    void solve(InputReader in, PrintWriter out) throws IOException {
        long n = in.nextLong();
        long r = root(n);

        long rs = 0;
        HashSet<Long> set = new HashSet<>();
        for(long i=2; i<=r; i++) {
            long x = n;
            while(x%i==0 && x>=i) {
                x /= i;
            }
            if(x>=i) x %= i;
            if(x==1) {
                set.add(i);
                x = n;
                long j = n/i;
                while(x%j==0 && x>=j) {
                    x /= j;
                }
                if(x>=j) x %= j;
                if(x==1) set.add(j);
            }
        }

        set.add(n);
        set.add(n-1);

        out.println(set.size());
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