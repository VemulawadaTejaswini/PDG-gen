//package solution;

import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.awt.Point;

public final class Main {
    BufferedReader br;
    StringTokenizer stk;

    public static void main(String[] args) throws Exception {
        //new Thread(null, new Runnable() {
            //@Override
            //public void run() {
                //try {
                    new Main().run();
                //} catch(Exception ex) {ex.printStackTrace();}
            //}
        //}, "solution", 1<<26).start();
    }
    
    {
        stk = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    //long mod = 1000000007L;
    void run() throws Exception {
        int n = ni(), x = ni(), y = ni();
        HashSet<Integer>[] g = new HashSet[n];
        for(int i=0; i<n; i++) g[i] = new HashSet<>();
        for(int i=1; i<n; i++) {
            g[i-1].add(i); g[i].add(i-1);
        }
        g[x-1].add(y-1);
        g[y-1].add(x-1);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            int[] sp = shortestPath(i, g);
            for(int num : sp) {
                if(num == 0 || num == 9999999) continue;
                if(!map.containsKey(num))
                    map.put(num, 0);
                map.put(num, map.get(num) + 1);
            }
        }
        
        for(int i=1; i<n; i++) {
            if(map.containsKey(i)) {
                pl(map.get(i) >> 1);
            } else {
                pl("0");
            }
        }
    }
    
    int[] shortestPath(int src, HashSet<Integer>[] g) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(src);
        int[] cost = new int[g.length];
        Arrays.fill(cost, 9999999);
        cost[src] = 0;
        while(!queue.isEmpty()) {
            int cur = queue.remove();
            if(visited.contains(cur)) continue;
            visited.add(cur);
            for(int adj : g[cur]) {
                cost[adj] = Math.min(cost[adj], cost[cur] + 1);
                queue.add(adj);
            }
        }
        return cost;
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
}