//package solution;

import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;

public final class Main {
    BufferedReader br;
    StringTokenizer stk;

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
    
    {
        stk = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    void run() throws Exception {
        int n = ni(), m = ni();
        HashSet<Integer>[] g = new HashSet[n];
        for(int i=0; i<n; i++) g[i] = new HashSet<>();
        for(int i=0; i<m; i++) {
            int a = ni()-1, b = ni()-1;
            g[a].add(b);
        }
        int[] sorted = topSort(g);
        
        int[] cost = new int[n];
        Arrays.fill(cost, 1);
        for(int i=0; i<n; i++) {
            int cur = sorted[i];
            for(int adj : g[cur]) {
                if(cost[adj] < cost[cur] + 1) cost[adj] = cost[cur] + 1;
            }
        }
        
        int max = 1;
        for(int i=0; i<n; i++) max = Math.max(max, cost[i]);
        pl(max - 1);
    }
    
    int[] topSort(HashSet<Integer>[] g) {
        int n = g.length;
        int[] in = new int[n];
        for(int i=0; i<n; i++) {
            for(int adj : g[i]) in[adj]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++) if(in[i] == 0) queue.add(i);
        int visited = 0, sorted[] = new int[n];
        while(!queue.isEmpty()) {
            int cur = queue.remove();
            for(int adj : g[cur]) {
                in[adj]--; if(in[adj] == 0) queue.add(adj);
            }
            sorted[visited++] = cur;
            if(visited > n) return null;
        }
        return sorted;
    }
    
    //Reader & Writer
    String nextToken() throws Exception {
        if (stk == null || !stk.hasMoreTokens()) {
            stk = new StringTokenizer(br.readLine(), " ");
        }
        return stk.nextToken();
    }

    String nt() throws Exception {
        return nextToken();
    }

    String ns() throws Exception {
        return br.readLine();
    }

    int ni() throws Exception {
        return Integer.parseInt(nextToken());
    }

    long nl() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nd() throws Exception {
        return Double.parseDouble(nextToken());
    }

    void p(Object o) {
        System.out.print(o);
    }

    void pl(Object o) {
        System.out.println(o);
    }
    
    void selector() {
        Random rd = new Random();
        String[] s = new String[] {"Strings", "Sorting", "Search"
                , "Graph theory", "Greedy", "Dynamic programming"
                , "Constructive algos", "Bit manipulation", "Recursion"};
        pl(s[rd.nextInt(s.length)] + " " + (rd.nextInt(5)+1));
    }
}