import java.util.Scanner;

/**
 * Created by zzt on 17-1-16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int L = scanner.nextInt();

        boolean[][] roadC = new boolean[N][N];
        boolean[][] railwayC = new boolean[N][N];

        int[] ret = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                roadC[i][j] = railwayC[i][j] = i == j;
            }
        }

        int p, q, r, s;
        for (int i = 0; i < K; i++) {
            p = scanner.nextInt() - 1;
            q = scanner.nextInt() - 1;
            roadC[p][q] = roadC[q][p] = true;
        }

        for (int i = 0; i < L; i++) {
            r = scanner.nextInt() - 1;
            s = scanner.nextInt() - 1;
            railwayC[r][s] = railwayC[s][r] = true;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (k != i && k != j) {
                        if (roadC[i][k] && roadC[k][j])
                            roadC[i][j] = true;
                        if (railwayC[i][k] && railwayC[k][j])
                            railwayC[i][j] = true;
                    }
                }
            }
        }

        StringBuilder b = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (roadC[i][j] && railwayC[i][j])
                    ret[i]++;
            }
            b.append(ret[i]).append(" ");
        }
        System.out.println(b.toString().trim());
    }
}