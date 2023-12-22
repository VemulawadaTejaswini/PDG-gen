import java.io.*;
import java.util.*;

public class Main{
    PrintWriter out = new PrintWriter(System.out);
    ArrayList<Integer>[] graph;
    int[] prev;
    ArrayList<Integer> cycleList;
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        graph = new ArrayList[n+1];
        for(int i=0;i<=n;i++) graph[i] = new ArrayList<>();
        prev = new int[n+1];
        for(int i=0;i<m;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a].add(b);
        }
        int start = 0;
        for(int i=1;i<=n;i++){
            dfs(i,i,new boolean[n+1], new ArrayList<>());
            if(cycleList!=null&&cycleList.size()>2) break;
        }
        if(cycleList==null||cycleList.size()<=2) start = -1;
        else{
            start = cycleList.get(0);
            int len = cycleList.size();
            for(int i=0;i<len;i++){
                prev[cycleList.get(i)] = cycleList.get((i-1+len)%len);
            }
        }
        if(start<=0) return -1;
        //Then start != -1, we found a loop
        int newStart = 0;
        while((newStart=GetNewStart(start,n))!=start){
            start = newStart;
        }
        Set<Integer> ans = getLoopNode(start);
        out.println(ans.size());
        for(int w:ans) out.println(w);
        out.flush();
        System.exit(0);
        return -1;
    }
    int GetNewStart(int start, int n){
        Set<Integer> cycle = getLoopNode(start);
        for(int from:cycle){
            for(int to:graph[from]){
                if(!cycle.contains(to)) continue; // dont care
                if(prev[to]!=from){
                    // we found a "shorter" loop
                    prev[to]=from;
                    if(to==start) return from;
                    else return to;
                }
            }
        }
        return start;
    }
    Set<Integer> getLoopNode(int start){
        Set<Integer> ans = new HashSet<>(100);
        int cur = prev[start];
        ans.add(start);
        while(cur!=start){
            ans.add(cur);
            cur = prev[cur];
        }
        return ans;
    }
    void dfs(int cur, int start, boolean[] visit, ArrayList<Integer> list){
        if(cycleList!=null&&cycleList.size()>2) return;
        if(cur==start&&list.size()>2){
            cycleList = new ArrayList<>(list);
            return;
        }
        if(visit[cur]) return;
        visit[cur] = true;
        list.add(cur);
        for(int to:graph[cur]){
            dfs(to,start,visit,list);
        }
        list.remove(list.size()-1);
    }
}

