import java.io.*;
import java.util.*;

class Main {
    static int ans=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, List<Integer>> graph = new HashMap<>();

        for (int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            List<Integer> alist = graph.getOrDefault(a,new LinkedList());
            List<Integer> blist = graph.getOrDefault(b,new LinkedList());
            alist.add(b);
            blist.add(a);
            graph.put(a,alist);
            graph.put(b,blist);
        }
        HashSet<Integer> vis = new HashSet<>();
        dfs(1, n, vis, graph);
        System.out.println(ans);
    }

    public static void dfs(int cur, int n, HashSet<Integer> vis, HashMap<Integer, List<Integer>> graph){
        vis.add(cur);
        if (vis.size()==n){
            ans++;
            return;
        }
        for (int neigh: graph.get(cur)){
            if (!vis.contains(neigh)){
                HashSet<Integer> clone= new HashSet<>(vis);
                dfs(neigh, n, clone, graph);
            }
        }

    }



}
