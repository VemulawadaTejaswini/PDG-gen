import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int b[] = new int[m];
        int map[][] = new int[n][n];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            map[a[i]][b[i]] = 1;
            map[b[i]][a[i]] = 1;
        }
        boolean visited[] = new boolean[n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            map[a[i]][b[i]] = 0;
            map[b[i]][a[i]] = 0;
            Arrays.fill(visited, false);
            DFS(0, map, visited);
            int visitCount = 0;
            for (int j = 0; j < visited.length; j++) {
                if (visited[j]) {
                    visitCount++;
                }
            }
            if (visitCount == visited.length) {

            } else {
                ans++;
            }
            map[a[i]][b[i]] = 1;
            map[b[i]][a[i]] = 1;
        }
        System.out.println(ans);
        sc.close();
    }

    public static void DFS(int s, int[][] map, boolean[] visited) {
        for (int i = 0; i < map.length; i++) {
            if (!visited[i] && map[s][i] == 1) {
                visited[i] = true;
                DFS(i, map, visited);
            }
        }
    }
}
