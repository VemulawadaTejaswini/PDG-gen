import java.util.*;

public class Main{
    public static int[][] ans;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer>[] g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }
        int[] as = new int[n];
        int[] bs = new int[n];
        
        int k = 0;
        
        for(int i=0; i<n-1; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            as[i] = a;
            bs[i] = b;
            g[a].add(b);
            g[b].add(a);
            k = Math.max(k, g[a].size());
            k = Math.max(k, g[b].size());
        }
        
        ans = new int[n][n];
        boolean[] used = new boolean[n];
        used[0] = true;
        int[] par = new int[n];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addFirst(0);
        while(q.size() != 0){
            int now = q.removeLast();
            int cnt = 0;
            for(int i=0; i<g[now].size(); i++){
                int next = g[now].get(i);
                if(!used[next]){
                    cnt++;
                    if(cnt == par[now]) cnt++;
                    par[next] = cnt;
                    ans[now][next] = cnt;
                    ans[next][now] = cnt;
                    used[next] = true;
                    q.addFirst(next);
                }
            }
        }
        
        System.out.println(k);
        for(int i=0; i<n-1; i++){
            System.out.println(ans[as[i]][bs[i]]);
        }
    }
}
