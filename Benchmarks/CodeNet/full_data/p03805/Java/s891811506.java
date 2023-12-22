import java.util.*;

class Main{
    static boolean[] visited;
    static HashSet<Integer>[] map;
    static int ans;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ans = 0;
        visited = new boolean[N+1];
        map = new HashSet[N+1];
        for(int i=0;i<map.length;i++) map[i]=new HashSet<Integer>();
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a].add(b);
            map[b].add(a);
        }
        visited[1] = true;
        dfs(1);
        System.out.println(ans);
    }
    static void dfs(int i){
        boolean flag = true;
        for(int j=1;j<visited.length;j++) flag = flag&visited[j];
        if(flag) {
            ans++;
            return;
        }
        for(Integer w:map[i]){
            if(!visited[w]){
                visited[w] = true;
                dfs(w);
                visited[w] = false;
            }
        }
    }
}
