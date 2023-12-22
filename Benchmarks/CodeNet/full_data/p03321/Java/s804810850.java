


import java.util.Scanner;

public class Main {

    public static boolean dfs(int n, int u, int c, int[] color, int[][] colorGraph) {
        color[u] = c;
        for (int v = 1; v <= n; ++v) {
            if (u == v || colorGraph[u][v] == 0) {
                continue;
            }
            if (color[v] == 0  && !dfs(n, v, -c, color, colorGraph)) {
                return false;
            }
            if (color[v] == c) {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final int [][] road = new int [n + 1][n + 1];
        for (int i = 0; i < m; ++i) {
            final int u = sc.nextInt();
            final int v = sc.nextInt();
            road[u][v] = 1;
            road[v][u] = 1;
        }

        final int [][] colorGraph = new int[n + 1][n + 1];

        for (int u = 1; u <= n; ++u) {
            for (int v = 1; v <= n; ++v) {
                if (u == v) {
                    continue;
                }
                if (road[u][v] != 1) {
                    colorGraph[u][v] = 1;
                    colorGraph[v][u] = 1;
                }
            }
        }

        //all nodes in colorGraph must be 2 color
        //check whether it's possible
        // color : 1 red
        // color : -1 white
        // color: 0 undefined
        final int[] color = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            if (color[i] == 0) {
                if (!dfs(n, i, 1, color, colorGraph)) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        //some node is color free
        for (int i = 1; i <= n; ++i) {
            boolean needColor = false;
            for (int v = 1; v <= n; ++v) {
                if (colorGraph[i][v] == 1) {
                    needColor = true;
                    break;
                }
            }
            if (!needColor) {
                color[i] = 0;
            }
        }
        int redColor = 0;
        int whiteColor = 0;
        for (int i = 1; i <= n; ++i) {
            if (color[i] == 1) {
                ++redColor;
            }
            if (color[i] == -1) {
                ++whiteColor;
            }
        }
        int freeColor = n - redColor - whiteColor;

        int minCount = Integer.MAX_VALUE;
        for (int x = 0; x <= freeColor; ++x) {
            int redCount = (redColor + x) * (redColor + x - 1) / 2;
            int whiteCount = (whiteColor + freeColor - x) *
                    (whiteColor + freeColor - x - 1) / 2;
            int count = redCount + whiteCount;
            if (minCount > count) {
                minCount = count;
            }
        }
        System.out.println(minCount);
    }
}
