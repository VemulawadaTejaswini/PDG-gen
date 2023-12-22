import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    ArrayList<Integer>[] graph;
    PrintWriter out = new PrintWriter(System.out);
    // no self-loop or multiple edges
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        // binary search
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        graph = new ArrayList[n+1];
        for(int i=0;i<=n;i++) graph[i] = new ArrayList<>();
        for(int i=0;i<m;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a].add(b);
        }
        for(int start=1;start <=n;start++){
            Set<Integer> rec = new HashSet<>(n);
            rec.add(start);
            for(int t:graph[start]){
//                rec.add(t);
                dfs(t,start,rec);
//                rec.remove(t);
            }
        }
        return -1;
    }
    void dfs(int cur, int start, Set<Integer> visited){
        if(cur==start){
            // find a loop as wanted
            out.println(visited.size());
            for(int v:visited) out.println(v);
            out.flush();
            System.exit(0);
        }
        if(visited.contains(cur)) return;
        visited.add(cur);
        for(int t:graph[cur]){
            dfs(t,start,visited);
        }
        visited.remove(cur);
    }
}

