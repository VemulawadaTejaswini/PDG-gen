import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] ne = new boolean[n];
        Arrays.fill(ne, true);
        ArrayList<Integer>[] g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<n+m-1; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            ne[b] = false;
            g[a].add(b);
        }
        
        int root = -1;
        for(int i=0; i<n; i++){
            if(ne[i]){
                root = i;
                break;
            }
        }
        
        int[] dist = new int[n];
        Arrays.fill(dist, (int)1e9);
        dist[root] = 0;
        
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        q.add(root);
        while(q.size()!=0){
            int now = q.pollFirst();
            
            for(int j=0; j<g[now].size(); j++){
                int next = g[now].get(j);
                dist[next] = dist[now]+1;
                q.add(next);
            }
        }
        
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<g[i].size(); j++){
                int next = g[i].get(j);
                if(dist[i]+1 == dist[next]){
                    ans[next] = i+1;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            System.out.println(ans[i]);
        }
        
    }
}
