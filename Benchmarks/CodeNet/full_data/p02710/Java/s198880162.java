import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    int[] child,color,count;
    long[] res;
    ArrayList<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
        out.flush();
    }
    void solve(){
        int n = sc.nextInt();
        child = new int[n]; color = new int[n]; count = new int[n]; res = new long[n];
        tree = new ArrayList[n];
        for(int i=0;i<n;i++) tree[i] = new ArrayList<>();
        for(int i=0;i<n;i++){
            color[i] = sc.nextInt()-1;
        }
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            tree[a].add(b); tree[b].add(a);
        }
        dfs(0,-1);
        long total = sum(n);
        for(int i=0;i<n;i++){
            long cur = total - sum(n-count[i]) - res[i];
            out.println(cur);
        }
    }
    void dfs(int cur, int from){
        int son = 1, temp = count[color[cur]];
        for(int to:tree[cur]){
            if(to==from) continue;
            count[color[cur]] = 0;
            dfs(to,cur);
            son += child[to];
            res[color[cur]] += sum(child[to]-count[color[cur]]);
        }
        child[cur] = son;
        count[color[cur]] = temp+son;
    }
    long sum(long n){return n*(n+1)/2;}
}

