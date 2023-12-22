/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    
    void go(ArrayList<ArrayList<Integer>> g, int v, int[] lvl, int d, HashSet<Long> set, int s) {
        long k = 100000l*v+d;
        if(set.contains(k)) {
            return;
        }
        // show(s, v, d);
        set.add(k);
        lvl[d]++;
        for(int u: g.get(v)) {
            go(g, u, lvl, d+1, set, s);
        }
    }

    int[] dfs(ArrayList<ArrayList<Integer>> g, int s) {
        int n = g.size();
        int[] lvl = new int[n];
        // HashSet<Long> set = new HashSet<>();
        // go(g, s, lvl, 0, set, s);
        // return lvl;
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        vis[s] = true;
        lvl[s] = 0;
        while(q.size()>0) {
            int v = q.remove();
            for(int u: g.get(v)) {
                if(vis[u]) continue;
                lvl[u] = lvl[v] + 1;
                q.add(u);
                vis[u] = true;
            }
        }
        return lvl;
    }


    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int x = in.nextInt()-1;
        int y = in.nextInt()-1;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for(int i=0; i<n; i++) g.add(new ArrayList<Integer>());
        for(int i=0; i<n-1; i++) {
            g.get(i).add(i+1);
            g.get(i+1).add(i);
        }
        g.get(x).add(y);
        g.get(y).add(x);
        // for(int[] a: g) show("", a);
        int[] c = new int[n+10];
        for(int i=0; i<n; i++) {
            int[] l = dfs(g, i);
            // show(i, l);
            for(int j=i+1; j<l.length; j++) {
                c[l[j]]++;//= l[j];
            }
        }
        for(int i=1; i<=n-1; i++) {
            out.println(c[i]);
        }
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