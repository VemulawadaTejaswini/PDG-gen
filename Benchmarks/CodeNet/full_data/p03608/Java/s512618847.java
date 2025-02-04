import java.util.*;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int R = scanner.nextInt();

        int[] r = new int[8];
        for (int i = 0; i < R; i++) {
            r[i] = scanner.nextInt();
            r[i]--;
        }

        int[][] g = new int[205][205];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                g[i][j] = 100000000;
            }
        }
        for (int i = 0; i < N; i++) {
            g[i][i] = 0;
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            a--; b--;

            g[a][b] = g[b][a] = c;
        }

        warshall(g, N);

        ArrayList<ArrayList<Integer>> order = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        boolean[] used = new boolean[205];
        Arrays.fill(used, false);
        dfs(order, tmp, r, 0, R, used);

        int ans = 100000000;
        for (ArrayList<Integer> it : order) {
            int sum = 0;
            for (int i = 0; i < it.size() - 1; i++) {
                sum += g[ it.get(i) ][ it.get(i + 1) ];
            }
            ans = min(ans, sum);
        }
        System.out.println(ans);
    }

    static void warshall(int[][] g, int n) {
        for (int k = 0;  k < n;  k++) {
            for (int i = 0;  i < n;  i++) {
                for (int j = 0; j < n; j++) {
                    g[i][j] = min(g[i][j], g[i][k] + g[k][j]);
                }
            }
        }
    }

    static void dfs(ArrayList<ArrayList<Integer>> order, ArrayList<Integer> cur, int[] r, int i, int R, boolean[] used) {
        if(i == R) {
            order.add(cur);
            return;
        }

        for (int j = 0; j < R; j++) {
            if (!used[ r[j] ]) {
                ArrayList<Integer> cp = (ArrayList<Integer>) cur.clone();

                cp.add(r[j]);
                used[ r[j] ] = true;
                dfs(order, cp, r, i + 1, R, used);
                used[ r[j] ] = false;
            }
        }
    }
}