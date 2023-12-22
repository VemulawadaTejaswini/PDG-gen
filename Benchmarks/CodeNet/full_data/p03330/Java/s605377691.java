import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] d = new int[c][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                d[i][j] = scanner.nextInt();
            }
        }
        int[][] a = new int[3][c];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[(i + j) % 3][scanner.nextInt() - 1]++;
            }
        }

        long ans = Long.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j)
                    continue;

                for (int k = 0; k < c; k++) {
                    if (i == k || j == k)
                        continue;

                    long disc = 0;
                    for (int l = 0; l < c; l++) {
                        disc += d[l][i] * a[0][l];
                    }
                    for (int l = 0; l < c; l++) {
                        disc += d[l][j] * a[1][l];
                    }
                    for (int l = 0; l < c; l++) {
                        disc += d[l][k] * a[2][l];
                    }
                    ans = Math.min(ans, disc);
                }
            }
        }

        System.out.println(ans);
    }
}