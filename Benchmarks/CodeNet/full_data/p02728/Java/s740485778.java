import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] size; // size of subtree, including self
    List<Integer>[] graph;
    long[] dp,ans;
    final long mod = 1000000000+7;
    long[] frac,inv; // inv[i] = the inversion of i! mod M
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
        out.flush();
//        System.out.println(main.solve());
    }
    long solve() throws IOException{
        int n = sc.nextInt();
        size = new int[n]; dp = new long[n]; ans = new long[n];
        graph = new List[n];
        for(int i=0;i<n;i++) graph[i] = new ArrayList<>();
        ini(n+1);
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            graph[a].add(b); graph[b].add(a);
        }
        dfsSubTree(0,-1);
        ans[0] = dp[0];
        // then tree transform
        for(int to:graph[0]){
            dfsAns(to,0,n);
        }
        for(int i=0;i<n;i++) out.println(ans[i]);
        return 0;
    }
    void dfsSubTree(int root, int from){
        size[root] = 1;
        long base = 1;
        for(int to:graph[root]){
            if(to==from) continue;
            dfsSubTree(to,root);
            size[root] += size[to];
            base = base*dp[to]%mod*inv[size[to]]%mod;
        }
        base = base*frac[size[root]-1]%mod;
        dp[root] = base;
    }
    void dfsAns(int root, int from, int n){
        // to find the final ans of each root. a little bit tricky
        long base = ans[from];
        base = base*inv[n-1]%mod*frac[size[root]]%mod*power(dp[root],mod-2)%mod;
        base = base*frac[n-size[root]-1]%mod;
        base = base*inv[n-size[root]]%mod;
//        base = base*inv[size[root]-1]%mod*dp[root]%mod;
        for(int to:graph[root]){
            if(to==from) continue;
            base = base*dp[to]%mod*inv[size[to]]%mod;
        }
        base = base*frac[n-1]%mod;
        ans[root] = base;
        for(int to:graph[root]){
            if(to==from) continue;
            dfsAns(to,root,n);
        }
    }
    void ini(int n){
        frac = new long[n+1];
        inv = new long[n+1];
        frac[0] = 1; inv[0] = 1; inv[1] = 1;
        for(int i=1;i<=n;i++) frac[i] = i*frac[i-1]%mod;
        inv[n] = power(frac[n],mod-2);
        for(int i=n-1;i>1;i--){
            inv[i] = (i+1)*inv[i+1]%mod;
        }
    }
    long power(long base, long p){
        long ans = 1;
        while(p>0){
            if(p%2==1) ans = ans*base%mod;
            base = base*base%mod;
            p /= 2;
        }
        return ans;
    }
}

