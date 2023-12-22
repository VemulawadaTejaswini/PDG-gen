import java.util.*;

public class Main {
    static int max = -1;
    static Set<Integer>[] from;
    static Set<Integer>[] to;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        from = new Set[n];
        for (int i = 0; i < n; i++) {
            from[i] = new HashSet<Integer>();
        }
        to = new Set[n];
        for (int i = 0; i < n; i++) {
            to[i] = new HashSet<Integer>();
        }
        
        // リストの作成
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            from[t].add(s);
            to[s].add(t);
        }
        
        // que: 親がいない点のキュー
        Queue<Integer> que = new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {
            if (from[i].size() == 0) {
                que.add(i);
            }
        }
        
        // counter[i]: 点iまでの最長距離
        int[] counter = new int[n];
        
        while (!que.isEmpty()) {
            int p = que.poll();
            for (Integer q : to[p]) {
                counter[q] = Math.max(counter[q], counter[p] + 1);
                max = Math.max(max, counter[q]);
                from[q].remove(p);
                
                if (from[q].size() == 0) {
                    que.add(q);
                }
            }
        }
        
        System.out.println(max);
    }
    // 頂点pと隣接する点に自分の値+1を配ることで距離を与える
    public static void dfs(int p, int d, int par) {
        max = Math.max(max, d);
        
        for (Integer q : to[p]) {
            if (q == par) continue;
            
            dfs(q, d+1, p);
        }
    }
}