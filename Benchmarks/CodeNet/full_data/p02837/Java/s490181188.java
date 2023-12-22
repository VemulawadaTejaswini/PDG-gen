import java.util.Scanner;

/**
 * HonestOrUnkind2
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[] A = new int[N];
            int[][] X = new int[N][N];
            int[][] Y = new int[N][N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                for (int j = 0; j < A[i]; j++) {
                    X[i][j] = sc.nextInt() - 1;
                    Y[i][j] = sc.nextInt();
                }
            }

            int ans = 0;

            for (int i = 1; i < (1 << N); i++) {
                int ans2 = 0;

                long[] honest = new long[N];
                for (int j = 0; j < N; j++) {
                    honest[j] = (i >> j) & 1;
                }

                for (int j = 0; j < N; j++) {
                    if (honest[j] == 1) {
                        ans2++;

                        for (int k = 0; k < A[j]; k++) {
                            if (honest[X[j][k]] != Y[j][k]) {
                                ans2 = -1;
                                j = N;
                                break;
                            }
                        }
                    }
                }

                ans = Math.max(ans, ans2);
            }

            System.out.println(ans);
        }
    }

}
