import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int C = in.nextInt();
            int[][] D = new int[C][C];
            for (int r = 0; r < C; r++) {
                for (int c = 0; c < C; c++) {
                    D[r][c] = in.nextInt();
                }
            }
            int[][] color = new int[N][N];
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    color[r][c] = in.nextInt() - 1;
                }
            }

            int[][] count = new int[3][C];
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    count[(r + c) % 3][color[r][c]]++;
                }
            }

            int min = (int) 1e9;
            for (int c1 = 0; c1 < C; c1++) {
                for (int c2 = 0; c2 < C; c2++) {
                    if (c2 == c1) {
                        continue;
                    }
                    for (int c3 = 0; c3 < C; c3++) {
                        if (c3 == c1) {
                            continue;
                        }
                        if (c3 == c2) {
                            continue;
                        }
                        int sum = 0;
                        for (int j = 0; j < C; j++) {
                            sum += count[0][j] * D[j][c1];
                            sum += count[1][j] * D[j][c2];
                            sum += count[2][j] * D[j][c3];
                        }
                        min = Math.min(min, sum);
                    }
                }
            }

            System.out.println(min);
        }
    }
}
