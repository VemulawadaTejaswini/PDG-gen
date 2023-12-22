import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    List<Integer>[] tree;
    int n;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        out.println(main.solve());
        out.flush();
    }
    long solve() throws IOException {
        n = sc.nextInt();
        tree = new List[n];
        for(int i=0;i<n;i++) tree[i] = new ArrayList<>(25);
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            tree[a].add(b); tree[b].add(a);
        }
        int m = sc.nextInt();
        int[][] restri = new int[m][];
        for(int i=0;i<m;i++){
            int u = sc.nextInt()-1, v = sc.nextInt()-1;
            restri[i] = new int[]{u,v};
        }
        Set<Integer>[] white = new Set[m];
        for(int i=0;i<m;i++){
            int u = restri[i][0], v = restri[i][1];
            white[i] = getEdges(u,v);
        }
        long sub = 0; // how many illegal choices are there
        for(int state=1; state<(1<<m); state++){
            // then the relevant paths are all white
            int cnt = 0;
            Set<Integer> tot_white = new HashSet<>(50);
            for(int j=0; j<m; j++){
                int mask = 1<<j;
                if((mask&state)>0){
                    // we let this restriction unfulfilled
                    tot_white.addAll(white[j]);
                    cnt++;
                }
            }
            int remain = n-1-tot_white.size();
            if(cnt%2==1) sub += 1L<<remain;
            else sub -= 1L<<remain;
        }
        long ans = (1L<<(n-1))-sub;
        return ans;
    }
    Set<Integer> getEdges(int u, int v){
        int[] prev = new int[n];
        dfs(u,u,prev,v);
        Set<Integer> ans = new HashSet<>();
        // since prev[u] = u;
        while(prev[v]!=v){
            ans.add(getKey(v, prev[v]));
            v = prev[v];
        }
        return ans;
    }
    void dfs(int cur, int from, int[] prev, int target){
        prev[cur] = from;
        if(cur==target) return;
        for(int to:tree[cur]){
            if(to==from) continue;
            dfs(to, cur, prev, target);
        }
    }
    int getKey(int a, int b){
        return Math.min(a,b)*n+Math.max(a,b);
    }

}