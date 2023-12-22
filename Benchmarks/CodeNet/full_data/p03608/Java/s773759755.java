import java.util.*;

class Main{
    static int[] r;
    static int[][] map;
    static long ans = Long.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        r = new int[R+1];
        for(int i=1;i<=R;i++) r[i] = sc.nextInt();
        int[] A = new int[M+1];
        int[] B = new int[M+1];
        int[] C = new int[M+1];
        for(int i=1;i<=M;i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        int[][] g = new int[N+1][N+1];
        for(int row=1;row<=N; row++){
            for(int col=1; col<=N; col++) {
                if(row==col) g[row][col]=0;
                else g[row][col] = 1234567899;
            }
        }
        for(int i=1;i<=M;i++){
            int a = A[i];
            int b = B[i];
            g[a][b] = C[i];
            g[b][a] = C[i];
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                for(int k=1;k<=N;k++){
                    g[j][k] = Math.min(g[j][k], g[j][i]+g[i][k]);
                }
            }
        }
        map = new int[R+1][R+1];
        for(int row=1; row<=R; row++){
            for(int col=1; col<=R; col++){
                map[row][col] = g[r[row]][r[col]];
            }
        }
        for(int i=1;i<=R;i++){
            boolean[] visited = new boolean[R+1];
            dfs(i,visited,0);
        }
        System.out.println(ans);
    }
    private static void dfs(int start, boolean[] visited, long sum){
        boolean[] newVis = new boolean[visited.length];
        for(int i=1;i<newVis.length;i++) if(visited[i]) newVis[i] = true;
        newVis[start] = true;
        boolean flag = true;
        for(int i=1;i<visited.length;i++) flag = flag&newVis[i];
        if(flag) ans = Math.min(sum,ans);
        long res = Long.MAX_VALUE;
        for(int i=1;i<r.length;i++){
            if(!newVis[i]){
                dfs(i,newVis,map[i][start]+sum);
            }
        }
    }
}
