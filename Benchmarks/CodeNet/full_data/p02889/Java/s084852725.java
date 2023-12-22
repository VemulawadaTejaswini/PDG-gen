import java.util.*;

class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int L = scanner.nextInt();

        int[][] E = new int[N][N];
        for (int u = 0; u < N; u++) {
            for (int v = 0; v < N; v++) {
                E[u][v] = (u == v ? 0 : L + 1);
            }
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            E[a - 1][b - 1] = c;
            E[b - 1][a - 1] = c;
        }

        allpairsShortestPaths(E);

        for (int u = 0; u < N; u++) {
            for (int v = 0; v < N; v++) {
                E[u][v] = (E[u][v] <= L ? 1 : N + 1);
            }
        }

        allpairsShortestPaths(E);

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            int d = E[s - 1][t - 1];
            System.out.println(d < N ? d - 1 : -1);
        }
    }

    /** Floyd-Warshall algorithm */
    static void allpairsShortestPaths(int[][] D) {
        int N = D.length;
        for (int v = 0; v < N; v++) {
            for (int a = 0; a < N; a++) {
                for (int b = 0; b < N; b++) {
                    D[a][b] = Math.min(D[a][b], D[a][v] + D[v][b]);
                }
            }
        }
    }
}
