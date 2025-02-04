import java.util.*;

public class Main {
    static int MOD = 1000000007;
    static List<Integer>[] to;
    static long ans;
    static int k;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        
        // to: 隣接リスト
        to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n - 1; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            to[s].add(t);
            to[t].add(s); 
        }
        
        // ans: 子を、自分と親と被らない色で塗るパターン数
        // 頂点0だけ親がいないので別処理
        ans = k;
        if (to[0].size()+1 > k) {
            ans = 0;
        }
        ans = ans * nPkMOD(k-1, to[0].size(), MOD);
        ans %= MOD;
        // 親がいる点についてdfs
        for (Integer q : to[0]) {
            dfs(q, 0);
        }
        if (ans < 0) ans = 0;
        System.out.println(ans);
        
    }
    
    public static void dfs(int p, int par) {
        if (to[p].size()+1 > k) {
            ans = 0;
            return;
        }
        ans = ans * nPkMOD(k-2, to[p].size()-1, MOD);
        ans %= MOD;
        for (Integer q : to[p]) {
            if (q == par) continue;
            dfs(q, p);
        }
    }
    
    public static int nPkMOD(int n, int k, int mod) {
        int res = 1;
        for (int i = n; i > n-k; i--) {
            res = res * i % mod;
        }
        
        return res;
    }
}