import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    long mod = 1000000000+7;
    int n;
    long[] frac, inv;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        // it's all about implementation
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
        int m = sc.nextInt();
        Set<Long> edges = new HashSet<>(m);
        for(int i=0;i<m;i++){
            // u,v < n
            long u = sc.nextLong()-1, v = sc.nextLong()-1;
            edges.add(u*n+v);
        }
        int S = sc.nextInt()-1, T = sc.nextInt()-1;
        ArrayList<Integer>[] graph = GraphFromEdges(edges);
        // use bfs to get new graph
        edges = GetNewEdges(graph);
        graph = GraphFromEdges(edges);
        int step = 0;
        List<Integer> cur = new LinkedList<>(), next = new LinkedList<>();
        cur.add(S);
        boolean[] vis = new boolean[n];
        vis[S] = true;
        while(cur.size()>0){
            for(int now:cur){
                for(int to:graph[now]){
                    if(vis[to]) continue;
                    if(to==T) return step+1;
                    vis[to] = true;
                    next.add(to);
                }
            }
            step += 1;
            cur = next;
            next = new LinkedList<>();
        }
        return -1;
    }
    ArrayList<Integer>[] GraphFromEdges(Set<Long> edges){
        ArrayList<Integer>[] ans = new ArrayList[n];
        for(int i=0;i<n;i++) ans[i] = new ArrayList<>();
        for(long e:edges){
            int u = (int) e/n, v = (int) e%n;
            ans[u].add(v);
        }
        return ans;
    }
    Set<Long> GetNewEdges(ArrayList<Integer>[] graph){
        Set<Long> ans = new HashSet<>(n);
        for(int start=0;start<n;start++){
            HashSet<Integer> cur = new HashSet<>(n/2+1), next = new HashSet<>(n/2+1);
            cur.add(start);
            for(int step=0;step<3&&cur.size()>0;step++){
                for(int now:cur){
                    for(int to:graph[now]) next.add(to);
                }
                cur = next;
                next = new HashSet<>(n/2+1);
            }
            for(int to:cur){
                if(to==start) continue;
                ans.add(start*(long)n+to);
            }
        }
        return ans;
    }
}

