import java.util.Scanner;
import java.util.Arrays;
 
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt(), R = in.nextInt();
        int[] r = new int[R];
        int[][] dist = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], 100001);
        }
        for (int i = 0; i < R; i++) {
            r[i] = in.nextInt() - 1;
        }
        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1, b = in.nextInt() - 1, c = in.nextInt();
            dist[a][b] = dist[b][a] = c;
        }
        in.close();
        for(int k = 0; k < N; k++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        boolean[] visited = new boolean[R];
        for(int i = 0; i < R; i++){
            visited[i] = true;
            min = Math.min(min, dfs(0, i, visited, r, dist));
            visited[i] = false;
        }
        System.out.println(min);
    }
    public static int dfs(int cost, int pos, boolean[] visited, int[] r, int[][] dist){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < visited.length; i++){
            if(i == pos) continue;
            if(!visited[i]){
                visited[i] = true;
                min = Math.min(min, dfs(cost + dist[r[pos]][r[i]], i, visited, r, dist));
                visited[i] = false;
            }
        }
        return min == Integer.MAX_VALUE ? cost : min;
    }
}