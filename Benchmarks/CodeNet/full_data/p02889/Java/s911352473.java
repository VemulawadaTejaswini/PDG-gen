import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        long[][] graph = new long[N][N];
        int[] A = new int[M];int[] B = new int[M];int[] C = new int[M];
        for(int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
            graph[A[i] - 1][B[i] - 1] = C[i];
            graph[B[i] - 1][A[i] - 1] = C[i];
        }

        for(int i = 0; i < N; i++) {
            graph[i][i] = 0;
        }

        for(int k = 0; k < N; k++) {
            for(int i = 0; i < N; i++) {
                for(int j = i + 1; j < N; j++) {
                    if(graph[i][j] == 0) {
                        graph[i][j] = (long)10e10;
                    }
                    if(graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }

        long[][] floyd = new long[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                floyd[i][j] = graph[i][j] <= L ? 1 : (long)10e10;
            }
        }

        for(int k = 0; k < N; k++) {
            for(int i = 0; i < N; i++) {
                for(int j = i + 1; j < N; j++) {
                    if(floyd[i][j] > floyd[i][k] + floyd[k][j]) {
                        floyd[i][j] = floyd[i][k] + floyd[k][j];
                    }
                }
            }
        }

        int Q = sc.nextInt();
        for(int i = 0; i < Q; i++) {
            int s = sc.nextInt(); int t = sc.nextInt();
            long ans = -1;
            if(s > t) {
                ans = floyd[t-1][s-1] - 1;
            } else {
                ans = floyd[s-1][t-1] - 1;
            }
            if(ans >= (long)10e10 - 1) {
                System.out.println("-1");
            } else {
                System.out.println(ans);
            }
        }
    }
}