import java.util.*;

public class Main {
    static int max = -1;
    static List<Integer>[] to;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        
        // リストの作成
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            to[s].add(t);
        }
        
        for (int i = 0; i < n; i++) {
            dfs(i, 0, -1);
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