import java.util.*;
class Main {
    static int N,M;
    static int[] visited, x,y,edges;
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        visited = new int[N+1];
        edges = new int[M];
        for(int i = 0; i<N+1; i++) visited[i] = -1;
        x = new int[M];
        y = new int[M];
        for(int i = 0; i<M; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        dfs(1,1);
        System.out.println(M-ans);
    }
    public static void dfs(int node, int depth) {
        //System.out.println(node+" "+depth+" " + ans);
        if(visited[node] == -1) {
            visited[node] = depth;
        }
        else {
            //System.out.println(depth - visited[node]);
            int diff = depth - visited[node];
            visited[node] = depth;
            if(diff == 1) return;
            ans += diff;
            return;
        }
        for(int i = 0; i<M; i++) {
            if(x[i] == node) {
                if(edges[i] ==0) {
                    edges[i] = 1;
                    dfs(y[i], depth+1);
                }
            }
            if(y[i] == node) {
                if(edges[i] ==0) {
                    edges[i] = 1;
                    dfs(x[i], depth+1);
                }
            }
        }
    }
}