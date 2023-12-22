import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int ans = solve(N, M, a, b);

        System.out.println(ans);
    }

    private static int solve(int N, int M, int[] a, int[] b) {
        int count = 0;

        int[][] g = new int[N][N];
        for (int i=0; i<M; i++) {
            g[a[i]-1][b[i]-1] = 1;
        }

        /* debug print graph
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }
        */

        for (int i=0; i<M; i++) {
            if (!isConnected(N, M, a, b, g, i)) {
                count++;
            }
        }

        return count++;
    }

    /*
     * i番目の辺を除外したときもグラフは連結か
     */
    private static boolean isConnected(int N, int M, int[] a, int[] b, int[][] g, int i) {
        boolean[] f = new boolean[N];

        dfs(N, g, a[i]-1, b[i]-1, f, 0);
        
        /* debug print flag
        for (int j=0; j<N; j++) {
            System.err.print(" " + f[j]);
        }
        System.err.println();
        */

        boolean result = true;
        for (int j=0; j<N; j++) {
            result &= f[j];
        }

        return result;
    }

    private static void dfs(int N, int[][] g, int a, int b, boolean[] f, int pos) {
        if (f[pos]) return;
        f[pos] = true;

//        System.err.println("dfs: pos=" + pos);
        for (int i=0; i<N; i++) {
//            System.err.println("[debug] check move to " + i);
            if (i == pos || f[i]) {
//                System.err.println("\talready checked");
                continue;
            }

            if (g[pos][i] == 1 || g[i][pos] == 1) {
//                System.err.println("\toriginally reachable node: " + i);
                if (a == pos && b == i || a == i && b == pos) {
//                    System.err.println("\texcluded for this condition: " + a + ", " + b);
                    continue;
                }

//                System.err.println("\tnext node: " + i);
                dfs(N, g, a, b, f, i);
            }
        }
    }
}