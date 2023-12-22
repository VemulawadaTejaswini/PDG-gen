import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        int m = in.nextInt();
        in.nextLine();

        char[][] maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            maze[i] = in.nextLine().toCharArray();
        }
        System.out.println(getMax(maze));
    }

    private static int getMax(char[][] maze) {
        int m = maze.length;
        int n = maze[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (maze[i][j] == '.') {
                    res = Math.max(res, bfs(maze, i, j));
                }
            }
        }
        return res;
    }

    private static int bfs(char[][] maze, int i, int j) {
        int m = maze.length;
        int n = maze[0].length;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        boolean[][] visited = new boolean[m][n];
        visited[i][j] = true;
        int res = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();
                for (int d = 0; d < 4; d++) {
                    int ni = cur[0] + dx[d];
                    int nj = cur[1] + dy[d];
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && !visited[ni][nj] && maze[ni][nj] == '.') {
                        q.offer(new int[]{ni, nj});
                        visited[ni][nj] = true;
                    }
                }
            }
            res++;
        }
        return res - 1;
    }

}
