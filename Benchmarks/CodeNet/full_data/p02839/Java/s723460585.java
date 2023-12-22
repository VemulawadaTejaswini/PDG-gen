import java.util.Scanner;

/**
 * Balanced Path
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int[][] A = new int[H][W];
            int[][] B = new int[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            int K = (H + W) * 80;
            boolean[][][] x = new boolean[H][W][K];

            x[0][0][Math.abs(A[0][0] - B[0][0])] = true;

            for (int d = 0; d <= H + W - 2; d++) {
                for (int i = 0; i <= d; i++) {
                    int j = d - i;

                    if (i > H - 1 || j > W - 1) {
                        continue;
                    }

                    for (int k = 0; k < K; k++) {
                        if (!x[i][j][k]) {
                            continue;
                        }

                        if (i < H - 1) {
                            x[i + 1][j][Math.abs(k + A[i + 1][j] - B[i + 1][j])] = true;
                            x[i + 1][j][Math.abs(k - A[i + 1][j] + B[i + 1][j])] = true;
                        }
                        if (j < W - 1) {
                            x[i][j + 1][Math.abs(k + A[i][j + 1] - B[i][j + 1])] = true;
                            x[i][j + 1][Math.abs(k - A[i][j + 1] + B[i][j + 1])] = true;
                        }
                    }
                }
            }

            int ans = -1;
            for (int k = 0; k < K; k++) {
                if (x[H - 1][W - 1][k]) {
                    ans = k;
                    break;
                }
            }

            System.out.println(ans);
        }
    }

}
