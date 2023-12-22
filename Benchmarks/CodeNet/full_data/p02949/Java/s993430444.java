import java.util.Scanner;

/**
 * Coins Respawn
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int P = sc.nextInt();

            Edge[] E = new Edge[M];
            for (int i = 0; i < M; i++) {
                E[i] = new Edge();
                E[i].from = sc.nextInt() - 1;
                E[i].to = sc.nextInt() - 1;
                E[i].cost = -(sc.nextInt() - P);
            }

            long[] D = new long[N];
            for (int i = 1; i < N; i++) {
                D[i] = Long.MAX_VALUE;
            }

            long D_GOAL = Long.MAX_VALUE;

            for (int i = 0; i < N * 2; i++) {
                boolean update = false;

                for (Edge e : E) {
                    if (D[e.from] == Long.MAX_VALUE) {
                        continue;
                    }

                    if (D[e.to] > D[e.from] + e.cost) {
                        D[e.to] = D[e.from] + e.cost;
                        update = true;
                    }
                }

                if (!update) {
                    break;
                }

                if (i == N - 2) {
                    D_GOAL = D[N - 1];
                } else if (i > N - 2 && D_GOAL != D[N - 1]) {
                    System.out.println(-1);
                    return;
                }
            }

            long ans = -D[N - 1];
            if (ans < 0) {
                ans = 0;
            }

            System.out.println(ans);
        }
    }

    static class Edge {

        int from;

        int to;

        int cost;

    }

}
