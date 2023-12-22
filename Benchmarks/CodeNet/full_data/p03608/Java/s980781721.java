import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 2017/10/25 7:15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int R = sc.nextInt();
            int[] r = new int[R];
            int[][] t = new int[N][N];
            for (int i = 0; i < R; i++) {
                r[i] = sc.nextInt() - 1;
            }
            for (int i = 0; i < N; i++) {
                Arrays.fill(t[i], 999999999);
            }
            for (int i = 0; i < M; i++) {
                int A = sc.nextInt() - 1;
                int B = sc.nextInt() - 1;
                int C = sc.nextInt();
                t[A][B] = t[B][A] = C;
            }
            for (int k = 0; k < N; k++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        t[i][j] = Math.min(t[i][j], t[i][k] + t[k][j]);
                    }
                }
            }
            System.out.println(calcMinDist(0, new int[R], new boolean[R], r, t));
        }
    }

    private static int calcMinDist(int size, int[] perm, boolean[] used, int[] r, int[][] t) {
        if (size == r.length) {
            int res = 0;
            for (int i = 0; i < r.length - 1; i++) {
                int from = perm[i];
                int to = perm[i + 1];
                res += t[from][to];
            }
            return res;
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < r.length; i++) {
            if (used[i]) {
                continue;
            }
            perm[size] = r[i];
            used[i] = true;
            res = Math.min(res, calcMinDist(size + 1, perm, used, r, t));
            used[i] = false;
        }
        return res;
    }
}
