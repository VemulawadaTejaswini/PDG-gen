import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static long[][] mindist;
    static int[][] graph;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        mindist = new long[110][110110]; // nowまでの最小のコスト
        graph = new int[110][110];

        // dp[0][0] = 0
        for (long[] longs : mindist) {
            Arrays.fill(longs, 0);
        }

        for (int[] longs : graph) {
            Arrays.fill(longs, 0);
        }

        // graph for input
        for (int i = 0; i < N; i++) {
            // scanner
            int w = scanner.nextInt();
            int v = scanner.nextInt();

            graph[i][0] = w; // weight
            graph[i][1] = v; // cost
        }

        for (int i = 0; i < N; i++) { // next_id
            for (int weight = 0; weight <= M; weight++) { // weight
                // buy
                if (weight >= graph[i][0]) {
                    if (mindist[i + 1][weight] < mindist[i][weight - graph[i][0]] + (long) graph[i][1]) {
                        mindist[i + 1][weight] = mindist[i][weight - graph[i][0]] + (long) graph[i][1];
                    }
                }

                // not buy
                if (mindist[i + 1][weight] < mindist[i][weight]) {
                    mindist[i + 1][weight] = mindist[i][weight];
                }
            }
        }

        System.out.println(mindist[N][M]);
    }
}
