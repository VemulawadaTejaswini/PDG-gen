import java.util.*;

public class Main {
    static List<int[]>[] to;
    static long[] dist;
    static int n;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        // to: 隣接リスト(無向)
        to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<int[]>();
        }
        for (int i = 0; i < n - 1; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            int dis = sc.nextInt();
            to[p].add(new int[]{q, dis});
            to[q].add(new int[]{p, dis});
        }
        
        // 点kから各点までの距離を計算 
        int query = sc.nextInt();
        int k = sc.nextInt() - 1;
        long[] distK = calcDist(k);
        
        // p→k→qの最短距離を出力
        while (query-- > 0) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            
            System.out.println(distK[p] + distK[q]);
        }
    }
    
    public static long[] calcDist(int p) {
        dist = new long[n];
        dfs(p, 0, -1);
        return dist;
    }
    
    // 頂点pと隣接する点に自分の値+距離を配る
    public static void dfs(int p, long d, int par) {
        dist[p] = d;
        
        for (int[] q : to[p]) {
            if (q[0] == par) continue;
            dfs(q[0], d + q[1], p);
        }
    }
}
