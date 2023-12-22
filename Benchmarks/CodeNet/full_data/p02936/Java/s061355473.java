import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[][] graph = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a - 1][b - 1] = 1;
        }

        long[] count = new long[n];
        for (int i = 0; i < q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            count[p - 1] += x;
            countChildren(graph, count, p - 1, n, x);
        }

        for (long c : count) {
            System.out.print(c + " ");
        }
        sc.close();
    }

    private static void countChildren(int[][] graph, long[] count, int pIdx, int n, int x) {
        for (int j = pIdx + 1; j < n; j++) {
            if (graph[pIdx][j] == 1) {
                count[j] += x;
                countChildren(graph, count, j, n, x);
            }
        }
    }
}
