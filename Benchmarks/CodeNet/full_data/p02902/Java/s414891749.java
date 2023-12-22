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
//            rec.add(start);
            HashMap<Integer,Integer> forbid = new HashMap<>();
            for(int t:graph[start]){
//                rec.add(t);
                dfs(start,start,rec, forbid);
//                rec.remove(t);
            }
            rec.remove(start);
        }
        return -1;
    }
    void dfs(int cur, int start, Set<Integer> visited, HashMap<Integer,Integer> forbid){
        if(forbid.containsKey(cur)) return;
        if(cur==start&&visited.size()>1){
            //
            for(int a:visited){
                if(forbid.containsKey(a)) return;
            }
            // find a loop as wanted
            out.println(visited.size());
            for(int v:visited) out.println(v);
            out.flush();
            System.exit(0);
        }
        if(!visited.add(cur)) return;
        for(int to:graph[cur]){
            AddElement(to,forbid);
        }
        for(int to:graph[cur]){
            decreaseElement(to,forbid);
            if(!forbid.containsKey(to)){
                dfs(to,start,visited,forbid);
            }
            AddElement(to,forbid);
        }
        for(int to:graph[cur]) decreaseElement(to, forbid);
        visited.remove(cur);
    }
    void AddElement(int target, HashMap<Integer,Integer> forbidden){
        forbidden.put(target,1+forbidden.getOrDefault(target,0));
    }
    void decreaseElement(int target, HashMap<Integer,Integer> forbidden){
        Integer val = forbidden.getOrDefault(target,0);
        if(val>1) forbidden.put(target,val-1);
        else forbidden.remove(target);
    }
}

